import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = 0;
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();

		for(int i = 0; i < s.length; i++) {
			c += s[i] != t[i] ? 1 : 0;
		}

		System.out.println(c);
	}
}