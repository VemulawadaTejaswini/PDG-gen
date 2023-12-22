import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1;; i++) {
			String s = sc.next();
			if (s.charAt(0) == '0')
				break;

			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
				sum += s.charAt(j) - '0';
			}
			System.out.println(sum);
		}
	}
}