import java.util.Scanner;

public class Main {
	static int[][] prices;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		prices = new int[x][y];
		for (int i = 0; i < x; i++) {
			int pr = sc.nextInt();
			for (int j = 0; j < y; j++) {
				prices[i][j] = pr;
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < y; i++) {
			int pr = sc.nextInt();
			for (int j = 0; j < x; j++) {
				prices[j][i] += pr;
				min = Math.min(min, prices[j][i]);
			}
		}
		for (int i = 0; i < n; i++) {
			int iX = sc.nextInt();
			int iY = sc.nextInt();
			min = Math.min(min, prices[iX-1][iY-1] - sc.nextInt());
		}
		System.out.println(min);
	}
}
