import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int K = sc.nextInt();

            int sum = 0;
            for (int i = 1; i <= K; i++) {
                for (int j = 1; j <= K; j++) {
                    for (int k = 1; k <= K; k++) {
                        sum += gcd(i, gcd(j, k));
                    }
                }
            }

            System.out.println(sum);
        }
    }

    public static final int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
