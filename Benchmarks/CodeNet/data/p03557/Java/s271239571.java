import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // {
        // StringBuilder sb = new StringBuilder();
        // int N = 10000;
        // sb.append(N);
        // sb.append("\n");
        // for (int i = 0; i < N; i++) {
        // sb.append((int) (1e2 * Math.random()) + " ");
        // }
        // sb.append("\n");
        // for (int i = 0; i < N; i++) {
        // sb.append((int) (1e2 * Math.random()) + " ");
        // }
        // sb.append("\n");
        // for (int i = 0; i < N; i++) {
        // sb.append((int) (1e2 * Math.random()) + " ");
        // }
        // sb.append("\n");
        //
        // if (Math.random() < 2) {
        // System.out.println(sb.toString());
        // return;
        // }
        // }

        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int[][] ABC = new int[3][N];
            for (int i = 0; i < N; i++) {
                ABC[0][i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                ABC[1][i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                ABC[2][i] = in.nextInt();
            }
            Arrays.sort(ABC[0]);
            Arrays.sort(ABC[1]);
            Arrays.sort(ABC[2]);

            long count = 0;
            int previous0 = 0;
            int previous1 = 0;
            int previous2 = 0;
            long[] b = new long[100002];
            // Arrays.fill(b, -1);
            for (int i = previous0; i < ABC[0].length; i++) {
                previous2 = 0;
                for (int j = previous1; j < ABC[1].length; j++) {
                    if (ABC[1][j] <= ABC[0][i]) {
                        continue;
                    }
                    if (j - 1 >= 0 && ABC[1][j - 1] <= ABC[0][i] && ABC[1][j] > ABC[0][i]) {
                        previous1 = j;
                    }

                    if (i > 0) {
                        count += b[j];
                    }

                    long current = count;
                    for (int j2 = previous2; j2 < ABC[2].length; j2++) {
                        if (ABC[2][j2] > ABC[1][j]) {
                            previous2 = j2;
                            count += ABC[2].length - j2;
                            Utils.debug(ABC[0][i], ABC[1][j], ABC[2][j2]);
                            break;
                        }
                    }
                    b[j] = count - current;
                }

            }

            // for (int i = 0; i < dp.length; i++) {
            // Arrays.fill(dp[i], -1);
            // }
            // long count = dfs(0, -1, ABC);

            System.out.println(count);
        }
    }

    private static long[][] dp = new long[3][(int) (1e5 + 2)];

    private static long dfs(int i, int abi, int[][] a) {

        if (i == 2) {
            if (dp[i][a[i - 1][abi]] != -1) {
                return dp[i][a[i - 1][abi]];
            }
            long count = 0;
            int binarySearch = Arrays.binarySearch(a[i], a[i - 1][abi] + 1);
            if (binarySearch < 0) {
                binarySearch *= -1;
                binarySearch -= 1;
                dp[i][a[i - 1][abi]] = a[i].length - binarySearch;
                return a[i].length - binarySearch;
            }
            // for (int j = 0; j < a[i].length; j++) {
            // if (a[i][j] > a[i - 1][abi]) {
            // count++;
            // }
            // }
            dp[i][a[i - 1][abi]] = a[i].length - (binarySearch - 1);
            return a[i].length - (binarySearch - 1);
        }
        if (i == 1) {

            if (dp[i][a[i - 1][abi]] != -1) {
                return dp[i][a[i - 1][abi]];
            }

            long count = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > a[i - 1][abi]) {
                    count += dfs(i + 1, j, a);
                }
            }
            dp[i][a[i - 1][abi]] = count;
            return count;
        }

        long count = 0;
        for (int j = 0; j < a[i].length; j++) {
            count += dfs(i + 1, j, a);
        }
        return count;
    }
}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        // System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
