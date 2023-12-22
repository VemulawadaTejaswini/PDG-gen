//Created by Aminul on 9/26/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int OFFSET = 300000 + 5;
        SegTree_iterative segTree = new SegTree_iterative(OFFSET + OFFSET + 100);
        int n = in.nextInt(), k = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int l = x - k, r = x + k;
            x += OFFSET;
            l += OFFSET;
            r += OFFSET;
            int val = 1 + segTree.query(l, r);
            segTree.update(x, val);
            res = max(res, val);
        }

        pw.println(res);

        pw.close();
    }

    static class SegTree_iterative {
        int t[];
        int n;

        SegTree_iterative(int N) { // 0-based indexing
            t = new int[2 * N];
            n = t.length;
        }

        public int get(int i) {
            return t[i + n / 2];
        }

        public int operation(int a, int b) {
            return max(a, b); // chane to min(a, b) or (a+b) for different ops
        }

        public void update(int i, int value) {
            i += n / 2;
            t[i] = value;
            for (; i > 1; i >>= 1)
                t[i >> 1] = operation(t[i], t[i ^ 1]);
        }

        public int query(int a, int b) {
            int res = Integer.MIN_VALUE; // for sum, res = 0; for min, res = -inf ..etc
            for (a += n / 2, b += n / 2; a <= b; a = (a + 1) >> 1, b = (b - 1) >> 1) {
                if ((a & 1) != 0)
                    res = operation(res, t[a]);
                if ((b & 1) == 0)
                    res = operation(res, t[b]);
            }
            return res;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() throws Exception {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public int nextInt() throws Exception {
            return Integer.parseInt(next());
        }
    }
}