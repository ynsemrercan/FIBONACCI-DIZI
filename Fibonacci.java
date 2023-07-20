import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisinin kaç elemanını görmek istersiniz?");
        int n = scanner.nextInt();

        int a = 0, b = 1, c;
        System.out.println("Fibonacci serisi:");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
