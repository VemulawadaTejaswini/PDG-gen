import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int len = 0;
		LOOP: for (char c : s.toCharArray()) {
			switch (c) {
			case 'C':
				if (len == 0) {
					len = 1;
				}
				break;

			case 'F':
				if (len == 1) {
					len = 2;
					break LOOP;
				}
				break;

			default:
				break;
			}
		}

		String ans = len == 2 ? "Yes" : "No";
		System.out.println(ans);
	}
}
