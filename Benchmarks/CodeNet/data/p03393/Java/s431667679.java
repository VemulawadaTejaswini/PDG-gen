import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ankur
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.readString();

            if (s.length() < 26) {
                for (char i = 'a'; i <= 'z'; i++) {
                    boolean x = false;
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) == i) {
                            x = true;
                        }
                    }
                    if (!x) {
                        out.print(s + i);
                        return;
                    }
                }
            }
            for (int i = 25; i >= 0; i--) {
                char min = 'z' + 1;
                for (int j = i + 1; j <= 25; j++) {
                    if (s.charAt(j) > s.charAt(i)) {
                        if (s.charAt(j) < min) {
                            min = s.charAt(j);
                        }
                    }
                }
                if (min != 'z' + 1) {
                    for (int j = 0; j < i; j++) {
                        out.print(s.charAt(j));
                    }
                    out.print(min);
                    return;
                }
            }
            out.print(-1);
        }

    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar;
        private int snumChars;

        public InputReader(InputStream st) {
            this.stream = st;
        }

        public int read() {
            //*-*------clare------
//remeber while comparing 2 non primitive data type not to use ==
//remember Arrays.sort for primitive data has worst time case complexity of 0(n^2) bcoz it uses quick sort
//again silly mistakes ,yr kb tk krta rhega ye mistakes
//try to write simple codes ,break it into simple things
//knowledge>rating
        /*
        public class Main
        implements Runnable{
    public static void main(String[] args) {
        new Thread(null,new Main(),"Main",1<<26).start();

    }
    public void run() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();//chenge the name of task
        solver.solve(1, in, out);
        out.close();
    }
         */

            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

