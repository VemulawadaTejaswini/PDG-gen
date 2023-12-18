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
		for (int i = 0; i < target.length; i++) {
			if (alph[i] > 1) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
		sc.close();
	}
}
