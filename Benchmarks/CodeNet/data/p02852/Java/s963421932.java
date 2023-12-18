import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int n = sc.nextInt();
			int m = sc.nextInt();
			// 文字列の入力
			String s = sc.next();

			StringBuilder rev = new StringBuilder();
			for (int i = s.length() - 1; i >= 0; i--) {
				rev.append(s.charAt(i));
			}
			StringBuilder result = new StringBuilder();
			int adjust = 0;
			for (int i = m; i >= 1; i--) {
				if (rev.length() > adjust + i && String.valueOf(rev.charAt(adjust + i)).equals("0")) {
					result.append(String.valueOf(i));
					result.append(" ");
					if (rev.length() == adjust + i + 1) {
						result.setLength(result.length() - 1);
						StringBuilder revs = new StringBuilder();
						for (int z = result.length() - 1; z >= 0; z--) {
							revs.append(result.charAt(z));
						}
						System.out.println(revs);
						return;
					}
					adjust = adjust + i;
					i = m + 1;
				}
			}
			System.out.println("-1");
		}
	}
}
