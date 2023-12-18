import java.util.*;

public class Main {
    static char[][] board;
    static int r;
    static int c;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        board = new char[r + 2][c + 2];
        for (char[] b : board) {
            Arrays.fill(b, '#');
        }
        for (int i = 1; i <= r; i++) {
            String str = sc.next();
            for (int j = 1; j <= c; j++) {
                board[i][j] = str.charAt(j - 1);
            }
        }
        
        int count = 0;
        int[][] yokoline = new int[r + 2][c + 2];
        for (int i = 1; i <= r; i++) {
            for (int j = 0; j <= c + 1; j++) {
                if (board[i][j] == '#') {
                    if (count == 0) {
                        continue;
                    } else {
                        for (int k = j - 1; k >= j - count; k--) {
                            yokoline[i][k] = count;
                        }
                        count = 0;
                    }
                } else {
                    count++;
                }
            }
            // System.out.println(Arrays.toString(yokoline[i]));
        }

        count = 0;
        int[][] tateline = new int[r + 2][c + 2];
        for (int j = 1; j <= c; j++) {
            for (int i = 0; i <= r + 1; i++) {
                if (board[i][j] == '#') {
                    if (count == 0) {
                        continue;
                    } else {
                        for (int k = i - 1; k >= i - count; k--) {
                            tateline[k][j] = count;
                        }
                        count = 0;
                    }
                } else {
                    count++;
                }
            }
        }
        
        int max = 0;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                max = Math.max(yokoline[i][j] + tateline[i][j] - 1, max);
            }
        }
        
        System.out.println(max);
        
    }
    
    public static int check(int i, int j) {
        if (board[i][j] == '#') return 0;
        
        int count = 1;
        
        for (int x = i - 1; x >= 1; x--) {
            if (board[x][j] == '#') break;
            count++;
        }
        for (int x = i + 1; x <= r; x++) {
            if (board[x][j] == '#') break;
            count++;
        }
        for (int y = j - 1; y >= 1; y--) {
            if (board[i][y] == '#') break;
            count++;
        }
        for (int y = j + 1; y <= c; y++) {
            if (board[i][y] == '#') break;
            count++;
        }
        
        return count;
    }
}
