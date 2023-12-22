import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scn.nextInt(), m  = scn.nextInt(), l = scn.nextInt();
        showMatrix(createTable(n, m), createTable(m, l));
    }
    
    private static int[][] createTable(int y, int x) {
        int[][] tbl = new int[y][x];
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                tbl[i][j] = scn.nextInt();
            }
        }
        return tbl;
    }
    
    private static void showMatrix(int[][] a, int[][] b) {
        for(int i = 0; i < a.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < b[0].length; j++) {
                long v = 0;
                for(int k = 0; k < b.length; k++) {
                    v += a[i][k] * b[k][j];
                }
                sb.append(v + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}