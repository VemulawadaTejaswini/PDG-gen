import java.util.Scanner;

public class Main {

	static String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String S1 = String.valueOf(s1.charAt(0)).toUpperCase();
		String S2 = String.valueOf(s2.charAt(0)).toUpperCase();
		String S3 = String.valueOf(s3.charAt(0)).toUpperCase();
		System.out.println(S1 + S2 + S3);
	}

}