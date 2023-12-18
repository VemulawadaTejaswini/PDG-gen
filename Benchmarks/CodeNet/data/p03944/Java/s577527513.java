import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        boolean[][] board = new boolean[H][W];
        for (int i = 0; i < N; i++) {
            int qx = sc.nextInt();
            int qy = sc.nextInt();
            int a = sc.nextInt();
            switch (a) {
            case 1:
                for (int y = 0; y < H; y++) {
                    for (int x = 0; x < W; x++) {
                        if (qx > x)
                            board[y][x] = true;
                    }
                }
                break;
            case 2:
                for (int y = 0; y < H; y++) {
                    for (int x = 0; x < W; x++) {
                        if (qx <= x)
                            board[y][x] = true;
                    }
                }
                break;
            case 3:
                for (int y = 0; y < H; y++) {
                    for (int x = 0; x < W; x++) {
                        if (qy > y)
                            board[y][x] = true;
                    }
                }
                break;
            case 4:
                for (int y = 0; y < H; y++) {
                    for (int x = 0; x < W; x++) {
                        if (qy <= y)
                            board[y][x] = true;
                    }
                }
                break;
            }
        }

        for (int y = 0; y < H; y++) {
            // System.out.println(Arrays.toString(board[y]));
            for (int x = 0; x < W; x++) {
                if (!board[y][x])
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
