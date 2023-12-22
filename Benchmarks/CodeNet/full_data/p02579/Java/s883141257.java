import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

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
        DWizardInMaze solver = new DWizardInMaze();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWizardInMaze {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            int ch = Integer.parseInt(in.next()) - 1;
            int cw = Integer.parseInt(in.next()) - 1;
            int dh = Integer.parseInt(in.next()) - 1;
            int dw = Integer.parseInt(in.next()) - 1;
            char[][] s = new char[h][w];
            for (int i = 0; i < h; i++) {
                s[i] = in.next().toCharArray();
            }

            int[][] d = new int[h][w];
            for (int i = 0; i < h; i++) {
                Arrays.fill(d[i], Integer.MAX_VALUE);
            }

            Deque<Integer> que = new ArrayDeque<>();
            que.add(ch * w + cw);

            //cost
            d[ch][cw] = 0;

            //bfs
            while (!que.isEmpty()) {
                int cur = que.poll();
                int cx = cur / w;
                int cy = cur % w;
                for (int nx = cx - 2; nx <= cx + 2; nx++) {
                    if (nx < 0 || h <= nx) {
                        continue;
                    }
                    for (int ny = cy - 2; ny <= cy + 2; ny++) {
                        if (ny < 0 || w <= ny) {
                            continue;
                        }
                        if (s[nx][ny] == '#') {
                            continue;
                        }
                        if (d[nx][ny] > d[cx][cy] &&
                                Math.abs(nx - cx) + Math.abs(ny - cy) <= 1) {
                            d[nx][ny] = d[cx][cy];
                            que.addFirst(nx * w + ny);
                        } else if (d[nx][ny] > d[cx][cy] + 1) {
                            d[nx][ny] = d[cx][cy] + 1;
                            que.addLast(nx * w + ny);
                        }
                    }
                }
            }
            if (d[dh][dw] == Integer.MAX_VALUE) {
                out.println(-1);
            } else {
                out.println(d[dh][dw]);
            }
        }

    }
}

