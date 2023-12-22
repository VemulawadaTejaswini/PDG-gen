import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
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
        MirrorCave solver = new MirrorCave();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class MirrorCave {
        final int[] dh = new int[]{0, -1, 0, 1};
        final int[] dw = new int[]{-1, 0, 1, 0};
        final int[] dh2 = new int[]{0, -1, 0, 1};
        final int[] dw2 = new int[]{1, 0, -1, 0};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int W = in.nextInt();
            int H = in.nextInt();
            if (W == 0) {
                throw new UnknownError();
            }
            String[] L = new String[H + 2];
            String[] R = new String[H + 2];
            L[0] = R[0] = L[H + 1] = R[H + 1] = new String();
            for (int i = 0; i < W + 2; ++i) {
                L[0] += "#";
                R[0] += "#";
                R[H + 1] += "#";
                L[H + 1] += "#";
            }
            int lh = -1, lw = -1, rh = -1, rw = -1;
            int glh = -1, glw = -1, grh = -1, grw = -1;
            for (int i = 0; i < H; ++i) {
                L[i + 1] = "#" + in.next() + "#";
                R[i + 1] = "#" + in.next() + "#";
                for (int j = 0; j < L[i + 1].length(); ++j) {
                    if (L[i + 1].charAt(j) == 'L') {
                        lh = i + 1;
                        lw = j;
                    }
                    if (R[i + 1].charAt(j) == 'R') {
                        rh = i + 1;
                        rw = j;
                    }
                    if (L[i + 1].charAt(j) == '%') {
                        glh = i + 1;
                        glw = j;
                    }
                    if (R[i + 1].charAt(j) == '%') {
                        grh = i + 1;
                        grw = j;
                    }
                }
            }
            boolean[][][][] vis = new boolean[H + 2][W + 2][H + 2][W + 2];
            for (int i = 0; i < vis.length; ++i) {
                for (int j = 0; j < vis[i].length; ++j) {
                    for (int k = 0; k < vis[i][j].length; ++k) {
                        Arrays.fill(vis[i][j][k], false);
                    }
                }
            }
            Queue<State> q = new ArrayDeque<>();
            q.add(new State(lh, lw, rh, rw));
            //for (String e : L) System.err.println(e);
            //for (String e : R) System.err.println(e);
            while (!q.isEmpty()) {
                State now = q.poll();
                if (vis[now.lh][now.lw][now.rh][now.rw]) {
                    continue;
                }
                vis[now.lh][now.lw][now.rh][now.rw] = true;
                if ((now.lh == glh && now.lw == glw) ^ (now.rh == grh && now.rw == grw)) {
                    continue;
                }
                if (now.lh == glh && now.rh == grh && now.lw == glw && now.rw == grw) {
                    out.println("Yes");
                    return;
                }

                for (int i = 0; i < 4; ++i) {
                    State next = new State(now.lh + dh[i], now.lw + dw[i], now.rh + dh2[i], now.rw + dw2[i]);
                    if (L[next.lh].charAt(next.lw) == '#' && R[next.rh].charAt(next.rw) == '#') {
                        continue;
                    } else if (L[next.lh].charAt(next.lw) == '#') {
                        next.lh = now.lh;
                        next.lw = now.lw;
                    } else if (R[next.rh].charAt(next.rw) == '#') {
                        next.rh = now.rh;
                        next.rw = now.rw;
                    }
                    if (!vis[next.lh][next.lw][next.rh][next.rw]) {
                        q.add(next);
                    }
                }
            }
            out.println("No");
            return;
        }

        public class State {
            int lh;
            int lw;
            int rh;
            int rw;

            State(int lh, int lw, int rh, int rw) {
                this.lh = lh;
                this.lw = lw;
                this.rh = rh;
                this.rw = rw;
            }

        }

    }
}