import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * D_Carousel
 */
public class Main {
    public static void main(String[] args) {
        InputReader ir = new InputReader();
        OutputWriter ow = new OutputWriter();

        solve(ir, ow);

        ow.flush();
    }

    private static void solve(InputReader ir, OutputWriter ow) {
        int x = ir.nextInt(), y = ir.nextInt(), z = ir.nextInt();

        ow.print(z + " " + x + " " + y);
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
