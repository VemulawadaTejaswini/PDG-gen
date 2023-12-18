import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] w = sc.next().toCharArray();
		int[] c = new int[26];
		for (int i=0; i<w.length; i++) {
			c[w[i]-'a'] ++;
		}
		for (int i=0; i<c.length; i++) {
			if ( c[i]%2 == 1 ) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
