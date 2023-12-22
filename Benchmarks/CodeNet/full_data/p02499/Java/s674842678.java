import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\.");
		String s = sc.next();
		char[] a;
		a = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i);
		}

		for (char j = 97; j <= 122; j++) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (a[i] == j || a[i] == j - 32) {
					count++;
				}
			}
			System.out.println(j + " : " + count);
		}
	}
}