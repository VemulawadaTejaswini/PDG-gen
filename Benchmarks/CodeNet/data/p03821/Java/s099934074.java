import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static final boolean TEST = false;

    static void debug(Object... os) {
        if (TEST) {
            StringBuilder sb = new StringBuilder(os.length);
            for (Object o : os)
                sb.append(o);
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            do {
                solve(in);
            } while (TEST);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        BigInteger[] A = new BigInteger[N], B = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            A[i] = BigInteger.valueOf(in.nextInt());
            B[i] = BigInteger.valueOf(in.nextInt());
        }
        BigInteger ans = BigInteger.ZERO;
        BigInteger accum = BigInteger.ZERO;
        for (int i = N - 1; i > -1; i--) {
            BigInteger delta = BigInteger.ZERO;
            A[i] = A[i].add(accum);
            if (A[i].compareTo(B[i]) < 0) {
                delta = B[i].subtract(A[i]);
            } else if (A[i].mod(B[i]).longValue() != 0) {
                delta = B[i].subtract(A[i].mod(B[i]));
            }
            A[i] = A[i].add(delta);
            accum = accum.add(delta);
            ans = ans.add(delta);
        }
        System.out.println(ans);
    }
}