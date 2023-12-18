import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		String tmp;
		for (int j = n - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (s[i].compareTo(s[i + 1]) > 0) {
					tmp = s[i];
					s[i] = s[i + 1];
					s[i + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		sc.close();
	}
}