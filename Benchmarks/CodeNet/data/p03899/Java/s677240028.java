import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }

    private static class Node {
        int parent;
        List<Integer> children = new ArrayList<>();
        int num;
        int maxDepth;

        public Node(int parent, int num) {
            this.parent = parent;
            this.num = num;
        }
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int[] logs = new int[n + 2];
        for (int i = 1; i < logs.length; i++) {
            logs[i] = calcLog(i);
        }

        long[] a = readLongArray(n, in);
        long[][] maxPrev = null;
        long[] dp = null;
        for (int i = 1; i <= k; i++) {
            dp = new long[n];
            for (int j = i - 1; j < n; j++) {
                if (maxPrev == null) {
                    dp[j] = a[j] * i;
                } else {
                    dp[j] = getMax(n, j - m, j, logs, maxPrev) + i * a[j];
                }
            }
            if (i < k) {
                maxPrev = getMaxRanges(dp);
            }
        }
        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        out.println(max);

        out.close();
    }


    private static long getMax(int n, int l, int r, int[] logs, long[][] maxRanges) {
        if (r > n) {
            r = n;
        }
        if (l < 0) {
            l = 0;
        }
        if (l >= r) {
            return 0;
        }

        int d = Math.abs(r - l);
        long a1 = maxRanges[logs[d]][l];
        long a2 = maxRanges[logs[d]][r - (1 << logs[d])];
        return Math.max(a1, a2);
    }

    private static int calcLog(int i) {
        if (i == 1) {
            return 0;
        } else {
            int res = 0;
            while (i > 1) {
                i /= 2;
                res++;
            }
            return res;
        }
    }

    private static long[][] getMaxRanges(long[] a) {
        int n = a.length;
        List<long[]> result = new ArrayList<>();
        result.add(a);
        int k = 1;
        while ((1 << k) < n) {
            long[] newA = new long[n];
            for (int i = 0; i < n && i + (1 << (k - 1)) < n; i++) {
                newA[i] = Math.max(a[i], a[i + (1 << (k - 1))]);
            }
            result.add(newA);
            a = newA;
            k += 1;
        }
        long[][] resArray = new long[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }
        return resArray;
    }

    private static int moveEdges(int node, int k, Node[] nodes) {
        int ans = 0;
        int maxDepth = 0;

        for (Integer child : nodes[node].children) {
            ans += moveEdges(child, k, nodes);

            if (nodes[child].maxDepth == k - 1) {
                ans += 1;
            } else {
                maxDepth = Math.max(nodes[child].maxDepth + 1, maxDepth);
            }
        }

        nodes[node].maxDepth = maxDepth;

        return ans;
    }

    private static int findMaxPath(int node, Node[] nodes) {
        int maxPath = 0;
        for (Integer child : nodes[node].children) {
            maxPath = Math.max(findMaxPath(child, nodes), maxPath);
        }
        nodes[node].maxDepth = maxPath;
        return maxPath + 1;
    }


    private static void outputArray(int[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < ans.length; i++) {
            int an = ans[i];
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}