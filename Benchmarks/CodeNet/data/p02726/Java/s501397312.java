import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

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

    private static int mod = 1000000007;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int ans = 1000000;
//        for (int i = 1; i < 100; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if ((a * i + b * j) % 10000 < ans) {
//                    ans = (a * i + b * j) % 10000;
//                    out.println(ans + " " + i + " " + j);
//                }
//            }
//        }
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int[] dis = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int minDis = Math.min(Math.abs(j - x) + Math.abs(y - i) + 1, Math.abs(j - y) + Math.abs(x - i) + 1);
                minDis = Math.min(j - i, minDis);
                dis[minDis]++;
            }
        }
        for (int i = 1; i < n; i++) {
            out.println(dis[i]);
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
