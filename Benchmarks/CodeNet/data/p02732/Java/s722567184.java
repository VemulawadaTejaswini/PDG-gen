import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

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

    private static int mod = 1000000007;


    public void solve(int testNumber, InputReader in, PrintWriter out) {
        //double n = in.nextDouble();
        //out.println(n * n * n / 27);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            cnt[a[i]]++;
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) if (cnt[i] > 0) {
            ans += 1L * cnt[i] * (cnt[i] - 1) / 2;
        }
        for (int i = 0; i < n; i++) {
            out.println(ans - cnt[a[i]] + 1);
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
