import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] s = in.nextLine().toCharArray();
            char[] t = in.nextLine().toCharArray();
            if (t.length > s.length) {
                out.println("UNRESTORABLE");
                return;
            }
            nextShift:
            for (int i = s.length - t.length; i >= 0; i--) {
                for (int j = 0; j < t.length; j++) {
                    if (s[i + j] != '?' && s[i + j] != t[j]) {
                        continue nextShift;
                    }
                }
                ArrayList<Character> ans = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    if (s[j] == '?') {
                        ans.add('a');
                    } else {
                        ans.add(s[j]);
                    }
                }
                for (int j = 0; j < t.length; j++) {
                    ans.add(t[j]);
                }
                for (int j = i + t.length; j < s.length; j++) {
                    if (s[j] == '?') {
                        ans.add('a');
                    } else {
                        ans.add(s[j]);
                    }
                }
                for (Character c : ans) {
                    out.print(c);
                }
                out.println();
                return;
            }
            out.println("UNRESTORABLE");
        }

    }

    static class InputReader {
        final InputStream is;
        final byte[] buffer = new byte[1024];
        int curCharIdx;
        int nChars;

        public InputReader(InputStream is) {
            this.is = is;
        }

        public int read() {
            if (curCharIdx >= nChars) {
                try {
                    curCharIdx = 0;
                    nChars = is.read(buffer);
                    if (nChars == -1) {
                        return -1;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return buffer[curCharIdx++];
        }

        public String nextLine() {
            return nextLine(16);
        }

        public String nextLine(int size) {
            int c = read();
            while (c == '\n' || c == '\t' || c == '\r') {
                c = read();
            }
            if (c == -1) {
                return null;
            }
            StringBuilder sb = new StringBuilder(size);
            while (c != -1 && c != '\n' && c != '\t' && c != '\r') {
                sb.appendCodePoint(c);
                c = read();
            }
            return sb.toString();
        }

    }
}

