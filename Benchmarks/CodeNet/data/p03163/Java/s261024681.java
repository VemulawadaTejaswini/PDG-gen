import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<String, Long> knapsack;

    public static void main(String[] args) throws Exception {

        ModScanner ms = new ModScanner();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int n = ms.nextInt();
        int w = ms.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = ms.nextInt();
            val[i] = ms.nextInt();
        }

        knapsack = new HashMap<>();

        out.println(maxProfit(wt, val, w, 0));
        out.close();
    }

    private static long maxProfit(int[] wt, int[] val, int w, int ind) {
        if (w <= 0 || ind >= wt.length) {
            return 0;
        }
        String key = ind + "#" + w;
        if (knapsack.containsKey(key)) {
            return knapsack.get(key);
        }
        long profit = maxProfit(wt, val, w, ind + 1);
        if (wt[ind] <= w) {
            profit = Math.max(maxProfit(wt, val, w - wt[ind], ind + 1) + val[ind], profit);
        }
        knapsack.put(key, profit);
        return profit;
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
