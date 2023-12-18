import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int result = n;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == s.charAt(i - 1))
				result--;

		}
		System.out.println(result);
	}

}
