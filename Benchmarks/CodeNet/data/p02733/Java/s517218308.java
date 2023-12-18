import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.*;

import com.sun.tools.javac.util.Pair;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 998244353;


    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        char[][] s = new char[n][];
        for (int i = 0; i < n; i++) {
            s[i] = in.next().toCharArray();
        }
        int[][] a = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = a[i - 1][j] + a[i][j - 1] - a[i - 1][j - 1] + (s[i - 1][j - 1] == '1' ? 1 : 0);
            }
        }
        int ans = Integer.MAX_VALUE;
        List<Pair<Integer, Integer>> bars = null;
        for (int i = 0; i < (1 << (n - 1)); i++) {
            int tmp = Integer.bitCount(i);
            boolean ok = true;
            bars = parse(i, n);
            int pre = 0, cur = 1;
            while (cur <= m) {
                if (!check(bars, pre, cur, k, a)) {
                    if (cur - 1 == pre) {
                        ok = false;
                        break;
                    }
                    tmp++;
                    pre = cur - 1;
                } else {
                    cur++;
                }
            }
            if (ok && ans > tmp) {
                ans = Math.min(ans, tmp);
                //out.println(i);
            }
        }
        out.println(ans);
    }

    private boolean check(List<Pair<Integer, Integer>> bars, int y1, int y2, int k, int[][] a) {
        for (Pair<Integer, Integer> pair : bars) {
            int x1 = pair.fst;
            int x2 = pair.snd;
            if (a[x2][y2] - a[x1][y2] - a[x2][y1] + a[x1][y1] > k) {
                return false;
            }
        }
        return true;
    }

    private List<Pair<Integer,Integer>> parse(int i, int n) {
        List<Pair<Integer, Integer>> bars = new ArrayList<Pair<Integer,Integer>>();
        int pre = 0, cur = 1;
        while (i != 0) {
            if (i % 2 == 1) {
                bars.add(new Pair<>(pre, cur));
                pre = cur;
            }
            i >>= 1;
            cur++;
        }
        bars.add(new Pair<>(pre, n));
        return bars;
    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
