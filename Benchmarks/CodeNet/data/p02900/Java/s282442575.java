import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();

			int small = a > b ? b : a;

			List<Integer> factor = new ArrayList<>();

			for (int i = 1; i <= small; i++) {
				if (a % i == 0 && b % i == 0) {
					factor.add(i);
				}
			}
//			Collections.sort(factor, Comparator.reverseOrder());
//			// 出力(整数)
//			int result = 0;
//			for (int i = 0; i < factor.size(); i++) {
//				for (int j = i + 1; j < factor.size(); j++) {
//					int aaa = factor.get(i);
//					int bbb = factor.get(j);
//					while (aaa % bbb != 0) {
//						bbb = aaa % bbb;
//						aaa = bbb;
//					}
//					if (bbb == 1) {
//						result++;
//					}
//				}
//			}
			List<Integer> resultList = new ArrayList<>();
			for (int fact : factor) {
				if (fact == 1) {
					resultList.add(fact);
					continue;
				}
				boolean isOk = true;
				for (int r : resultList) {
					if (r != 1 && fact % r == 0) {
						isOk = false;
						break;
					}
				}
				if (isOk) {
					resultList.add(fact);
					continue;
				}
			}

			System.out.println(resultList.size());
		}
	}
}