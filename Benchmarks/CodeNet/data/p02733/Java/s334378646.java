import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();

        char[][] map = new char[H][W];
        int white = 0;
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                map[i][j] = s.charAt(j);
                if (map[i][j] == '1') white++;
            }
        }

        final Solver solver = new Solver();
        System.out.println(solver.solve(H, W, K, map, white));
    }
}

class Solver {
    public int solve(int H, int W, int K, char[][] map, int white) {
        return split(K, 0, 0, W, H, map, white);
    }

    private int split(int K, int left, int top, int right, int bottom, char[][] map, int white) {
        if (white <= K) return 0;

        int min = Integer.MAX_VALUE;
        for (int i = top + 1; i < bottom; i++) {
            int w = calcWhite(left, top, right, i, map);
            int m = split(K, left, top, right, i, map, w) + split(K, left, top, i, bottom, map, white - w) + 1;
            min = Math.min(min, m);
        }

        for (int i = left + 1; i < right; i++) {
            int w = calcWhite(left, top, i, bottom, map);
            int m = split(K, left, top, i, bottom, map, w) + split(K, i, top, right, bottom, map, white - w) + 1;
            min = Math.min(min, m);
        }

        return min;
    }

    private int calcWhite(int left, int top, int right, int bottom, char[][] map) {
        int ans = 0;
        for (int i = top; i < bottom; i++) {
            for (int j = left; j < right; j++) {
                if (map[i][j] == '1') ans++;
            }
        }
        return ans;
    }
}


