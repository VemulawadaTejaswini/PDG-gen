import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] board = new int[H + 1][W + 1];
        for (int y = 0; y < H; y++) {
            char[] s = sc.next().toCharArray();
            for (int x = 0; x < W; x++) {
                board[y][x] = s[x];
            }
        }
        for (int y = 0; y < H; y++) {
            int cnt = 0;
            for (int x = 0; x < W; x++) {
                if (board[y][x] == '#')
                    cnt++;
            }
            board[y][W] = cnt;
        }
        for (int x = 0; x < W; x++) {
            int cnt = 0;
            for (int y = 0; y < H; y++) {
                if (board[y][x] == '#')
                    cnt++;
            }
            board[H][x] = cnt;
        }

        for (int y = 0; y < H; y++) {
            if (board[y][W] == 0)
                continue;
            for (int x = 0; x < W; x++) {
                if (board[H][x] == 0)
                    continue;
                System.out.print((char) board[y][x]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
