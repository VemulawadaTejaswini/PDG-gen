import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ci;
        
        int[][] aij = new int[n][m];
        int[] bj = new int[m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                aij[i][j] = sc.nextInt();
            }
        }
        for(int j = 0; j < m; j++){
               bj[j] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            ci = 0;
            for(int j = 0; j < m; j++){
               ci += aij[i][j]*bj[j];
            }
            System.out.println(ci);
        }
    }
}
