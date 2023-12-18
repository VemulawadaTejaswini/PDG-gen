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
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '.') continue;
                int count = 0;
                if (i-1 >= 0 && board[i-1][j] == '#') count++;
                if (i+1 < h && board[i+1][j] == '#') count++;
                if (j-1 >= 0 && board[i][j-1] == '#') count++;
                if (j+1 < w && board[i][j+1] == '#') count++;
                
                if (count <= 0) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}