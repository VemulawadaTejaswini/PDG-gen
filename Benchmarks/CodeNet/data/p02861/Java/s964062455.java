import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][] machiZahyo = new double[10][10];
		double sum = 0;

		// 与えられた座標を配列に格納する
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
			machiZahyo[i][j] = sc.nextInt();
			}
		}
		// 配列同士の距離の合計を取得
		sum =  kyori(machiZahyo[0][0], machiZahyo[1][0], machiZahyo[0][1], machiZahyo[1][1]);
		// 町の数が3以上であれば以下を実施
		if (n >= 3) {
			for (int i = 1; i< n; i++) {
				sum += kyori(machiZahyo[i][0], machiZahyo[i+1][0], machiZahyo[i][1], machiZahyo[i+1][1]);
			}
		}
		// 移動距離の平均を表示
		System.out.println(sum/factrial(n));
		sc.close();
	}

	// 与えられた座標の距離を求めるメソッド
	public static double kyori(double x1, double x2, double y1, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}

	// 引数の階乗を取得する
	public static int factrial(int num) {
		int fact = 1;
		for (int i = 1; i >=num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}