import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int H;
    static int W;
    static int Ch;
    static int Cw;
    static int Dh;
    static int Dw;
    static char[][] maze;
    static boolean[][] find;
    static int[] X = new int[] { 0, 1, 0, -1 };
    static int[] Y = new int[] { 1, 0, -1, 0 };
    static int ans = Integer.MAX_VALUE;
    static boolean findAns = false;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        H = sc.nextInt();
        W = sc.nextInt();
        Ch = sc.nextInt() - 1;
        Cw = sc.nextInt() - 1;
        Dh = sc.nextInt() - 1;
        Dw = sc.nextInt() - 1;
        maze = new char[H][W];
        find = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            maze[i] = s.toCharArray();
        }
        LinkedList<int[]> queue = new LinkedList<>();
        dfs(Ch, Cw, queue, 0);
        int count = 1;
        while (!queue.isEmpty() && ans == Integer.MAX_VALUE) {
            int size = queue.size();
            for (int a = 0; a < size; a++) {
                int[] pop = queue.pollFirst();
                if (inMaze(pop[0], pop[1])) {
                    int newX = pop[0] - 2;
                    int newY = pop[1] - 2;
                    for (int i = newX; i < newX + 5; i++) {
                        for (int j = newY; j < newY + 5; j++) {
                            if (inMaze(i, j)) {
                                if (!find[i][j] && maze[i][j] != '#') {
                                    dfs(i, j, queue, count);
                                }
                            }
                        }
                    }
                }
            }
            count++;
        }
        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    public static void dfs(int height, int width, LinkedList<int[]> queue, int count) {
        if (!inMaze(height, width)) {
            return;
        }
        if (find[height][width] || maze[height][width] == '#')
            return;
        find[height][width] = true;
        if (height == Dh && width == Dw) {
            ans = Math.min(count, ans);
            findAns = true;
        }
        queue.addLast(new int[] {height, width});
        for (int i = 0; i < 4; i++) {
            int newX = height + X[i];
            int newY = width + Y[i];
            dfs(newX, newY, queue, count);
        }
    }

    public static boolean inMaze(int x, int y) {
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length;
    }

    public static PrintWriter out;

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}
