import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int n; (n = scn.nextInt()) > 0;) {
            printTable(createTable(n));
        }
    }
    
    private static int[][] createTable(int n) {
        int[][] tbl = new int[n + 1][n + 1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int v = scn.nextInt();
                tbl[i][j] = v;
                tbl[i][n] += v;
                tbl[n][j] += v;
                tbl[n][n] += v;
            }
        }
        return tbl;
    }
    
    private static void printTable(int[][] tbl) {
        for(int[] ary : tbl) {
            for(int elm : ary) {
                System.out.format("%5d", elm);
            }
            System.out.println();
        }
    }
}