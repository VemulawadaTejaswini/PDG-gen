import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String[] Test_String;
		int[] Test_Score;
		String input_n = "";
		String input_test = "";
		boolean judge_n = true;
		boolean judge_test = true;
		double m = 0.0;
		double V = 0.0;
		int MAX = 1000;
		double[] SD = new double[MAX];
		int data_count = 0;

		out: while (true) {
			input_n = sc.nextLine();
			n = Integer.parseInt(input_n);
			if (n == 0) {
				break out;
			}
			if (n < 0 || n > 1000) {
				judge_n = false;
				break out;
			}

			input_test = sc.nextLine();
			Test_String = input_test.split(" ");

			if (Test_String.length != n) {
				judge_test = false;
				break out;

			}
			// 始:平均値を求める
			m = 0.0;
			Test_Score = new int[n];
			for (int i = 0; i < n; i++) {
				Test_Score[i] = Integer.parseInt(Test_String[i]);
				m += Test_Score[i];
			}
			m = m / n;
			// 終:平均値を求める

			V = 0.0;

			for (int j = 0; j < n; j++) {
				V += ((double) (Test_Score[j] - m))
						* ((double) (Test_Score[j] - m));

			}
			V = V / n;
			SD[data_count] = Math.sqrt(V);
			data_count++;
		}// out:whileここまで

		if (judge_n == true && judge_test == true) {

			for (int k = 0; k < data_count; k++) {
				System.out.printf("%.5f", SD[k]);
                System.out.println();
			}
		}
	}
}

