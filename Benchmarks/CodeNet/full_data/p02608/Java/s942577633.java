import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();
		int[] a = new int[N];

		//WK変数
		int result = 0;

		//演算
		for (int x = 1; x * x < N; x++) {
			for (int y = 1; y * y < N - x * x; y++) {
				for (int z = 1; z * z < N - x * x - y * y; z++) {
					if (x * x + y * y + z * z + x * y + y * z + z * x - 1 < N) {
						a[x * x + y * y + z * z + x * y + y * z + z * x - 1] += 1;
					}
				}
			}
		}

		//結果出力
		for (int i = 0; i < N; i++) {
			System.out.println(a[i]);
		}
	}
}