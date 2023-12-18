import afu.org.checkerframework.checker.igj.qual.I;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {

    static long mod = (long) (1e9 + 7);

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int[] wa = new int[n];
        int[] sa = new int[n];
        long[] va = new long[n];
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            wa[i] = in.nextInt();
            sa[i] = in.nextInt();
            va[i] = in.nextInt();
            items.add(new Item(wa[i], sa[i], va[i]));
        }
        Collections.sort(items);
        int wsum = 20500;
        long[] dp = new long[wsum + 1];

        for (int i = 0; i < n; i++) {
            Item itm = items.get(i);
            for (int j = Math.min(itm.s, wsum - itm.w); j >= 0; j--) {
                dp[j + itm.w] = Math.max(dp[j + itm.w], itm.val + dp[j]);
            }
        }
        long ans = 0;
        for (int i = 0; i < wsum; i++) {
            ans = Math.max(ans, dp[i]);
        }
        out.println(ans);
        out.close();
    }

    static class Item implements Comparable<Item> {
        int w;
        int s;
        long val;

        public Item(int w, int s, long val) {
            this.w = w;
            this.s = s;
            this.val = val;
        }

        @Override
        public int compareTo(Item o) {
            if ((w + s) == (o.s + o.w)) {
                return (w - o.w);
            } else {
                return Integer.compare((w + s), (o.s + o.w));
            }
        }
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}