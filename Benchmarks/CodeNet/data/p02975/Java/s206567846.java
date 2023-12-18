import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;

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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            LinkedList<Integer> a = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                a.add(in.nextInt());
            }

            LinkedList<Integer> list = new LinkedList<>();
            list.add(a.removeFirst());
            boolean ans = calc(N, a, list);
            out.println(ans ? "Yes" : "No");
        }

        private boolean calc(int N, LinkedList<Integer> a, LinkedList<Integer> list) {
            int size = a.size();
            if (size == 0) {
                int x = list.get(0);
                int y = list.getLast();
                if ((x ^ list.get(list.size() - 2)) == y && (y ^ list.get(1)) == x) {
                    return true;
                }
                return false;
            }
            for (int i = 0; i < size; i++) {
                int v = a.removeFirst();
                if (list.size() >= 2) {
                    int x = list.get(list.size() - 2) ^ v;
                    if (x != list.get(list.size() - 1)) {
                        a.addLast(v);
                        continue;
                    }
                }
                list.addLast(v);
                boolean ret = calc(N, a, list);
                if (ret) {
                    return true;
                }
                a.addLast(list.removeLast());
            }
            return false;
        }

    }
}

