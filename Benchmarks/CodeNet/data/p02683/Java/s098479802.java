import java.util.*;
public class Main {
    public static void main(String[] args){
      Integer N = s.nextInt();
      Integer M = s.nextInt();
      Integer X = s.nextInt();
      int[] C = new int[N];
      int[][] A = new int[N][M];
      for(int i = 0; i < N; i++) {
    	  C[i] = s.nextInt();
    	  for(int j = 0; j < M; j++) {
    		  A[i][j] = s.nextInt();
    	  }
      }
      
      int resultPrice = 0;
      int[] resultParam = new int[M];
      for(int k = 0; k < (1<<N); k++) {
    	  int currentPrice = 0;
    	  int[] currentParam = new int[M];
    	  for(int m = 0; m < N; m++) {
    		  if(((k>>m) & 1 )== 1) {
    			  addArrays(currentParam, A[m]);
    			  currentPrice += C[m];
    		  }
    	  }
    	  if(check(currentParam, X)) {
    		  resultPrice = resultPrice > currentPrice || resultPrice == 0 ? currentPrice : resultPrice;
    	  }
      }
      System.out.println(resultPrice);
    }
}

