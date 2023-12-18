// Java program to print distinct 
// subset sums of a given array. 
import java.io.*; 
import java.util.*; 

public class Main{ 

	// Uses Dynamic Programming to 
	// find distinct subset sums 
	static int printDistSum(int arr[], int n) 
	{ 
		int sum = 0; 
		for (int i = 0; i < n; i++) 
			sum += arr[i]; 

		// dp[i][j] would be true if arr[0..i-1] 
		// has a subset with sum equal to j. 
		boolean[][] dp = new boolean[n + 1][sum + 1]; 

		// There is always a subset with 0 sum 
		for (int i = 0; i <= n; i++) 
			dp[i][0] = true; 

		// Fill dp[][] in bottom up manner 
		for (int i = 1; i <= n; i++) 
		{ 
			dp[i][arr[i - 1]] = true; 
			for (int j = 1; j <= sum; j++) 
			{ 
				// Sums that were achievable 
				// without current array element 
				if (dp[i - 1][j] == true) 
				{ 
					dp[i][j] = true; 
					dp[i][j + arr[i - 1]] = true; 
				} 
			} 
		} 
		int c=0;
		// Print last row elements 
		for (int j = 0; j <= sum; j++) 
			if (dp[n][j] == true) 
				c++;
      
      return c;
	} 

		// Driver code 
	public static void main(String[] args) 
	{ 
      Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      int x=s.nextInt();
      int d=s.nextInt();
		int arr[] = new int[n]; 
		//int n = arr.length; 
			
      
      arr[0]=x;
      for(int i=1;i<n;i++)
        arr[i]=(arr[i-1]+d)%1000000007;
      
      System.out.println(printDistSum(arr, n)); 
	} 
} 

