import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        ModScanner ms = new ModScanner();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int n = ms.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = ms.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        out.println(findTotalJumpCost(heights, 0, dp));
        out.close();
    }

    private static int findTotalJumpCost(int[] heights, int ind, int[] dp) {
        if (ind == heights.length - 1) {
            return 0;
        }

        if (dp[ind] != -1) {
            return dp[ind];
        }

        int cost = Math.abs(heights[ind] - heights[ind + 1]) + findTotalJumpCost(heights, ind + 1, dp);

        if (ind + 2 < heights.length) {
            cost = Math.min(cost, Math.abs(heights[ind] - heights[ind + 2]) + findTotalJumpCost(heights, ind + 2, dp));
        }

        return dp[ind] = cost;
    }

}

class ModScanner {

    BufferedReader br;
    StringTokenizer st;

    public ModScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    String nextString() throws Exception {
        return br.readLine();
    }


    int nextInt() throws Exception, Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }

}
