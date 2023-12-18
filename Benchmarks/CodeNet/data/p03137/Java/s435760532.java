import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] X = new int[M];
		for (int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}
		
		// 入力チェック
		/*
		if (error) {
			System.out.println("無効な入力値です");
			return;
		}
		*/
		// 答えを出力
		Integer[] Y = new Integer[M-1];
		Arrays.sort(X);
		for (int i = 1; i < M; i++) {
			Y[i-1] = new Integer(X[i] - X[i-1]);
		}			
		Arrays.sort(Y, Collections.reverseOrder());
		
		int ans = 0;
		for (int i = 0; i < M-1; i++) {
			if (i < (N-1)){
				continue;
			}
			ans += Y[i];
		}
		System.out.println(ans);
	}
}
