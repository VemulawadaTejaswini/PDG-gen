import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		s3 = s3.toUpperCase();
		char[] c = new char[3];
		c[0] = s1.charAt(0);
		c[1] = s2.charAt(0);
		c[2] = s3.charAt(0);
		String s4 = new String(c);
		System.out.println(s4);
	}
}
