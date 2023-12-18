import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        boolean[] ngh = new boolean[h];
        for (int i = 0; i < h; i++) {
            boolean ng = true;
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '#') {
                    ng = false;
                }
            }
            
            if (ng) {
                ngh[i] = true;
            }
        }
        boolean[] ngw = new boolean[w];
        for (int i = 0; i < w; i++) {
            boolean ng = true;
            for (int j = 0; j < h; j++) {
                if (board[j][i] == '#') {
                    ng = false;
                }
            }
            
            if (ng) {
                ngw[i] = true;
            }
        }
        
        for (int i = 0; i < h; i++) {
            if (ngh[i]) continue;
            for (int j = 0; j  <w; j++) {
                if (ngw[j]) continue;
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        
    }
}