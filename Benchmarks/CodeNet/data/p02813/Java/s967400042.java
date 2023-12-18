import java.util.*;
 
public class Main {
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int P[] = new int[N];
    int Q[] = new int[N];
    
    for(int i=0; i<N; i++) {
    	P[i] = sc.nextInt();
    	Q[i] = sc.nextInt();
    }
    
    System.out.println(Math.abs((calc(N,P))-(calc(N,Q))));
    
  }
  
  
  public static int calc(int N, int x[]){
	  
	  int ret = 0;
	  Set<Integer> memo = new HashSet<>();
	  
	  for(int i=0; i<N; i++) {
		  memo.add(x[i]);
		  int cnt = 0;
		  
		  for(int j=1; j<=x[i]; j++) {
			  if(!(memo.contains(j)));
			  cnt++;
		  }
		  ret += (cnt)*factorial(N-i-1);
	  }
	  return ret;
  }
  
  
  static int factorial(int N){
	  if(N == 0) {
		  return 1;
	  }
	  return N * factorial(N-1);
  }
}
//解答中