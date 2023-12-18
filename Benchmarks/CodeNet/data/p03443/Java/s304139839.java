import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int len = 2 * n + 1;
            char[] c = ("1" + in.next() + "1").toCharArray();
            int[] ff = new int[4];
            List<Integer>[] tt = LUtils.genArrayList(4);
            for (int i = 0; i + 1 < len; i++) {
                int a = (c[i] - '0') * 2 + (c[i + 1] - '0');
                ff[a]++;
                tt[a].add(i);
            }
            if (ff[0] % 2 != 0 || ff[3] % 2 != 0 || ff[1] != ff[2]) {
                Debug.print("BAD");
                out.println("No");
                return;
            }
            for (int itt = 0; itt < 50; itt++) {
                for (int i = 0; i < 4; i++) {
                    Collections.shuffle(tt[i]);
                }
                int[] idx = new int[4];
                int cpos = 0;
                int[] ret = new int[2 * n];
                Arrays.fill(ret, -1);
                boolean[] b = new boolean[len];
                boolean[] used = new boolean[len];
                int[] x = new int[]{0, 2, 1, 3};
                int id = 1;
                int[] partner = new int[len];
                while (cpos != 2 * n) {
                    b[cpos] = true;
                    int cur = (c[cpos] - '0') * 2 + (c[cpos + 1] - '0');
                    int want = x[cur];
                    if (ret[cpos] == -1) {
                        ret[cpos] = id;
                        used[cpos] = true;
                        while (used[tt[want].get(idx[want])]) idx[want]++;
                        int q = tt[want].get(idx[want]);
                        used[q] = true;
                        ret[q] = id;
                        partner[cpos] = q;
                        partner[q] = cpos;
                        cpos = q + 1;
                        id++;
                    } else {
                        cpos = partner[cpos] + 1;
                    }
                }
                b[cpos] = true;
                boolean ok = true;
                for (int i = 0; i < len; i++) {
                    if (b[i] != (c[i] == '1')) {
                        ok = false;
                        break;
                    }
                }
                if (!ok) continue;
                int a = 0;
                for (int i = 0; i < 2 * n; i++) {
                    if (ret[i] == -1) {
                        ret[i] = id;
                        a++;
                        if (a == 2) {
                            a = 0;
                            id++;
                        }
                    }
                }
                out.println("Yes");
                out.println(ret);
                return;
            }
            out.println("No");
        }

    }

    static class LUtils {
        public static <E> List<E>[] genArrayList(int size) {
            return Stream.generate(ArrayList::new).limit(size).toArray(List[]::new);
        }

    }

    static class Debug {
        public static boolean DEBUG;

        static {
            try {
                DEBUG = System.getProperty("user.dir").contains("Dropbox");
            } catch (Exception e) {
                DEBUG = false;
            }
        }

        private static ArrayList<String> getParams() {
            StackTraceElement[] t = new Exception().getStackTrace();
            StackTraceElement up = t[2];

            ArrayList<String> ret = new ArrayList<>();
            ret.add(up.getFileName() + "/" + up.getMethodName());
            try {
                BufferedReader br = new BufferedReader(new FileReader(
                        new File("src/" + up.getClassName().replaceAll("\\.", "/") + ".java")));
                int g = up.getLineNumber();
                while (--g > 0) br.readLine();
                String q = br.readLine();
                String[] ss = q.split("Debug\\.print\\(");
                String[] qq = ss[1].substring(0, ss[1].indexOf(")")).split(",");
                for (int i = 0; i < qq.length; i++) {
                    ret.add(qq[i].trim());
                }
            } catch (Exception e) {
            }
            for (int i = 0; i < 100; i++) ret.add("???");
            return ret;
        }

        private static String toString(Object o) {
            if (o instanceof Object[]) {
                return Arrays.toString((Object[]) o);
            } else if (o instanceof char[]) {
                return new String((char[]) o);
            } else if (o instanceof int[]) {
                return Arrays.toString((int[]) o);
            } else if (o instanceof long[]) {
                return Arrays.toString((long[]) o);
            } else if (o instanceof double[]) {
                return Arrays.toString((double[]) o);
            } else {
                return o.toString();
            }
        }

        public static void print(Object x) {
            if (!DEBUG) return;
            ArrayList<String> s = getParams();
            System.out.println(s.get(0) + ": " + s.get(1) + " = " + toString(x));
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public String next() {
            int c;
            while (isSpaceChar(c = this.read())) {
                ;
            }

            StringBuilder result = new StringBuilder();
            result.appendCodePoint(c);

            while (!isSpaceChar(c = this.read())) {
                result.appendCodePoint(c);
            }

            return result.toString();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void print(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void println(int[] array) {
            print(array);
            writer.println();
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

