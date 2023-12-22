import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int minDistance = Integer.MAX_VALUE;
		int resident[][] = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				resident[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				minDistance = Math.min(minDistance, calcDistance(i, j, resident));
			}
		}

		System.out.println(minDistance);
	}

	//aもしくはbとcの要素1つ1つとの距離の小さいほうの総和を求めるメソッド
	public static int calcDistance(int a, int b, int[][] c) {
		int total = 0;
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[0].length; j++) {
				total += c[i][j] * Math.min(Math.abs(a - i), Math.abs(b - j));
			}
		}

		return total;
	}

}

