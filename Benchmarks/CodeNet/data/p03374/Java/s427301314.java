import java.util.*;

// ARC 96-C
// https://beta.atcoder.jp/contests/arc096/tasks/arc096_a

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long N = in.nextLong();
		long C = in.nextLong();
		
		long[] positions = new long[(int) N + 1];
		long[] values = new long[(int) N + 1];
		
		for (int i = 1; i<= N; i++) {
			positions[i] = in.nextLong();
			values[i] = in.nextLong();
		}
		
		// 0 indexでスタートし、i番目まで時計回りでいき、反対域に切り替える
		long answer = 0;
		
		for (int i = 1; i <= N; i++) {
			long newAnswer = 0;
			// i番目までのカロリーを計算
			for (int j = 1; j <= i; j++) {
				newAnswer += -(positions[j] - positions[j - 1]) + values[j];
				answer = Math.max(newAnswer, answer);
//				System.out.printf("%dを訪れる: %d\n", j, newAnswer);
			}
			// startまで戻ってくる
			newAnswer -= positions[i];
			// 反時計回りスタート
//			System.out.println("反対側へ向かう");
			for (int j = (int) N; j > i; j--) {
				long pre = j == N ? C : positions[j + 1];
				newAnswer += -Math.abs(pre - positions[j]) + values[j];
				answer = Math.max(newAnswer, answer);
//				System.out.printf("%dを訪れる: %d\n", j, newAnswer);
			}
//			System.out.println();
		}
		
//		System.out.println("反時計回りのシミュレートスタート\n");
		
		// i番目まで反時計回りでいき、反対方向へ切り替える
		for (int i = (int) N; i > 0; i--) {
			long newAnswer = 0;
			// i番目までの反時計回りでいく
			for (int j = (int) N; i <= j; j--) {
				long pre = j == N ? C : positions[j + 1];
				newAnswer += -(pre - positions[j]) + values[j];
				answer = Math.max(newAnswer, answer);
//				System.out.printf("%dを訪れる: %d\n", j, newAnswer);
			}
			// startまで戻ってくる
			newAnswer -= C - positions[i];
//			System.out.println("反対側へ向かう");
			for (int j = 1; j < i; j++) {
				newAnswer += -(positions[j] - positions[j - 1]) + values[j];
				answer = Math.max(newAnswer, answer);
//				System.out.printf("%dを訪れる: %d\n", j, newAnswer);
			}
//			System.out.println();
		}
		
		System.out.println(answer);
	}
}
