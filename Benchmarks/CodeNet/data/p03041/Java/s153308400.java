import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		String s = scanner.next();

		char conv = Character.toLowerCase(s.charAt(k - 1));
		String pre = (k == 1 ? "" : s.substring(0, k - 1));
		String next = (k == n ? "" : s.substring(k));

		System.out.println(pre + conv + next);
	}
}