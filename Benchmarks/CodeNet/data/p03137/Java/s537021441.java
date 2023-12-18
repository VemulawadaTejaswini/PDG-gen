import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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

            for (int i = 0; i < m; i++) {
                map.add(in.nextInt());
            }

            Collections.sort(map);
            if (n >= m) {
                out.print(0);
            } else {
                if (n == 1) {
                    out.print(map.get(map.size() - 1) - map.get(0));
                } else {
                    int min = Integer.MAX_VALUE;
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < n; i++) {
                        if (i % 2 == 0) {
                            min = map.get(0);
                            map.remove(map.get(0));
                        } else {
                            max = map.get(map.size() - 1);
                            map.remove(map.size() - 1);
                        }
                    }

                    int ans = Integer.MAX_VALUE;

                    for (int i = 0; i < map.size(); i++) {
                        if (i == 0) {
                            ans = Math.min(ans, Math.abs(max - map.get(i)));
                            continue;
                        }

                        if (i == map.size() - 1) {
                            ans = Math.min(ans, Math.abs(min - map.get(i)));
                            continue;
                        }
                        int dist = Math.abs(map.get(i - 1) - min) + Math.abs(max - map.get(i));
                        ans = Math.min(ans, dist);
                    }
                    out.print(ans);
                }
            }


        }

    }
}

