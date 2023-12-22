import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int[][] b = new int[m][l];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < l; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        int[][] c = new int[n][l];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                for(int k = 0; k < m; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i][0]);
            for(int j = 1; j < c[i].length; j++){
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
    }
}
