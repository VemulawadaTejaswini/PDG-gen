import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author amotoma3
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.nextString() + "T";
            int n = s.length();

            int x = in.nextInt();
            int y = in.nextInt();

            List<Integer> xList = new ArrayList<>();
            List<Integer> yList = new ArrayList<>();
            int index = 0;
            int turn = 0;
            while (index < n) {
                int cnt = 0;
                while (s.charAt(index) == 'F') {
                    cnt++;
                    index++;
                }
                if (cnt > 0) {
                    if (turn % 2 == 0) {
                        xList.add(cnt);
                    } else {
                        yList.add(cnt);
                    }
                }
                turn++;
                index++;
            }

            Set<Integer> xSet = new TreeSet<>();
            xSet.add(0);
            xSet = calcSets(xList, xSet);

            Set<Integer> ySet = new TreeSet<>();
            ySet.add(0);
            ySet = calcSets(yList, ySet);

            out.println(xSet.contains(x) && ySet.contains(y) ? "Yes" : "No");
        }

        private Set<Integer> calcSets(List<Integer> list, Set<Integer> set) {
            for (int i = 0; i < list.size(); i++) {
                Set<Integer> next = new TreeSet<>();
                for (int p : set) {
                    next.add(p + list.get(i));
                    next.add(p - list.get(i));
                }
                set = next;
            }
            return set;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

