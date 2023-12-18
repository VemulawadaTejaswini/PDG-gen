import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer> map = new ArrayList<>();
            ArrayList<Integer> sub = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                map.add(in.nextInt());
            }

            Collections.sort(map);
            int ans = 0;
            if (n <= m) {
                for (int i = 0; i < map.size(); i++) {
                    if (i != 0) {
                        sub.add(map.get(i) - map.get(i - 1));
                    }
                }

                Collections.sort(sub);

                ans = sub.stream().mapToInt(Integer::intValue).sum();


                for (int i = 1; i <= n - 1; i++) {
                    ans -= sub.get(sub.size() - i);
                }
            } else {
                ans = 0;
            }

            out.print(ans);
        }

    }
}

