import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		int[] c = new int[26];
		for (int i=0; i<S.length; i++) {
			c[S[i]-'a']++;
		}
		for (int i=0; i<c.length; i++) {
			if (c[i] == 0) {
				System.out.println((char)(i + 'a'));
				return;
			}
		}
		System.out.println("None");
	}
}
