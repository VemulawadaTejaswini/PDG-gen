import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		StringBuilder P = new StringBuilder();
		for (int i = 0; i < N; i++) {
			P.append(sc.nextInt());
		}
		StringBuilder Q = new StringBuilder();
		for (int i = 0; i < N; i++) {
			Q.append(sc.nextInt());
		}

		List<String> list = new ArrayList<>();
		permutation(list, "12345678".substring(0, N), "");
		
		int a = 0, b = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(P.toString())) {
				a = i;
			}
			else if (list.get(i).equals(Q.toString())) {
				b = i;
			}
		}

		// 結果の出力
		System.out.println(Math.abs(a - b));

		sc.close();
	}

	public static List<String> permutation(List<String> list, String target, String ans) {
		if (target.length() <= 1) {
			list.add(ans + target);
		} else {
			for (int i = 0; i < target.length(); i++) {
				permutation(list, target.substring(0, i) + target.substring(i + 1), ans + target.charAt(i));
			}
		}
		return list;
	}
}
