
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int w = in.nextInt();
		Obj[] object = new Obj[n+1];
		for (int i = 1; i < object.length; i++) {
			object[i] = new Obj(in.nextInt(), in.nextInt());
		}
		int[][] value = new int[n+1][w+1];

		// 初期設定
		for (int i = 0; i < w+1; i++) {
			if (i < object[1].weight) {
				continue;
			}
			value[1][i] = value[1][i-object[1].weight] + object[1].value;
		}

		// DP
		for (int i = 2; i < n+1; i++) {
			for (int j = 0; j < w+1; j++) {
				if (j < object[i].weight) {
					value[i][j] = value[i-1][j];
					continue;
				}
				int a = value[i-1][j];
				int b = value[i][j-object[i].weight] + object[i].value;
				value[i][j] = Math.max(a, b);
			}
		}

		System.out.println(value[n][w]);


	}
	static class Obj {
		int value;
		int weight;

		public Obj(int v, int w) {
			value = v;
			weight = w;
		}
	}

}

