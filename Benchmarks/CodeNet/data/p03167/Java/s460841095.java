import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] board = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            board[i] = new boolean[m];
            String s = sc.next();
            for(int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j) != '#';
            }
        }
        long[][] res = new long[n][m];
        res[n - 1][m - 1] = 1;
        int rem = 1000000007;
        for(int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if( i == n - 1 && j == m - 1) {
                    continue;
                }
                int curRes = 0;
                if(i + 1 < n && board[i + 1][j]) {
                    curRes += res[i + 1][j];
                }
                if(j + 1 < m && board[i][j + 1]) {
                    curRes += res[i][j + 1];
                }
                res[i][j] = curRes % rem;
            }
        }
        System.out.println(res[0][0]);
    }
}