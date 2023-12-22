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
        AizuRPN solver = new AizuRPN();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuRPN {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final String s = in.nextLine().trim();

            AizuRPN.Stack st = new AizuRPN.Stack(1000);
            String[] input = s.split(" ");

            for (String x : input) {
                if (x.equals("+")) {
                    long b = Long.parseLong(st.pop());
                    long a = Long.parseLong(st.pop());

                    st.push(String.valueOf(a + b));
                } else if (x.equals("-")) {
                    long b = Long.parseLong(st.pop());
                    long a = Long.parseLong(st.pop());

                    st.push(String.valueOf(a - b));
                } else if (x.equals("*")) {
                    long b = Long.parseLong(st.pop());
                    long a = Long.parseLong(st.pop());

                    st.push(String.valueOf(a * b));
                } else {
                    st.push(x);
                }
            }

            out.printf("%s\n", st.pop());
        }

        static class Stack {
            private String[] a;
            private int top;

            public Stack(final int n) {
                a = new String[n];
                top = -1;
            }

            public boolean isEmpty() {
                return top == -1;
            }

            public void push(String c) {
                a[++top] = c;
            }

            public String pop() {
                if (isEmpty()) {
                    throw new IllegalStateException("empty stack");
                }

                return a[top--];
            }

        }

    }
}


