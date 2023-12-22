import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		double dbLength1 = scanner.nextDouble();
		double dbLength2 = scanner.nextDouble();
		double dbAngle = scanner.nextDouble();

		double dbRad = Math.toRadians(dbAngle);
		double dbsin = Math.sin(dbRad);
		// 面積の計算
		double dbArea = (double)(dbLength1 * dbLength2 * dbsin / 2);

		double dbcos = Math.cos(dbRad);
		// 残りの辺の計算
		double dbLength32 = Math.pow(dbLength1, 2) + Math.pow(dbLength2, 2)
								- 2 * dbLength1 * dbLength2 * dbcos;

		double dbLength3 = Math.sqrt(dbLength32);
		// 周の長さの計算
		double dbCycle = dbLength1 + dbLength2 + dbLength3;
		// 高さを求める
		double dbHeight = 2 * dbArea / dbLength1;

		System.out.println(String.format("%.8f", dbArea));

		System.out.println(String.format("%.8f",dbCycle));

		System.out.println(String.format("%.8f",dbHeight));
	}

}

