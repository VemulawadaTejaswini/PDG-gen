import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int C = in.nextInt();
		int[][] D = new int[C][C];
		for(int i=0;i<C;i++) {
			for(int j=0;j<C;j++) {
				D[i][j] = in.nextInt();
			}
		}
		int[][] colors = new int[3][C];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				int c = in.nextInt();
				colors[((i+1)+(j+1))%3][c-1] ++;
			}
		}
		long[][] costs = new long[3][C];
		for(int i=0;i<3;i++) {
			for(int j=0;j<C;j++) {
				costs[i][j] = moveCost(colors[i],D,j);
			}
		}
		long ans = Long.MAX_VALUE;
		for(int i=0;i<C;i++) {
			for(int j=0;j<C;j++) {
				if(i==j) continue;
				for(int k=0;k<C;k++) {
					if(i==k || j==k) continue;
					ans = Math.min(ans, costs[0][i]+costs[1][j]+costs[2][k]);
				}
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
	
	public long moveCost(int[] colors, int[][] cost, int selectedColor) {
		long sum = 0;
		for(int i=0;i<colors.length;i++) {
			sum += colors[i]*cost[i][selectedColor];
		}
		return sum;
	}
}