import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int[][] grid = new int[H][W];
        int index = 0;
        int i=0;
        while (i<H*W) {
            for (int j=0;j<a[index];j++) {
                grid[i/W][i%W]=index+1;
                i++;
            }
            index++;
        }
        for (int i=0;i<H;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<W;j++) {
                sb.append(grid[i][j]);
            }
            System.out.println(sb);
        }
    }
}