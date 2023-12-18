//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static long TIME_START, TIME_END;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(System.out);
//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.out"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
        System.out.println("Memory increased:" + (usedMemoryAfter - usedMemoryBefore) / 1000000);
        System.out.println("Time used: " + (TIME_END - TIME_START) + ".");
    }

    public static class Task {
        int[] dirx = new int[]{1, -1, 0, 0};
        int[] diry = new int[]{0, 0, 1, -1};
        public int dfs(int[][] grid, boolean[][] visit, int curx, int cury, int fromx, int fromy, List<int[]> op) {
            visit[curx][cury] = true;
            for (int i = 0; i < 4; i++) {
                int nextx = curx + dirx[i];
                int nexty = cury + diry[i];
                if (!visit[nextx][nexty] && grid[nextx][nexty] > 0) {
                    dfs(grid, visit, nextx, nexty, curx, cury, op);
                }
            }
            if (fromx != -1) {
                if (grid[curx][cury] % 2 != 0) {
                    op.add(new int[]{curx, cury, fromx, fromy});
                    grid[fromx][fromy]++;
                    grid[curx][cury]--;
                }
            }
            return grid[curx][cury] % 2 == 0 ? 1 : 0;
        }

        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n + 2][m + 2];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            boolean[][] visit = new boolean[n + 2][m + 2];
            List<int[]> op = new ArrayList<>();
            for (int i = 0; i < n + 2; i++) {
                for (int j = 0; j < m + 2; j++) {
                    if (!visit[i][j] && grid[i][j] > 0) {
                        dfs(grid, visit, i, j, -1, -1, op);

                    }
                }
            }
            pw.println(op.size());
            for (int i = 0; i < op.size(); i++) {
                for (int j = 0; j < 4; j++) {
                    pw.print(op.get(i)[j] + " ");
                }
                pw.println();
            }
        }
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader s) throws FileNotFoundException {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}