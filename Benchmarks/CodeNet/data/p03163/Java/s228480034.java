import java.util.*;
import java.io.*;

class Item {
	int weight, val;
	public Item(int weight, int val) {
		this.weight = weight;
		this.val = val;
	}
}
public class Main {


	public static void main(String[] args) {
		Main answer = new Main();
		System.out.println(answer.solve());
	}

	private long solve() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxWeight = sc.nextInt();
		Item[] array = new Item[N+1];
		for(int i=1;i<=N;i++) {
			array[i] = new Item(sc.nextInt(), sc.nextInt());
		}
		//dp[i][j] = max value of in bag holding i items of maximum weight j
		// required dp[N][W]
 		long [][] dp = new long[N+1][maxWeight+1];

		dp[0][0] = 0;
		 
 		for(int w=0;w<=maxWeight;w++){
			dp[1][w]=0;
		}

		dp[1][array[1].weight] = array[1].val;
		 
  
		for(int i=2;i<=N;i++){
			for(int w=0;w<=maxWeight;w++){
				dp[i][w] = dp[i-1][w];
				if (array[i].weight<=w) dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-array[i].weight] + array[i].val);
			}
		}
		/*
		for(int i=1;i<=N;i++){
			System.out.println(Arrays.toString(dp[i]));
		}*/

		return dp[N][maxWeight];

	}
}
