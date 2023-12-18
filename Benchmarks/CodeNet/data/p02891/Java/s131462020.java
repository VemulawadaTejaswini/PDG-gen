import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 文字列の入力
			String s = sc.next();
			// 整数の入力
			int k = sc.nextInt();

			StringBuilder sb = new StringBuilder();
//
//			for (int i = 0; i < k; i++) {
//				sb.append(s);
//			}

			long cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				char now = s.charAt(i);
				if (i != s.length() - 1) {
					char next = s.charAt(i + 1);
					if (now == next) {
						if (i != s.length() - 2) {
							char next2 = s.charAt(i + 2);
							if (now == next2) {
								i++;
							}
						}
						cnt++;
					}
				}
			}

//			List<Integer> indexList = new ArrayList<>();
//			// まず自身と前後の文字(トーラス状)を調べて同じものを優先して置き換える。
//			for (int i = 0; i < s.length(); i++) {
//				int befIdx = i == 0 ? s.length() - 1 : i - 1;
//				int aftIdx = i == s.length() - 1 ? 0 : i + 1;
//				char bef = s.charAt(befIdx);
//				char now = s.charAt(i);
//				char aft = s.charAt(aftIdx);
//				if (bef == now && now == aft && !indexList.contains(befIdx) && !indexList.contains(aftIdx)) {
//					indexList.add(i);
//				}
//			}
			// 出力(整数)
			System.out.println(cnt * k);
		}
	}
}