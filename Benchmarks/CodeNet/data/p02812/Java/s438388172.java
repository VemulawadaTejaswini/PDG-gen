import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long n = sc.nextLong();
			// 文字列の入力
			String s = sc.next();

			int count = 0;

			for (int i = 0; i < n - 2; i++) {
				if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'C') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
