import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solve(N, K));
    }

    private static long solve(int N, int K) {
        long sum = 0;

        for (int i=K; i<=N+1; i++) {
            long count = (long)i * ((2*N-i+1) - (i-1)) /2 + 1;
            sum += count%MOD;
            sum %= MOD;

            // System.err.println(i + ": " + sum);
        }


        return sum;
    }
}