import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		int[] t = new int[26];
		for (int i=0; i<S.length; i++) {
			t[S[i]-'a']++;
		}
		for (int i=0; i<t.length; i++) {
			if (t[i] > 1) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
}
