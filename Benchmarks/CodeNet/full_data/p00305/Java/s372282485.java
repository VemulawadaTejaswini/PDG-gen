import java.util.*;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[][] p = new int[N][N];
       for(int i = 0; i < N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   p[i][j] = sc.nextInt();
    	   }
       }
       int[][] sum = new int[N+1][N+1];
       for(int i = 1; i <= N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   sum[i][j + 1] += sum[i][j] + p[i-1][j];
    	   }
       }
       for(int i = 0; i <= N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   sum[j + 1][i] += sum[j][i];
    	   }
       }
       
       int max = p[0][0];
       for(int i = 0; i < N; i++) {
    	   for(int j = 0; j < N; j++) {
    		   for(int k = i + 2; k <= N; k++) {
    			   for(int l = j + 2; l <= N; l++) {
    				   int sumA = sum[k][l] + sum[i][j] - sum[k][j] - sum[i][l];
    				   int sumB = sum[k-1][l-1] + sum[i+1][j+1] - sum[k-1][j+1] - sum[i+1][l-1];
    				   max = Math.max(max, sumA - sumB);
    			   }
    		   }
    	   }
       }
       System.out.println(max);
   }
}