import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class Main {
	public static void main(String args[]) {
		new Main().run();
	}
	
	int toInt(String s) {
		return Integer.parseInt(s);
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int caseNumber = 1;
		while(true) {
			int W = sc.nextInt();
			if(W == 0) break;
			int N = sc.nextInt();

			int[] value = new int[N];
			int[] weight = new int[N];
			
			sc.skip("\n");
			
			for(int i = 0; i < N; i++) {
				String line = sc.nextLine();
				value[i] = toInt(line.split(",")[0]);
				weight[i] = toInt(line.split(",")[1]);
			}
			
			/*
			out.println("W: " + W);
			out.println("N: " + N);
			
			for(int i = 0; i < N; i++) {
				out.println("item: " + i + " -> " + value[i] + ":" + weight[i]);
			}
			*/
			
			int[][] dp = new int[N+1][W+1];
			for(int i = 0; i < N + 1; i++)
				for(int j = 0; j < W + 1; j++)
					dp[i][j] = 0;

			for(int item = 0; item < N; item++) {
				for(int cur = 0; cur <= W; cur++) {
					int v = value[item];
					int w = weight[item];

					if(w <= cur) {
						dp[item + 1][cur] = Math.max(dp[item][cur], dp[item][cur - w] + v);
					} else {
						dp[item + 1][cur] = dp[item][cur];
					}
				}
			}
			
			int ansWeight = W;
			int ansValue = dp[N][W];

			for(int j = W; j >= 0; --j) {
				if(dp[N][j] == ansValue)
					ansWeight = j;
			}
			
			out.println("Case " + caseNumber + ":");
			caseNumber++;
			out.println(ansValue);
			out.println(ansWeight);
		}
	}
}