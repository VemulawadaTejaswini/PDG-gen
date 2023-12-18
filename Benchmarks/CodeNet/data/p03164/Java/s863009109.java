import java.util.Scanner;

class Main{

  private static long solve(long[] weight, long[] value, int N, long W) {
    if(weight == null || value == null) 
      return 0;
  	long[][] T = new long[N][W+1];
  	
    if(weight[0] <= W)
		T[0][weight[0]] = value[0]; 
        
  	for(int i = 1; i < N; i++) {
  		for(long w = 1; w <= W; w++) {
  			if(w >= weight[i]) {
  				T[i][w] = Math.max(T[i-1][w], T[i-1][w - weight[i]] + value[i]);
  			} else {
  				T[i][w] = T[i-1][w];
  			}
  		}
  	}
  	
  	return T[N-1][W];
  	
  }
  
  public static void main(String... args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      long W = sc.nextInt();
     
      long[] weight = new long[N] ;
      long[] value = new long[N] ;
      
      for(int i = 0; i< N; i++){
            weight[i] = sc.nextLong();
            value[i] = sc.nextLong();
      }
      System.out.println(solve(weight, value, N, W));
      if(sc != null)
        sc.close();
  }
}
