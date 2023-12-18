import java.util.Scanner;

public class frog1 {
	static int lowestNum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		lowestNum = Integer.MAX_VALUE;
		int[] memo = new int[n];
		for (int i = 0; i < n; i++)
			memo[i] = -1;
		
		System.out.println(frog(arr, arr.length - 1, 0, memo));
	}
	
	public static int frog(int[] arr, int pos, int totalCost, int[] memo) { // pos 0 - indexed
		if (pos == 0)
			return totalCost;
		if (pos == 1)
			return totalCost + Math.abs(arr[1] - arr[0]);
		if (memo[pos] != -1)
			return memo[pos];
		
		int cost1 = frog(arr, pos - 1, totalCost + Math.abs(arr[pos] - arr[pos-1]), memo);
		int cost2 = frog(arr, pos - 2, totalCost + Math.abs(arr[pos] - arr[pos-2]), memo);
		
		memo[pos] = Math.min(cost1, cost2);
		return Math.min(cost1, cost2);
	}
}