

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] a = new int[n][m];
        int [] b = new int [m];
        int[] c = new int[n];
        
        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                c[i] += a[i][j] * b[j];
            }
        }
        for(int res : c) System.out.println(res);
    }
}

