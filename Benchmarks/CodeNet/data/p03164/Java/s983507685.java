import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int getInt() {
        try {
            return Integer.parseInt(READER.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] getIntArr(int n) {
        int[] ans = new int[n];

        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(READER.readLine(), " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n && stringTokenizer.hasMoreTokens(); i++) {
            ans[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        return ans;
    }

    private static long solve() {
        int[] nw = getIntArr(2);
        int n = nw[0];
        int w = nw[1];

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = Item.of(getIntArr(2));
        }
        return solveInternal(n, w, items);
    }

    private static long solveInternal(int n, int W, Item[] items) {
        int maxV = Stream.of(items).mapToInt(x -> x.v).max().getAsInt();
        int NA = W + 1;

        long[][] dp = new long[n + 1][maxV * n + 1];
        for (int v = 1; v <= maxV * n; v++) {
            dp[0][v] = NA;
        }

        for (int i = 1; i <= n; i++) {
            for (int v = 1; v <= maxV * n; v++) {
                Item item = items[i - 1];
                if (v < item.v) {
                    dp[i][v] = dp[i - 1][v];
                } else {
                    dp[i][v] = Math.min(dp[i - 1][v], dp[i - 1][v - item.v] + item.w);
                }
            }
        }

        long[] ws = dp[n];
        for (int v = ws.length - 1; v >= 0; v--) {
            if (ws[v] <= W) {
                return v;
            }
        }
//        for (int i = 0; i <= n; i++) {
//            for (int w = 0; w <= W; w++) {
//                System.out.println(String.format("dp[%s,%s]=%s", i, w, dp[i][w]));
//            }
//        }

        return 0;
    }


    public static final class Item {
        public final int v;
        public final int w;

        private Item(int w, int v) {
            this.v = v;
            this.w = w;
        }

        public static Item of(int[] arr) {
            return new Item(arr[0], arr[1]);
        }
    }

    public static void main(String... args) {
        System.out.println(solve());
//        System.out.println(
//                solveInternal(6, 15, new Item[]{
//                        new Item(6, 5),
//                        new Item(5, 6),
//                        new Item(6, 4),
//                        new Item(6, 6),
//                        new Item(3, 5),
//                        new Item(7, 2)
//                })
//        );
    }
}