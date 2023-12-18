import java.util.Scanner;

class Main{
  
 private static long solve(int[] weight, int[] value, int N, int W) {
  	long[][] T = new long[N][W+1];
  	
    for (int wt = weight[0]; wt <= W; wt++)
  	  T[0][wt] = value[0]; 
  	for(int i = 1; i < N; i++) {
        T[i][weight[i]] = value[i];
  		for(int w = 1; w <= W; w++) {
  			if(w >= weight[i]) {
  				T[i][w] = Math.max(T[i-1][w], T[i-1][w - weight[i]] + value[i]);
  			}
          	else{
              	T[i][w] = T[i-1][w];
            }
  		}
  	}
  	return T[N-1][W];
  }
    
 public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int W = sc.nextInt();

      int[] weight = new int[N] ;
      int[] value = new int[N] ;

      for(int i = 0; i< N; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
      }
      System.out.println(solve(weight, value, N, W));
      if(sc != null)
        sc.close();
  }
}
