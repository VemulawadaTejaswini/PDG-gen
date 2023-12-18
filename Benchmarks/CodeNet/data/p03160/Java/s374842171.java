import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] H = new int[N];
	  for(int i=0; i<N; i++) {
		  H[i] = sc.nextInt();
	  }
	 int[] DP = new int[N];
	 DP[0] = 0; DP[1] = H[1] - H[0];  if(DP[1]< 0) DP[1]= -DP[1];
	 
	 for(int i = 2; i< N; i++) {
		 int oneStep = H[i] - DP[i - 1]; if(oneStep<0) oneStep = -oneStep;
		 int twoStep = H[i] - DP[i - 2]; if(twoStep<0) twoStep = -twoStep;
		 int dp = oneStep > twoStep ? twoStep: oneStep;
		 DP[i] = dp;	
	 }
	out.println(DP[N]);
  }
}