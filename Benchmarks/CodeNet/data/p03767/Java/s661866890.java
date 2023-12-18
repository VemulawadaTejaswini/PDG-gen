import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

		// スペース区切りの整数の入力
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N * 3; i++) {
			int a = sc.nextInt();
			list.add(a);
		}

		Collections.sort(list);

		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += list.get(3 * N - 2 - i * 2);
		}
		// 出力
		System.out.println(ans);
		// System.out.println("Hello");
	}
}