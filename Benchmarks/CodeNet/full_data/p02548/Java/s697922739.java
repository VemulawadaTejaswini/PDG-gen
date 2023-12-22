import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		long ans = 0L;

		for (int i = 1; i <= N; i++) {
			ans += (N-1) / i;
		}

		//結果出力
		System.out.println(ans);
	}
}