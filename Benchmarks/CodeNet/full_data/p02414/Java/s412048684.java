import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n, m, l;
        
        n =  sc.nextInt();
        m = sc.nextInt();
        l = sc.nextInt();
        
        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        long[][] c = new long[n][l];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < l; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) {
                c[i][j] = 0;
            }
        }
        
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) {
                for(int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                sb.append(c[i][j]);
                if(j != l-1) sb.append(" ");
            }
            if(i != n-1) sb.append("\n");
        }
        System.out.println(sb);
        
    }
}

