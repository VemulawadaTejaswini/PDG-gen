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
        int K = ir.nextInt();

        if (K <= 12) {
            ow.print(K);
            return;
        }

        Deque<Long> queue = new ArrayDeque<>(K);

        for (long i = 1; i < 10 ; i++) {
            queue.offer(i);
        }

        int count = 9;

        while (true) {
            long x = queue.poll();

            if (x % 10 != 0) {
                queue.offer(x * 10 + (x % 10 - 1));
                count++;
            }

            if (count == K) {
                ow.print(queue.peekLast());
                return;
            }

            queue.offer(x * 10 + x % 10);
            count++;

            if (count == K) {
                ow.print(queue.peekLast());
                return;
            }

            if (x % 10 != 9) {
                queue.offer(x * 10 + (x % 10 + 1));
                count++;
            }

            if (count == K) {
                ow.print(queue.peekLast());
                return;
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
