import java.util.Scanner;
// A Dynamic Programming based solution for 0-1 Knapsack problem 
public class Main 
{ 

	// A utility function that returns maximum of two integers 
	static int max(int a, int b) { return (a > b)? a : b; } 
	
// Returns the maximum value that can be put in a knapsack of capacity W 
	static int knapSack(int W, int wt[], int val[], int n) 
	{ 
		int i, w; 
	int K[][] = new int[n+1][W+1]; 
	
	// Build table K[][] in bottom up manner 
	for (i = 0; i <= n; i++) 
	{ 
		for (w = 0; w <= W; w++) 
		{ 
			if (i==0 || w==0) 
				K[i][w] = 0; 
			else if (wt[i-1] <= w) 
				K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]], K[i-1][w]); 
			else
				K[i][w] = K[i-1][w]; 
		} 
	} 
	
	return K[n][W]; 
	} 

	
	// Driver program to test above function 
	public static void main(String args[]) 
	{ 
		Scanner  in = new Scanner (System.in);
		int n = in.nextInt();
		int w = in.nextInt();
		int val[] = new int [n]; 
	int wt[] = new int[n]; 
 
	for(int i =0; i<n ; i++)
		{
			val[i]= in.nextInt();
			wt[i] = in.nextInt();
		}
		
	System.out.println(knapSack(w, val, wt, n)); 
	} 
} 
/*This code is contributed by Rajat Mishra */
