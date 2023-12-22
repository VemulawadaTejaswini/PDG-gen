import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 標準入力より週数を取得
		Scanner stdId = new Scanner(System.in);
		int deptWeek = stdId.nextInt();

		// 借金
		int dept = 100000;

		// 借金の残高を出力
		System.out.println(String.valueOf(deptCalc(dept, deptWeek)));

	}

	// 借金(baseMoney)と経過した週数(deptweek)より現時点での借金残高を計算
	public static int deptCalc(int baseDept, int deptWeek) {

		// 変数宣言
		double dept = (double) baseDept; // 借金
		int ceilLength = 1000; // 切り上げ時の数値

		// n週分、借金に5%の利子を加算(1000円未満は切り上げとする)
		dept = dept / ceilLength;
		for (int i = 0; i < deptWeek; i++) {
			dept *= 1.05;
			dept = Math.ceil(dept);
		}
		dept *= ceilLength;

		return (int) dept;
	}

}