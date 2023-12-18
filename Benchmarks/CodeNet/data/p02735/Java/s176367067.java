// package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // フィールド
    static char[][] field;
    // 最小反転回数
    static int retMinCnt = Integer.MAX_VALUE;

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final int H = sc.nextInt();
        final int W = sc.nextInt();

        field = new char[H][W];
        for (int i = 0; i < H; i++) {
            final String line = sc.next();
            for (int j = 0; j < W; j++) {
                field[i][j] = line.charAt(j);
            }
        }

        // for(int i = 0; i < H; i++){
        // System.out.println(field[i]);
        // }

        // 深さ有線探索を行う
        // 方向は右または下にしか行かない
        int cnt = 0;
        if (field[0][0] == '#') cnt++;
        int result = SearchMinRoute(0, 0, H, W, cnt);
        System.out.println(result);
    }

    private static int SearchMinRoute(final int r, final int c, int destH, int destW, int retCnt) {

        // 既に最小回数を超えていた場合は探索を終了する。
        if (retCnt > retMinCnt)
            return Integer.MAX_VALUE;
        // もしHとWの座標ならば終了
        if (r == destH - 1 && c == destW - 1) {
            retMinCnt = Math.min(retMinCnt, retCnt);
            return retCnt;
        }

        int downRouteCnt = Integer.MAX_VALUE;
        if (r + 1 < destH) {
            int tmpCnt = 0;
            if (field[r][c] == '.' && field[r + 1][c] == '#')
                tmpCnt++;
            downRouteCnt = SearchMinRoute(r + 1, c, destH, destW, retCnt + tmpCnt);
        }
        int rightRouteCnt = Integer.MAX_VALUE;
        if (c + 1 < destW) {
            // 現在の座標が白かつ次の座標が黒の場合はカウントを+1する。
            int tmpCnt = 0;
            if (field[r][c] == '.' && field[r][c + 1] == '#')
                tmpCnt++;
            rightRouteCnt = SearchMinRoute(r, c + 1, destH, destW, retCnt + tmpCnt);
        }

        int result = Math.min(downRouteCnt, rightRouteCnt);
        return result;
    }
}