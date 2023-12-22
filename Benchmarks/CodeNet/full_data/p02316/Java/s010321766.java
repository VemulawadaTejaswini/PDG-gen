import java.util.Scanner;
class KnapsackProblem {
    int w;
    KnapsackProblem (int w) {
	this.w = w;
    }

    int knapsack (int[] value, int[] weight) {
	int n = value.length;
	int[] dp = new int[w + 1];
	for (int i = 0; i < n; i++) {
	    for (int j = weight[i]; j <= w; j++) {
		dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
	    }
	}
	return dp[w];
    }
}

public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input = scan.nextLine().split(" ");
	int n = Integer.parseInt(input[0]);
	int w = Integer.parseInt(input[1]);
	int[] value = new int[n];
	int[] weight = new int[n];
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    value[i] = Integer.parseInt(input[0]);
	    weight[i] = Integer.parseInt(input[1]);
	}
	KnapsackProblem kp = new KnapsackProblem(w);
	System.out.println(kp.knapsack(value, weight));
    }
}