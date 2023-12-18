import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            int D = in.nextInt();
            int[][] A = new int[H][W];
            int[] map = new int[H * W];
            int[][] dist = new int[D][H * W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    A[i][j] = in.nextInt() - 1;
                    map[A[i][j]] = i * 300 + j;
                }
            }
            for (int i = 0; i < H * W; i++) {
                if (i + D >= H * W) continue;
                int nowI = map[i] / 300;
                int nowJ = map[i] % 300;
                int nxtI = map[i + D] / 300;
                int nxtJ = map[i + D] % 300;
                dist[i % D][i + D] += dist[i % D][i] + Math.abs(nowI - nxtI) + Math.abs(nowJ - nxtJ);
            }
            int Q = in.nextInt();
            int[] L = new int[Q];
            int[] R = new int[Q];
            for (int i = 0; i < Q; i++) {
                L[i] = in.nextInt() - 1;
                R[i] = in.nextInt() - 1;
                int d = L[i] % D;
                out.println(dist[d][R[i]] - dist[d][L[i]]);
            }

        }

    }
}

