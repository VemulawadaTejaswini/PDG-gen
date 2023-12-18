import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		// 計算
		int max = 0;
		for (int i = 1; i < N; i++) {
			int count = countDuplicationCharacterTypes(S, i);
			if (count > max) {
				max = count;
			}
		}

		// 出力
		System.out.println(max);

		return;
	}

	private int countDuplicationCharacterTypes(String S, int i) {
		String X = S.substring(0, i);
		String Y = S.substring(i);
		HashSet<String> mapX = new HashSet<String>(Arrays.asList(X.split("")));
		mapX.addAll(Arrays.asList(X.split("")));
		mapX.remove("");
		int count = 0;
		for (String charX : mapX) {
			if (Y.contains(charX)) {
				count++;
			}
		}
		return count;
	}
}
