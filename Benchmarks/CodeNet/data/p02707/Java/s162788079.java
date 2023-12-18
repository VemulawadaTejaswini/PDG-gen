import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int[] members = new int[N];
		for (int i = 1; i < N; i++) {
			int idx = sc.nextInt();
			members[idx-1]++;
		}
		
		// 結果の出力
		for (int i = 0; i < N; i++) {
			System.out.println(members[i]);
		}

		sc.close();
	}
}
