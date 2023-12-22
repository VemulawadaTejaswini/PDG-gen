import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        long[][] aij = new long[n][m];
        long[][] bij = new long[m][l];
        long[][] cij = new long[n][l];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                cij[i][j] = 0;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                aij[i][j] = sc.nextLong();
            }
        }
         for(int i = 0; i < m; i++){
            for(int j = 0; j < l; j++){
                bij[i][j] = sc.nextLong();
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
            	for(int k = 0; k < m; k++){
                	cij[i][j] += aij[i][k]*bij[k][j];
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l-1; j++){
               	System.out.print(cij[i][j] + " ");
            }
			System.out.println(cij[i][l-1]);
        }
    }

}
