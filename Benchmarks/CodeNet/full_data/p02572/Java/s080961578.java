import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        
        // MODの数値間違ってた・・・
        long MOD = 1000000007L;

        int N = scanner.nextInt();
        int[] A = new int[N];
        long sum = 0L;

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();

            sum += A[i];

            // これ忘れてた
            sum %= MOD;
        }

        long result = 0L;
        for (int i = 0; i < N; i++) {
            sum -= A[i];

            if (sum < 0) {
                sum += MOD;
            }

            result += A[i] * sum;
            result %= MOD;
        }

        System.out.println(result);
    }
}