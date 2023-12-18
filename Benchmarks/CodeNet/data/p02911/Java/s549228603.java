import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = getSc();
		Integer N = sc.nextInt(); // 参加者の数
		Integer K = sc.nextInt(); // 初期ポイント
		Integer Q = sc.nextInt(); // 正解した数
		LinkedHashMap<Integer, Integer> score = new LinkedHashMap<Integer, Integer>();
		// 初期の点数をセット
		for (int i = 0; i < N; i++) {
			score.put(i, K);
		}
		for (int i = 0; i < Q; i++) {
			Integer winner = sc.nextInt() - 1;
			score.put(winner, score.get(winner) + 1);
		}
		for (int i : score.values()) {
			System.out.println(i <= Q ? "No" : "Yes");
		}
	}

	public static BufferedReader getStdin() {
		return new BufferedReader(new InputStreamReader(System.in));
	}

	public static Scanner getSc() {
		return new Scanner(System.in);
	}
}