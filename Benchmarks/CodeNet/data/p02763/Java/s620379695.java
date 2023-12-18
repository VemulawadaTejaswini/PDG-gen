import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;

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
        SimpleStringQueries solver = new SimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class SimpleStringQueries {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            List<Set<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                list.add(new HashSet<>());
            }

            for (int i = 0; i < s.length; i++) {
                Set<Integer> set = list.get(s[i] - 'a');
                set.add(i);
            }
            int q = in.nextInt();
            for (int j = 0; j < q; j++) {

                int num = Integer.parseInt(in.next());
                if (num == 1) {
                    int i = Integer.parseInt(in.next()) - 1;
                    char c = in.next().charAt(0);
                    Set<Integer> fromTarget = list.get(s[i] - 'a');
                    fromTarget.remove(i);

                    Set<Integer> toTarget = list.get(c - 'a');
                    toTarget.add(i);

                    s[i] = c;
                } else {
                    int l = Integer.parseInt(in.next()) - 1;
                    int r = Integer.parseInt(in.next());
                    long result = 0;
                    for (int i = 0; i < 26; i++) {
                        Set<Integer> set = list.get(i);
                        if (set.isEmpty()) {
                            continue;
                        }
                        int lpos = Collections.binarySearch(new ArrayList<>(set), l);
                        if (lpos < 0) {
                            lpos = ~lpos;
                        }
                        int rpos = Collections.binarySearch(new ArrayList<>(set), r);
                        if (rpos < 0) {
                            rpos = ~rpos;
                        }
                        if (lpos < rpos) {
                            result++;
                        }
                    }
                    out.println(result);
                }
            }
        }

    }
}

