//package AtCoder.Panasonic2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        long h = in.NI(); long w = in.NI();
        if (h==1) {
            out.println(1); return;
        }
        if (w==1) {
            out.println(1); return;
        }
        if (h%2==0) {
            out.println(w*(h/2));
        } else {
            long t1 = h/2+1; long t2 = h/2;
            if (w%2==0) {
                out.println(w/2*(t1+t2));
            } else {
                long var = (w/2*(t1+t2)) + t1;
                out.println(var);
            }
        }
        out.close();
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }
}