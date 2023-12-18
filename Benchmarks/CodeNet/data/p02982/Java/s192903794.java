import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int d = in.nextInt();

        int[][] x = new int[n][d];
        for (int i=0; i < n; i++) {
            for (int j=0; j < d; j++) {
                x[i][j] = in.nextInt();
            }
        }

        int ans = 0;
        for (int i=0; i < n-1; i++) {
            for (int j=i+1; j < n; j++) {
                if (isSquared(distanceSquared(x[i], x[j])))
                        ans++;
            }
        }

        out.println(ans);

    }

    private static int distanceSquared(int[] vec1, int[] vec2) {
        int ret = 0;
        for (int i=0; i < vec1.length; i++) {
            ret += Math.pow(Math.abs(vec1[i] - vec2[i]), 2);
        }
        // System.out.println(ret);
        return ret;
    }

    private static boolean isSquared(int test) {
        return (double )test == Math.pow((int)Math.sqrt(test), 2);
    }

}
