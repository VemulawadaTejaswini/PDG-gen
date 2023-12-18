import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] alph = new int[26];
		char[] target = S.toCharArray();
		for (int i = 0; i < target.length; i++) {
			alph[target[i] - 'a']++;
		}
		sc.close();
		for (int i = 0; i < alph.length; i++) {
			if (alph[i] % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}