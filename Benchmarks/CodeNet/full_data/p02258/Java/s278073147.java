import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
	}
	
	public Main() {
		
		//Variables to use
		Scanner input = new Scanner(System.in);
		int n;
		int[] R;
		
		//Get the number of inputs
		n = input.nextInt();
		
		//Create the array of values of size n
		R = new int[n];
		
		//Fill the values in the R array from the scanner
		for(int i = 0; i < n; i++) {
			
			R[i] = input.nextInt(); 
			
		}
		
		//Print out the returned value of the maxProfit function
		System.out.println(maxProfit(n, R));
		
	}
	
	public int maxProfit(int n, int[] R) {
		
		//Set the current max profit to a very negative number
		int maximumProfit = -1000000000;
		
		//At first the minimum is set to the very first index
		int minimumProfit = R[0];
		
		//Loop through the rest
		for(int i = 1; i < n; i++) {
			
			//Get the max of the max or the current index minus the minimum
			maximumProfit = Math.max(maximumProfit, R[i] - minimumProfit);
			
			//Set the minimum profit to the minimum of the minimum profit or the current index
			minimumProfit = Math.min(minimumProfit, R[i]);
			
		}
		
		//return the max profit
		return maximumProfit;
		
	}

}

