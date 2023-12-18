import java.io.*;
import java.util.*;

public class Main {
    static class Writer {
        PrintWriter cout;

        Writer() throws IOException {
            cout = new PrintWriter(System.out);
        }

        Writer(String name) throws IOException {
            cout = new PrintWriter(new FileWriter(name));
        }

        StringBuilder out = new StringBuilder();

        void print(Object a) {
            out.append(a);
        }

        void close() {
            cout.print(out.toString());
            cout.close();
        }
    }

    static class Reader {
        BufferedReader in;

        Reader() throws IOException {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(String name) throws IOException {
            in = new BufferedReader(new FileReader(name));
        }

        StringTokenizer tokin = new StringTokenizer("");

        String next() throws IOException {
            if (!tokin.hasMoreTokens()) {
                tokin = new StringTokenizer(in.readLine());
            }
            return tokin.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String args[]) throws IOException {
        Reader in = new Reader();
        Writer out = new Writer();
        long n = in.nextInt();
        long m = in.nextInt();
        long maxd = 1;
        long max = (long) Math.floor((double) m / (double) n);
        if (n * 2 <= m && m % 2 == 0)
            maxd = 2;
        for (long d = 3; d <= max; d++) {
            if (m % d == 0)
                maxd = d;
        }
        out.print(maxd);
        out.close();
    }
}