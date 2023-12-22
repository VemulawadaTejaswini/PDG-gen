import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SortedSet<Integer> set = new TreeSet<>();

		//入力値取得
		int N = scan.nextInt();

		List<Integer> AList = new ArrayList<>();
		Set<Integer> dpl = new HashSet<>();

		for (int i = 0; i < N; i++) {
			int A = scan.nextInt();

			if (dpl.contains(A)) {
				set.add(A);
			} else {
				dpl.add(A);
				AList.add(A);
			}
		}

		//WK変数
		Set<Integer> ald = new HashSet<>();

		for (int A : AList) {
			if (!ald.contains(A)) {
				for (int j = 2; j * A <= 1000000; j++) {
					set.add(j * A);
					ald.add(j * A);
				}
			}
		}

		//演算
		int result = 0;

		for (int A : AList) {
			if (!set.contains(A)) {
				result++;
			}
		}

		//結果出力
		System.out.println(result);
	}
}