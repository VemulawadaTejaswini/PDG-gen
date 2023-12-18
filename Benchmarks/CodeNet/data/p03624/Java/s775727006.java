import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		// 計算
		List<String> list = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
		for (String string : S.split("")) {
			list.remove(string);
		}
		String output = "None";
		if (!list.isEmpty()) {
			output = list.get(0);
		}

		// 出力
		System.out.println(output);

		return;
	}
}
