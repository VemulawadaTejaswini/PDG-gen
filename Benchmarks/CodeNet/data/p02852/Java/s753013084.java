import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSugoroku solver = new FSugoroku();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSugoroku {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            char[] c = in.next().toCharArray();
            Stack<Integer> stk = new Stack<>();

            int index = n;
            while (index > 0) {
                boolean f = true;
                for (int i = k; i > 0; i--) {
                    int nxt = index - i;
                    if (nxt < 0) {
                        continue;
                    }
                    if (c[nxt] == '0') {
                        index -= i;
                        stk.push(i);
                        f = false;
                        break;
                    }
                }
                if (f) {
                    out.println(-1);
                    return;
                }
            }

            while (!stk.isEmpty()) {
                out.print(stk.pop());
                out.print(" ");
            }
            out.println();


        }

    }
}

