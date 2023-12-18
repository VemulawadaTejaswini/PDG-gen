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
        DubiousDocument2 solver = new DubiousDocument2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DubiousDocument2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            char[] t = in.next().toCharArray();

            int pos = -1;
            int j = t.length - 1;
            for (int i = s.length - 1; 0 <= i; i--) {
                if (s[i] == '?' || s[i] == t[j]) {
                    j--;
                } else {
                    j = t.length - 1;
                }
                if (j < 0) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) {
                out.print("UNRESTORABLE");
                return;
            }

            int from = pos;
            int to = pos + t.length - 1;
            int k = 0;
            for (int i = 0; i < s.length; i++) {
                if (from <= i && i <= to) {
                    s[i] = t[k];
                    k++;
                } else if (s[i] == '?') {
                    s[i] = 'a';
                }
            }
            out.print(new String(s));

        }

    }
}

