import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int X = scan.nextInt();
		int N = scan.nextInt();

		int[] pList = new int[N];

		for (int i = 0; i < N; i++) {
			pList[i] = scan.nextInt() - X;
		}

		//WK変数
		SortedSet<Integer> set = new TreeSet<>();

		for (int i = -100; i <= 100; i++) {
			set.add(i);
		}

		for (int i = 0; i < N; i++) {
			set.remove(pList[i]);
		}

		//演算
		int result = 0;

		if (set.contains(0)) {
			result = X;
		}

		int idx = 1;

		while (result == 0) {
			if (set.contains(idx)) {
				result = X + idx;
			}

			if (set.contains(-idx)) {
				result = X - idx;
			}

			idx++;
		}

		//結果出力
		System.out.println(result);
	}
}