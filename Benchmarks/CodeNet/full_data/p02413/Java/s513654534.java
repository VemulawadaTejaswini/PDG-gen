import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] su = new int[r+1][c+1];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                su[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < r; i++) {
            int tmp = 0;
            
            for (int j = 0; j < c + 1; j++) {
                if (j != c) {
                    tmp += su[i][j];        
                }
                else {
                    su[i][j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < c + 1; i++) {
            int tmp = 0;
            
            for (int j = 0; j < r + 1; j++) {
                if (j != r) {
                    tmp += su[j][i];
                }
                else {
                    su[j][i] = tmp;
                }
            }
        }
        
        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                if (j != c) {
                    System.out.printf("%d ", su[i][j]);
                }
                else {
                    System.out.printf("%d\n", su[i][j]);
                }
            }
        }
    }
}
