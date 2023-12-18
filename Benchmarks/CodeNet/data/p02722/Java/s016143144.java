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
        long N = ir.nextLong();

        if (N == 2) {
            ow.print(1);
            return;
        }

        long result = numberOfDivisors(N - 1) - 1 + numberOfDivisorsAndMod1(N);

        ow.print(result);

    }

    private static long numberOfDivisorsAndMod1(long n) {
        double sqrt = Math.sqrt(n);

        long count = 1; // n

        for (long i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                long divisor = n / i;
                long temp = n;
                while (temp % i == 0) {
                    temp /= i;
                }
                if (temp % i == 1) {
                    count++;
                }

                if (i == sqrt) {
                    break;
                }

                temp = n;
                while (temp % divisor == 0) {
                    temp /= divisor;
                }
                if (temp % divisor == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    private static long numberOfDivisors(long n) {
        double sqrt = Math.sqrt(n);

        long count = 2; // 1 and n

        for (long i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
                if (i != sqrt) {
                    count++;
                }
            }
        }

        return count;
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
