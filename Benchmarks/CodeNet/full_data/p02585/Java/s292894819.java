//Created by Aminul on 8/15/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        int p[] = new int[n + 1];
        int arr[] = new int[n + 1];
        boolean vis[] = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }
        long res = Long.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (vis[i]) continue;
            ArrayDeque<Integer> g = new ArrayDeque<>();
            dfs(i, p, arr, vis, g);
            long temp = getMaxRes(g, k);
            res = max(res, temp);
        }

        pw.println(res);
        pw.close();
    }

    static void dfs(int pos, int[] p, int[] arr, boolean[] vis, ArrayDeque<Integer> g) {
        if (vis[pos]) return;
        vis[pos] = true;
        g.addLast(arr[pos]);
        dfs(p[pos], p, arr, vis, g);
    }

    static long getMaxRes(ArrayDeque<Integer> g, int k) {
        int n = g.size();
        long[] arr = new long[n + n + 1];
        int idx = 1;
        for (int i : g) {
            arr[idx++] = i;
        }

        for (int i : g) {
            arr[idx++] = i;
        }

        long maxVal = Long.MIN_VALUE;
        long copy[] = arr.clone();

        for (int i = 1; i <= n + n; i++) {
            arr[i] += arr[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            int j = i + min(n, k) - 1;
            long fullSum = arr[j] - arr[i - 1];
            long div = k / n;
            int rem = k % n;
            long partialSum = arr[i + rem - 1] - arr[i - 1];
            long sum = (fullSum * div) + partialSum;
            sum = max(sum, maxSubArraySum(copy, i, j));
            maxVal = max(maxVal, sum);
        }
        return maxVal;
    }

    static long maxSubArraySum(long a[], int start, int end) {
        long maxSoFar = Long.MIN_VALUE, maxEndingHere = 0;
        for (int i = start; i <= end; i++) {
            maxEndingHere = maxEndingHere + a[i];
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
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