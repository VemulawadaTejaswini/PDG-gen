import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // board[i][j]: 迷路
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        Set<Integer> ngr = new HashSet<Integer>();
        for (int i = 0; i < h; i++) {
            boolean ng = true;
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '#') {
                    ng = false;
                    break;
                }
            }
            
            if (ng) {
                ngr.add(i);
            }
        }
        Set<Integer> ngc = new HashSet<Integer>();
        for (int j = 0; j < w; j++) {
            boolean ng = true;
            for (int i = 0; i < h; i++) {
                if (board[i][j] == '#') {
                    ng = false;
                    break;
                }
            }
            
            if (ng) {
                ngc.add(j);
            }
        }
        
        for (int i = 0; i < h; i++) {
            if (ngr.contains(i)) continue;
            for (int j = 0; j < w; j++) {
                if (ngc.contains(j)) {
                    
                } else {
                    System.out.print(board[i][j]);
                }
                
                if (j != w - 1) {
                } else {
                    System.out.println();
                }
            }
        }
        
    }
}