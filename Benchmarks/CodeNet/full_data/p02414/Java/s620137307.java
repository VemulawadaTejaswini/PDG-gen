import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        int[][] c = new int[n][l];
        
        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i < m; i++){
            for(int j=0; j < l; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        for(int k=0; k<m; k++){
           for(int i=0; i<n; i++){
               for(int j=0; j<l; j++){
                    c[i][j] += a[i][k] * b[k][j];
               }
            } 
        }
        
       for(int i=0; i<n; i++){
               for(int j=0; j<l; j++){
                    System.out.print(c[i][j]);
                    if(i != n-1 || j != l-1) System.out.print(" ");
               }
               if(i != n-1) System.out.println();
            }
        
    }
}

