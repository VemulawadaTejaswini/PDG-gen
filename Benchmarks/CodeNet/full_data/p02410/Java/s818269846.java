import java.util.*;

public class Main {
    public static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt(), w = scn.nextInt();
        int[] ary = new int[MAX];
        int[][] tbl = new int[MAX][MAX];
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; tbl[i][j++] = scn.nextInt());
        }
        for(int i = 0; i < w; ary[i++] = scn.nextInt());
        for(int i = 0; i < h; i++) {
            int v = 0;
            for(int j = 0; j < w; v += tbl[i][j] * ary[j++]);
            System.out.println(v);
        }
    }
}