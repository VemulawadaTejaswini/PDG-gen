import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[3];
		c[0] = s.charAt(0);
		c[1] = s.charAt(1);
		c[2] = s.charAt(2);
		int r = 0;
		for (int i = 0; i < 3; i++) {
			if (c[i] == '1') {
				r++;
			}
		}
		System.out.println(r);
	}
}
