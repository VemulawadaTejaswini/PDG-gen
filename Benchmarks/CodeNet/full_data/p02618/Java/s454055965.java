import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;

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
            // 入力
            int D = Integer.parseInt(in.next());
            int[] c = new int[26];
            for (int i = 0; i < 26; i++) {
                c[i] = Integer.parseInt(in.next());
            }
            Map<Integer, Integer> s = new TreeMap<>(new Comparator<Integer>() {

                public int compare(Integer integer, Integer t1) {
                    if (t1.compareTo(integer) == 0) {
                        return 0;
                    } else if (t1.compareTo(integer) > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            });
            int[] t = new int[D];
            for (int i = 0; i < D; i++) {
                s.clear();
                for (int j = 0; j < 26; j++) {
                    s.put(Integer.parseInt(in.next()), j + 1);
                }
                for (Integer k : s.keySet()) {
                    t[i] = s.get(k);
                    break;
                }
            }

            // 出力
            for (int i = 0; i < D; i++) {
                out.println(t[i]);
            }

        }

    }
}

