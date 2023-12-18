import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int n = N; n <= 999; n++) {
            int a = n / 100;
            int b = (n / 10) % 10;
            int c = n % 10;
            if (a == b && b == c) {
                System.out.println(n);
                return;
            }
        }
    }
}
