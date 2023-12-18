import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.*;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.sort;

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

    int[] a,b,c,d,x;
    int n,m,q;
    int ans = 0;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        n = in.nextInt();
        m = in.nextInt();
        q = in.nextInt();
        a = new int[q];
        b = new int[q];
        c = new int[q];
        d = new int[q];
        x = new int[n];
        for (int i = 0; i < q; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
            d[i] = in.nextInt();
        }
        dfs(0, 1,0);
        out.println(ans);
    }

    private void dfs(int t, int v, int sum) {
        if (t == n) {
            ans = Math.max(ans, sum);
            return;
        }
        for (int i = v; i <= m; i++) {
            x[t] = i;
            int nsum = sum;
            for (int j = 0; j < q; j++) if (b[j] == t + 1 && x[t] - x[a[j] - 1] == c[j]) {
                nsum += d[j];
            }
            dfs(t + 1, i, nsum);
        }
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
