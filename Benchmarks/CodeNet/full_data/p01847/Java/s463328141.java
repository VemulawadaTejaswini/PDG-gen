import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
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
        Curtain solver = new Curtain();
        solver.solve(1, in, out);
        out.close();
    }

    static class Curtain {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<List<Integer>> edges = new ArrayList<>();
            for (int i = 0; i < 40000; i++) {
                edges.add(new ArrayList<>());
            }
            while (n != 0) {
                for (int i = 0; i < 40000; i++) edges.get(i).clear();
                int sx = in.nextInt() + 20000, sy = in.nextInt() + 20000;
                int lx = sx, ly = sy;
                for (int i = 1; i < n; i++) {
                    int x = in.nextInt() + 20000, y = in.nextInt() + 20000;
                    if (ly != y && lx == x) {
                        int min = Math.min(ly, y), max = Math.max(ly, y);
                        for (int j = min; j < max; j++) {
                            edges.get(j).add(x);
                        }
                    }
                    lx = x;
                    ly = y;
                }
                if (ly != sy && lx == sx) {
                    int min = Math.min(ly, sy), max = Math.max(ly, sy);
                    for (int j = min; j < max; j++) {
                        edges.get(j).add(lx);
                    }
                }

                int miny = 40001, maxy = 0, minx = 40001, maxx = 0;
                for (int i = 0; i < 4; i++) {
                    int x = in.nextInt() + 20000, y = in.nextInt() + 20000;
                    miny = Math.min(miny, y);
                    maxy = Math.max(maxy, y);
                    minx = Math.min(minx, x);
                    maxx = Math.max(maxx, x);
                }

                //System.out.println("(" + minx + "," + miny + "), (" + maxx + "," + maxy + ")");

                long ans = 0;
                for (int i = 0; i < 40000; i++) {
                    if (edges.get(i).isEmpty()) continue;
                    List<Integer> es = edges.get(i);
                    es.sort(Comparator.naturalOrder());
                    //System.out.println(i + ":" + es);
                    if (es.size() % 2 == 1) {
                        throw new RuntimeException();
                    }
                    for (int j = 0; j < es.size(); j += 2) {
                        int left = es.get(j), right = es.get(j + 1);
                        if (miny <= i && i < maxy) {
                            if (right <= minx || maxx <= left) {
                                ans += right - left;
                            } else {
                                int cleft = Math.max(left, minx), cright = Math.min(right, maxx);
                                ans += (right - left) - Math.max(0, cright - cleft);
                            }
                        } else {
                            ans += right - left;
                        }
                    }
                    //System.out.println(ans);
                }
                out.println(ans);
                n = in.nextInt();
            }
        }

    }
}


