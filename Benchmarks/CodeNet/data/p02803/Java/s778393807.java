import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    static int H;
    static int W;
    static int[][] maze;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        H = nextInt();
        W = nextInt();

        maze = new int[H+2][W+2];
        for (int i = 0; i < H+2; i++) {
            for (int j = 0; j < W+2; j++) {
                if (i == 0 || i == H+1 || j == 0 || j == W+1) {
                    maze[i][j] = -1;
                    continue;
                }
                int c = r.read();
                if (c == 32 || c == 10 || c == -1) {
                    c = r.read();
                }
                String Sij = "" + (char)c;
                if (Sij.equals("#")) {
                    maze[i][j] = -1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < H+2; i++) {
            for (int j = 0; j < W+2; j++) {
                if (maze[i][j] != -1) {
                    max = Math.max(max, check(copy(i, j)));
                }
            }
        }

        int ans = max - 1;
        System.out.println(ans);
    }

    public static int[][] copy(int h, int w) {
        int[][] res = new int[H+2][W+2];
        for (int i = 0; i < H+2; i++) {
            for (int j = 0; j < W+2; j++) {
                res[i][j] = maze[i][j];
            }
        }
        res[h][w] = 1;
        return res;
    }

    public static int check(int[][] tmp) {
        int res = 1;
        while (true) {
            boolean update = false;
            for (int i = 0; i < H+2; i++) {
                for (int j = 0; j < W+2; j++) {
                    if (tmp[i][j] == res) {
                        if (tmp[i-1][j] == 0) {
                            tmp[i-1][j] = res + 1;
                            update = true;
                        }
                        if (tmp[i][j-1] == 0) {
                            tmp[i][j-1] = res + 1;
                            update = true;
                        }
                        if (tmp[i][j+1] == 0) {
                            tmp[i][j+1] = res + 1;
                            update = true;
                        }
                        if (tmp[i+1][j] == 0) {
                            tmp[i+1][j] = res + 1;
                            update = true;
                        } 
                    }
                }
            }
            if (update == true) {
                res++;
            } else {
                break;
            }
        }
        return res;
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }
}