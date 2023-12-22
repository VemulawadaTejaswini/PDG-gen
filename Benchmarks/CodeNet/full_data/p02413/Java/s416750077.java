import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int r = scn.nextInt(), c = scn.nextInt();
        showTable(createTable(r, c));
    }
    
    private static int[][] createTable(int r, int c) {
        int[][] tbl = new int[r + 1][c + 1];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                int v = scn.nextInt();
                tbl[i][j] += v;
                tbl[i][c] += v;
                tbl[r][j] += v;
                tbl[r][c] += v;
            }
        }
        return tbl;
    }
    
    private static void showTable(int[][] tbl) {
        for(int[] ary : tbl) {
            StringBuilder sb = new StringBuilder();
            for(int elm : ary) {
                sb.append(elm + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}