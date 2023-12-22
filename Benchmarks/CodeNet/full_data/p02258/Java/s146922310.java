
import java.util.*;

public class Main {
	  public static int Compute_maxprofit(int[] R, int n) {
		  int maxProfit = Integer.MIN_VALUE; 
		  int min = R[0];
	
		  for(int i = 1; i < n; i++) {
			  if(maxProfit < R[i]-min) maxProfit = R[i]-min;
			  if(min>R[i]) min = R[i];
		  }
		  return maxProfit;
	  }
	  
	  public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  int n = in.nextInt();		
		  int[] R = new int[n];
		
		  for(int i = 0; i<n; i++) {
			  R[i]=in.nextInt();
		  }
		
		  System.out.println(Compute_maxprofit(R,n));
		
	  }

}
