import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int l = scanner.nextInt();
		scanner.nextLine();
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = scanner.nextLine();
		}
		Arrays.sort(lines);
		String result = String.join("", lines);
		System.out.println(result);
	}
}
