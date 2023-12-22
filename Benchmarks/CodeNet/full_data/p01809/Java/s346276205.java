import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int P = sc.nextInt();
        int Q = sc.nextInt();
        Q /= gcd(P, Q);
        int ans = 1;
        for (int i = 2; i * i <= Q; i++) {
            if (Q % i == 0) {
                while (Q % i == 0) {
                    Q /= i;
                }
                ans *= i;
            }
        }
        System.out.println(ans);
    }


    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}