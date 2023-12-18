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
		D.sort(Comparator.comparingInt((ToIntFunction<Dish>)d -> d.B)
					.thenComparingInt((ToIntFunction<Dish>)d -> d.A));
		Dish last = D.remove(D.size() - 1);
		
		dp = new int[N][T];
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < T; j++) {
				Dish d = D.get(i-1);
				if (j >= d.A) {
					dp[i][j] = Math.max(dp[i-1][j - d.A] + d.B, dp[i-1][j]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[N-1][T-1] + last.B);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}