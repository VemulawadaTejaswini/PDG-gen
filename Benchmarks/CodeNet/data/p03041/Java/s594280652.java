import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int n = scanner.nextInt(), k = scanner.nextInt() - 1;
			char[] s = scanner.next().toCharArray();
			// 大文字から小文字へ変換
			s[k] += 'a' - 'A';
			System.out.println(s);
		}
	}
}
