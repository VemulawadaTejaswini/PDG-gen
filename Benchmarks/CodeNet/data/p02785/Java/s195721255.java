import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        for (int i=0; i<N; i++) {
            H[i] = sc.nextInt();
        }

        System.out.println(solve(N, K, H));
    }

    private static long solve(int N, int K, int[] H) {
        long count = 0;

        Arrays.sort(H);

        for (int i=0; i<N-K; i++) {
            count += H[i];
        }

        return count;
    }
}