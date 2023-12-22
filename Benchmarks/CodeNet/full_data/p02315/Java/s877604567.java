import java.util.Scanner;
class KnapsackProblem1 {
    public int knapsack (int[] value, int[] weight, int maxWeight) {
	int n = value.length;
	int[][] dp = new int[n + 1][maxWeight + 1];
	for (int i = n - 1; i >= 0; i--) {
	    for (int j = 0; j <= maxWeight; j++) {
		if (j < weight[i]) {
		    dp[i][j] = dp[i+1][j];
		}
		else {
		    dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j - weight[i]] + value[i]);
		}
	    }
	}
	return dp[0][maxWeight];
    }
}

public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input = scan.nextLine().split(" ");
	int n = Integer.parseInt(input[0]);
	int maxWeight = Integer.parseInt(input[1]);
	int[] value = new int[n];
	int[] weight = new int[n];
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    value[i] = Integer.parseInt(input[0]);
	    weight[i] = Integer.parseInt(input[1]);
	}
	KnapsackProblem1 kp = new KnapsackProblem1();
	System.out.println(kp.knapsack(value, weight, maxWeight));
    }
}