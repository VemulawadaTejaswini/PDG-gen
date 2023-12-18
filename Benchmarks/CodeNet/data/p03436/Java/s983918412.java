import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static int[][] map;
        static int h;
        static int w;

        int getMinPath(int max) {
            boolean[][] pass = new boolean[w][h];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    pass[j][i] = map[j][i] == Integer.MAX_VALUE;
                }
            }

            int count = 1;
            PriorityQueue<TaskD.Coordinate> coors = new PriorityQueue<>(Comparator.comparing(TaskD.Coordinate::getW));
            coors.add(new TaskD.Coordinate(0, 0, count, map[0][0]));
            while (count < max + 1) {
                int i = coors.size();
                if (i == 0) break;
                while (i > 0) {
                    TaskD.Coordinate c = coors.poll();
                    count++;

                    if (c.getX() == w - 1 && c.getY() == h - 1) return c.getV();

                    if (c.getX() - 1 >= 0 && !pass[c.getX() - 1][c.getY()]) {
                        coors.add(new TaskD.Coordinate(c.getX() - 1, c.getY(), c.getV() + 1, c.getW() + 1));
                        pass[c.getX() - 1][c.getY()] = true;
                    }
                    if (c.getX() + 1 < w && !pass[c.getX() + 1][c.getY()]) {
                        coors.add(new TaskD.Coordinate(c.getX() + 1, c.getY(), c.getV() + 1, c.getW() + 1));
                        pass[c.getX() + 1][c.getY()] = true;
                    }
                    if (c.getY() - 1 >= 0 && !pass[c.getX()][c.getY() - 1]) {
                        coors.add(new TaskD.Coordinate(c.getX(), c.getY() - 1, c.getV() + 1, c.getW() + 1));
                        pass[c.getX()][c.getY() - 1] = true;
                    }
                    if (c.getY() + 1 < h && !pass[c.getX()][c.getY() + 1]) {
                        coors.add(new TaskD.Coordinate(c.getX(), c.getY() + 1, c.getV() + 1, c.getW() + 1));
                        pass[c.getX()][c.getY() + 1] = true;
                    }
                    i--;
                }
            }

            return -1;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            map = new int[w][h];
            int wallCount = 0;

            for (int i = 0; i < h; i++) {
                String s = in.next();
                for (int j = 0; j < w; j++) {
                    char c = s.charAt(j);
                    if (c == '#') {
                        map[j][i] = Integer.MAX_VALUE;
                        wallCount++;
                    } else map[j][i] = 0;
                }
            }
            int min = getMinPath(h * w - wallCount);
            int ans = min == -1 ? min : h * w - wallCount - min;
            out.println(ans);
        }

        static class Coordinate {
            int x;
            int y;
            int v;
            int w;

            Coordinate(int x, int y, int v, int w) {
                this.x = x;
                this.y = y;
                this.v = v;
                this.w = w;
            }

            public int getY() {
                return y;
            }

            public int getX() {
                return x;
            }

            public int getV() {
                return v;
            }

            public int getW() {
                return w;
            }

        }

    }
}

