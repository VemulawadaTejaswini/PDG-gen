import java.util.Scanner;

public class Main {

	static final int INF = 10000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] cost = new int[10][10];
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[] num = new int[10];
		int ans = 0;

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				cost[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
				}
			}
		}

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int b = sc.nextInt();
				if(b != -1) num[b]++;
			}
		}

		for(int i = 0; i < 10; i++) {
			ans += num[i] * cost[i][1];
		}

		System.out.println(ans);

		sc.close();
	}
}