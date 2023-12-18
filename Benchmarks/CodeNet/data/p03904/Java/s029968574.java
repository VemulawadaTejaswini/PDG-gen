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

    private static int[][] getLCPArray(String s) {
        s += ((char) 0);
        int n = s.length();
        int[] p = new int[n];
        int[] c = new int[n];

        List<int[]> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new int[]{s.charAt(i), i});
        }
        a.sort(Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < n; i++) {
            p[i] = a.get(i)[1];
        }
        c[p[0]] = 0;
        for (int i = 1; i < n; i++) {
            if (a.get(i)[0] == a.get(i - 1)[0]) {
                c[p[i]] = c[p[i - 1]];
            } else {
                c[p[i]] = c[p[i - 1]] + 1;
            }
        }
        int k = 0;
        while ((1 << k) < n) {
            for (int i = 0; i < n; i++) {
                p[i] = (p[i] - (1 << k) + n) % n;
            }
            p = countSort(p, c);

            int[] cNew = new int[n];
            cNew[p[0]] = 0;
            for (int i = 1; i < n; i++) {
                if (c[p[i]] == c[p[i - 1]] && c[(p[i] + (1 << k)) % n] == c[(p[i - 1] + (1 << k)) % n]) {
                    cNew[p[i]] = cNew[p[i - 1]];
                } else {
                    cNew[p[i]] = cNew[p[i - 1]] + 1;
                }
            }
            c = cNew;
            k++;
        }

        int[][] res = new int[3][n];
        res[0] = p;
        res[2] = c;
        return res;
    }

    private static int[] countSort(int[] p, int[] c) {
        int n = p.length;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[c[i]]++;
        }
        int[] pos = new int[n];
        pos[0] = 0;
        for (int i = 1; i < n; i++) {
            pos[i] = pos[i - 1] + count[i - 1];
        }
        int[] pNew = new int[n];
        for (int pi : p) {
            pNew[pos[c[pi]]] = pi;
            pos[c[pi]]++;
        }
        return pNew;
    }


    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int k = in.nextInt();
        String s = in.nextString();

        int[][] lcpArray = getLCPArray(s);
        int len;
        int n = s.length();
        if (n % (k + 1) == 0) {
            len = n / (k + 1);
        } else {
            len = n / (k + 1) + 1;
        }

        int l = 0;
        int r = n + 1;
        while (r - l > 1) {
            int mid = (r + l) / 2;
            if (check(mid, lcpArray[2], n, len, k + 1)) {
                r = mid;
            } else {
                l = mid;
            }
        }

        while (lcpArray[0][r] + len > n) {
            r--;
        }
        out.println(s.substring(lcpArray[0][r], lcpArray[0][r] + len));


        out.close();
    }

    private static boolean check(int ans, int[] c, int n, int maxLength, int k) {
        int i = 0;
        while (i < n) {
            if (c[i] <= ans) {
                i += maxLength;
            } else {
                i += maxLength - 1;
            }
            k--;
            if (k < 0) {
                return false;
            }
        }
        return k >= 0;
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
