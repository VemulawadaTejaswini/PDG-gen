import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long n = sc.nextLong();
			// 文字列の入力
			String s = sc.next();
			String t = sc.next();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				sb.append(s.charAt(i));
				sb.append(t.charAt(i));
			}

			// 出力(整数)
			System.out.println(sb);
		}
	}
}
