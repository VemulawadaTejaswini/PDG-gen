import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int k = sc.nextInt();
		for (int i = 0; i < s.length; i++) {
			if ('z' - s[i] + 1 <= k) {
				k = k - ('z' - s[i] + 1);
				s[i] = 'a';
			}
		}
		k = (s[s.length - 1] - 'a' + k) % 26;
		s[s.length - 1] = (char) ('a' + k);
		System.out.println(s);
	}
}
