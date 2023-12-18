import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String t = in.next();
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= t.length(); i--) {
                char c = s.charAt(i);
                if (c == '?' || c == t.charAt(t.length() - 1)) {
                    for (int j = t.length() - 1; j >= 0; j--) {
                        char cs = s.charAt(i + j - t.length() + 1);
                        char ct = t.charAt(j);
                        if (cs != '?' && cs != ct) break;
                        if (j == 0) {
                            sb.append(s.substring(0, i - t.length() + 1));
                            sb.append(t);
                            sb.append(s.substring(i + 1, s.length()));
                            for (int k = 0; k < sb.length(); k++) if (sb.charAt(k) == '?') sb.replace(k, k + 1, "a");
                            out.println(sb);
                            return;
                        }
                    }
                }
            }
            out.println("UNRESTORABLE");
        }

    }
}

