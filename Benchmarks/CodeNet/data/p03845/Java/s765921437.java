import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 問題数
		int N = Integer.parseInt(scn.next());
		// 問題を解くのにかかる時間
		int[] T = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			T[i] = Integer.parseInt(scn.next());
			sum += T[i];
		}
		// ドリンクの種類数
		int M = Integer.parseInt(scn.next());
		for (int i = 0; i < M; i++) {
			// P番目
			int P = Integer.parseInt(scn.next());
			// X秒になる
			int X = Integer.parseInt(scn.next());
			System.out.println(sum - T[P - 1] + X);
		}
	}
}