import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		int[] alph = new int[26];
		for (int i = 0; i < c.length; i++) {
			alph[c[i] - 'a']++;
		}
		alph[c[c.length - 1] - 'a']--;
		for (int i = c.length - 2; i >= 0; i--) {
			boolean isEven = true;
			for (int j = 0; j <= i; j++) {
				if (alph[c[j] - 'a'] % 2 != 0) {
					isEven = false;
					break;
				}
			}
			if (isEven) {
				System.out.println(i + 1);
				break;
			} else {
				alph[c[i] - 'a']--;
			}
		}
		sc.close();
	}
}