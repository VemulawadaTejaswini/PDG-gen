import java.util.Scanner;

public class Main {

	static int m,f,r;
	
	public static void main(String[] args) {

		final int inputLimit = 50;
		final String[] grade = { "A", "B", "C", "D", "F" };

		int record = 0; // データレコード数

		int[] results = new int[inputLimit]; // 成績を格納する配列

		inputNums();
		while (!(m == -1 && f == -1 && r == -1)) {

			// 成績判定
			results[record] = gradeing(m, f, r);
			record++; // データレコード数を加算

			inputNums();
		}

		// 出力
		for (int i = 0; i < record; i++) {
			System.out.println(grade[results[i]]);
		}

	}

	static void inputNums() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
	}
	
	//成績評価
	static int gradeing(int m, int f, int r) {
		// F
		if (m < 0 || f < 0) {
			return 4;
		}

		// A
		if (m + f >= 80) {
			return 0;
		}

		// B
		if (m + f >= 65) {
			return 1;
		}

		// C
		if (m + f >= 50||r>=50) {
			return 2;
		}

		// D
		if (m + f >=30 ) {
			return 3;
		}

		// F
		return 4;

	}

}

