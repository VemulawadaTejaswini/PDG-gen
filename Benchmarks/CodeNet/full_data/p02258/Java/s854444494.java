import java.util.Scanner;

public class Main{

	  //given n times, and R, an array of currencies
	  public static int compute_maxprofit(int n, int[] R){
		  int max_profit = -999999999;
		  for(int i = 0; i < n-1; i++){
			  for(int j = i+1; j < n; j++){
					if(R[j] - R[i] > max_profit)
						max_profit = R[j] - R[i];
				  	}
		  }
		  return max_profit;
	  }
	  
	  public static int compute_maxprofitDP(int n, int[] R){
		  int max_profit = -999999999;
		  int minElement = R[0];
		  for(int i = 1; i < n; i++){
			  max_profit = max(R[i]-minElement, max_profit);
			  if(R[i] < minElement)
				  minElement = R[i];
		  }
		  return max_profit;
	  }
	  
	  public static int max(int a, int b){
			return (a>=b) ? a : b;
		}
	  
	  public static void main(String[] argv) {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			int[] R = new int[num];
			for(int i=0; i<num; i++)
			{
				R[i] = in.nextInt();
			}
			System.out.println(compute_maxprofitDP(num, R));
			in.close();
	  }
}

