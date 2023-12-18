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
        int k = ms.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = ms.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        out.println(findTotalJumpCost(heights, 0, dp, k));
        out.close();
    }

    private static int findTotalJumpCost(int[] heights, int ind, int[] dp, int k) {
        if (ind == heights.length - 1) {
            return 0;
        }

        if (dp[ind] != -1) {
            return dp[ind];
        }

        int minCost = Integer.MAX_VALUE;
        
        for (int i = ind + 1, j = 0; i < heights.length && j < k; i++, j++) {
            int cost = Math.abs(heights[ind] - heights[i]);
            minCost = Math.min(minCost, cost + findTotalJumpCost(heights, i, dp, k));
        }

        return dp[ind] = minCost;
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
