import java.util.*;

public class Main {

    private static final int INF = 1_000_000_000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();
        int[] rowCnt = new int[H];
        int[] colCnt = new int[W];
        int[] HH = new int[M];
        int[] WW = new int[M];
        for (int i = 0; i < M; i++) {
            int h = sc.nextInt()-1;
            int w = sc.nextInt()-1;
            rowCnt[h]++;
            colCnt[w]++;
            HH[i] = h;
            WW[i] = w;
        }
        
        int maxRowCnt = 0;
        for (int i = 0; i < H; i++) {
            maxRowCnt = Math.max(maxRowCnt, rowCnt[i]);
        }
        int mr = 0;
        for (int i = 0; i < H; i++) {
            if (rowCnt[i] == maxRowCnt) mr++;
        }


        int maxColCnt = 0;
        for (int i = 0; i < W; i++) {
            maxColCnt = Math.max(maxColCnt, colCnt[i]);
        }
        int mc = 0;
        for (int i = 0; i < H; i++) {
            if (colCnt[i] == maxColCnt) mc++;
        }

        long mm = 0;
        for (int i = 0; i < M; i++) {
            if (rowCnt[HH[i]] + colCnt[WW[i]] == maxRowCnt + maxColCnt) mm++;
        }

        System.out.println(mm == (long)mc*mr ? maxRowCnt+maxColCnt-1 : maxRowCnt+maxColCnt);
    }
}
