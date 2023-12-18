import java.util.*;
import java.util.function.ToIntFunction;

class Main {
	Scanner sc;
	int N, T;
	List<Dish> D;
	// 個数,時間
	int[][] dp;
	
	static class Dish {
		int A, B;
		Dish(int a, int b) {
			A = a;
			B = b;
		}
	}
	
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		T = sc.nextInt();
		D = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			D.add(new Dish(sc.nextInt(), sc.nextInt()));
		}
		
		dp = new int[N+1][6000];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < N+1; i++) {
			for (int j = 0; j < 6000; j++) {
				Dish d = D.get(i-1);
				if (j >= d.A && j-d.A < T) {
					dp[i][j] = Math.max(dp[i-1][j - d.A] + d.B, dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
