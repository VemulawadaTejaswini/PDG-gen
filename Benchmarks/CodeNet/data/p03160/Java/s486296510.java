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
		 int oneD = H[i] - H[i - 1]; if(oneD<0)oneD = -oneD;
		 int twoD = H[i] - H[i - 2]; if(twoD<0)twoD = -twoD;
		 int oneStep = DP[i-1] + oneD;
		 int twoStep = DP[i-2] + twoD;

		 int dp = oneStep > twoStep ? twoStep: oneStep;
		 DP[i] = dp;	
	 }
	out.println(DP[N - 1]);
  }
}