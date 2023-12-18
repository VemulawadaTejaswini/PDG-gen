import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c1 = new char[5];
		char[] c2 = new char[7];
		char[] c3 = new char[5];
		for (int i = 0; i < 5; i++) {
			c1[i] = s.charAt(i);
		}
		for (int i = 6; i < 13; i++) {
			c2[i-6] = s.charAt(i);
		}
		for (int i = 14; i < 19; i++) {
			c3[i-14] = s.charAt(i);
		}
		String s1 = new String(c1);
		String s2 = new String(c2);
		String s3 = new String(c3);

		System.out.println(s1+" "+s2+" "+s3);
	}
}
