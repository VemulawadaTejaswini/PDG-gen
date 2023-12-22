
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int friends[];
		friends = new int[n + 1];

		// friends[77]には出席番号77番の人の友達の数が入る
		ArrayList<String> list;
		list = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			String str = Math.min(a, b) + " " + Math.max(a, b);
			if (!list.contains(str)) {
				list.add(str);
				friends[a]++;
				friends[b]++;
			}

		}

		// 確認用
		//for (int i = 0; i < n + 1; i++) {
		//	System.out.println(i + " " + friends[i]);
		//}

		// 最も友達が多い人は、何人友達がいるか？
		int best = 0;
		for (int i = 0; i < n + 1; i++) {
			if (best < friends[i]) {
				best = friends[i];
			}
		}

		// 最も友達が多い人の、友達の数が500人だったら、501グループに分断する
		System.out.println(best + 1);

	}
}