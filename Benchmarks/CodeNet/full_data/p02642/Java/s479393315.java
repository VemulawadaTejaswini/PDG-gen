import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			boolean result = true;
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (A[i] % A[j] == 0) {
					result = false;
					break;
				}
			}
			if (result) {
				count++;
			}
		}
		
		// 結果の出力
		System.out.println(count);

		sc.close();
	}
}
