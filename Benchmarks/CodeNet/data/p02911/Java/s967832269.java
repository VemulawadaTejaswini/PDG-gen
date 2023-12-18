import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = getSc();
		int N = sc.nextInt(); // 参加者の数
		int K = sc.nextInt(); // 初期ポイント
		int Q = sc.nextInt(); // 正解した数
		int[] arr = new int[N];
		// 配列を一括で初期化
		Arrays.fill(arr, K);
		for (int i = 0; i < Q; i++) {
			int correct = sc.nextInt() - 1;
			for (int j = 0; j < N; j++) {
				if (j != correct) {
					arr[j]--;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i > 0 ? "Yes" : "No");
		}
	}

	public static BufferedReader getStdin() {
		return new BufferedReader(new InputStreamReader(System.in));
	}

	public static Scanner getSc() {
		return new Scanner(System.in);
	}
}