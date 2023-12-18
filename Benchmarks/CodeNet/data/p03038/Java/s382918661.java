import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> valueList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			valueList.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			for (int j = 0; j < b; j++) {
				valueList.add(c);
			}
		}

		Collections.sort(valueList);
		Collections.reverse(valueList);

		long result = 0;

		for (int i = 0; i < n; i++) {
			result += valueList.get(i);
			// System.out.println(valueList.get(i));
		}

		System.out.println(result);

	}

}
