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
        int n = in.nextInt();
        int m = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        Apple[] apples = new Apple[A + B + C];
        readArrays(in, A, 1, apples, 0);
        readArrays(in, B, 2, apples, A);
        readArrays(in, C, 0, apples, A + B);
        Arrays.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o2.del - o1.del;
            }
        });
        int r = 0, g = 0, c = 0;
        long ans = 0;
        for (int i = 0; i < A + B + C; i++) {
            if (r + g + c >= n + m) {
                break;
            }
            int col = apples[i].col;
            int del = apples[i].del;
            if (col == 1 && r < n) {
                ans += del;
                r++;
            } else if(col == 2 && g < m) {
                ans += del;
                g++;
            } else if (col == 0){
                ans += del;
                c++;
            }
        }
        out.println(ans);
    }

    private void readArrays(InputReader in, int n, int col, Apple[] apples, int cur) {
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            apples[cur++] = new Apple(x, col);
        }
    }

    class Apple {
        int del;
        int col;

        public Apple(int del, int col) {
            this.del = del;
            this.col = col;
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
