import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        InputReader ir = new InputReader();
        OutputWriter ow = new OutputWriter();

        solve(ir, ow);

        ow.flush();
    }

    private static void solve(InputReader ir, OutputWriter ow) {
        int N = ir.nextInt();
        int K = ir.nextInt();
        int C = ir.nextInt();

        char[] days = ir.next().toCharArray();

        int[] left = new int[K];
        int[] right = new int[K];

        int lastIndex = -1;
        for (int i = 0; i < N; i++) {
            if (days[i] == 'x') {
                continue;
            }

            if (lastIndex != -1 && i - left[lastIndex] <= C) {
                continue;
            }

            left[++lastIndex] = i;

            if (lastIndex == K - 1) {
                break;
            }
        }

        lastIndex = K;

        for (int i = N - 1; i >= 0; i--) {
            if (days[i] == 'x') {
                continue;
            }

            if (lastIndex != K && right[lastIndex] - i <= C) {
                continue;
            }

            right[--lastIndex] = i;

            if (lastIndex == 0) {
                break;
            }
        }

        for (int i = 0; i < K; i++) {
            if (left[i] == right[i]) {
                ow.println(left[i] + 1);
            }
        }

    }

}

////////////////// IO //////////////////////

class InputReader {
    private BufferedReader br;
    private StringTokenizer st;

    InputReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextLine() {
        String s = "";
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }
}

class OutputWriter {
    private BufferedWriter bw;

    OutputWriter() {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    void print(String s) {
        try {
            bw.write(s, 0, s.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void println() {
        try {
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void println(String s) {
        print(s);
        println();
    }

    void print(int x) {
        print(Integer.toString(x));
    }

    void println(int x) {
        println(Integer.toString(x));
    }

    void print(long l) {
        print(Long.toString(l));
    }

    void println(long l) {
        println(Long.toString(l));
    }

    void print(Object o) {
        print(o.toString());
    }

    void println(Object o) {
        println(o.toString());
    }

    void flush() {
        try {
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
