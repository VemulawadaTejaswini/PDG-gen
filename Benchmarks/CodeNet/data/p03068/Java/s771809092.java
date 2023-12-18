import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] str = s.toCharArray();
		int k = sc.nextInt();
		sc.close();

		char ch = str[k - 1];
		for (int i = 0; i < n; i++) {
			if (str[i] != ch) {
				str[i] = '*';
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
	}
}
