import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextLong();
        }


        System.out.println(solve(N, A));
    }

    private static String solve(int N, long[] A) {
        BigInteger b = BigInteger.ONE;
        BigInteger th = BigInteger.valueOf(1_000_000_000_000_000_000L);

        for (int i=0; i<N; i++) {
            b = b.multiply(BigInteger.valueOf(A[i]));

            if (b.compareTo(th) > 0) return "-1";
        }


        return b.toString();
    }
}