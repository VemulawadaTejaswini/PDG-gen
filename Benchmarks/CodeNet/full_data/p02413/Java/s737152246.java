import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] sheet = new int[r+1][c+1];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sheet[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < r; i++) {
            int tmp = 0;
            
            for (int j = 0; j < c + 1; j++) {
                if (j != c) {
                    tmp += sheet[i][j];        
                }
                else {
                    sheet[i][j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < c + 1; i++) {
            int tmp = 0;
            
            for (int j = 0; j < r + 1; j++) {
                if (j != r) {
                    tmp += sheet[j][i];
                }
                else {
                    sheet[j][i] = tmp;
                }
            }
        }
        
        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                if (j != c) {
                    System.out.printf("%d ", sheet[i][j]);
                }
                else {
                    System.out.printf("%d\n", sheet[i][j]);
                }
            }
        }
    }
}