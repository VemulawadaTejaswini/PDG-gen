import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		char[] c = s.toCharArray();

		for (int i = 0; i < n; i++) {
			if (i == k - 1) {
				if (c[i] == 'A') {
					c[i] = 'a';
				} else if (c[i] == 'B') {
					c[i] = 'b';
				} else {
					c[i] = 'c';
				}
			}
			System.out.print(c[i]);
		}

	}
}