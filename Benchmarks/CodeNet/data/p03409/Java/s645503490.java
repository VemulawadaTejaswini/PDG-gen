import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC091C solver = new ABC091C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC091C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] redX = new int[N];
            int[] redY = new int[N];
            int[] blueX = new int[N];
            int[] blueY = new int[N];
            boolean[] used = new boolean[N];
            int ans = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                redX[i] = in.nextInt();
                redY[i] = in.nextInt();
                used[i] = false;
            }
            for (int i = 0; i < N; i++) {
                blueX[i] = in.nextInt();
                blueY[i] = in.nextInt();
                list.add(i);
            }

            // sort
            Collections.sort(list, Comparator.comparingInt(o -> blueX[o]));

            for (Integer i : list) {
                List<Integer> candidate = new ArrayList<>();
                for (int j = 0; j < N; j++) {
                    if (redX[j] < blueX[i]
                            && redY[j] < blueY[i]
                            && !used[j]) {
                        candidate.add(j);
                    }
                }

                double maxY = -1;
                int index = -1;
                for (Integer j : candidate) {
                    double d = redY[j];
                    if (maxY < d) {
                        maxY = d;
                        index = j;
                    }
                }
                if (index != -1) {
                    ans++;
                    used[index] = true;
                }
            }
            out.println(ans);
        }

    }
}

