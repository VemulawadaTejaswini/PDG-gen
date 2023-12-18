import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        System.out.println(solve(N, K));
    }

    private static long solve(long N, long K) {
        return Math.min(N%K, Math.abs(K - N%K));
    }
}