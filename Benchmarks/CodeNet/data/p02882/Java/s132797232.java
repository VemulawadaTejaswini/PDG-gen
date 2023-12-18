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
        double a = in.nextDouble();
        double b = in.nextDouble();
        double x = in.nextDouble();
        double l = 0, r = Math.PI / 2;
        for (int i = 0; i < 1000000; i++) {
            double m = (l + r) / 2;
            double v = get(a, b, m);
            if (v >= x) {
                r = m;
            } else {
                l = m;
            }
        }
        out.println(90 - l * 180 / Math.PI);
    }

    private double get(double a, double b, double m) {
        double c = b - a / Math.tan(m);
        if (c < 0) {
            return b * b * Math.tan(m) * a / 2;
        }
        return a * (c + b) * a / 2;
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
