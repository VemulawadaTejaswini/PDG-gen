import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

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

        out.println(maxProfit(wt, val, w, 0, new HashMap<>()));
        out.close();
    }

    private static long maxProfit(int[] wt, int[] val, int w, int ind, Map<String, Long> cache) {
        if (w < 0) {
            return Long.MIN_VALUE;
        }
        if (w == 0 || ind == wt.length) {
            return 0;
        }
        String key = ind + "#" + w;
        if (!cache.containsKey(key)) {
            long include = maxProfit(wt, val, w - wt[ind], ind + 1, cache) + val[ind];
            long exclude = maxProfit(wt, val, w, ind + 1, cache);
            cache.put(key, Math.max(include, exclude));
        }
        return cache.get(key);
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
