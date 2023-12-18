import java.util.Scanner;

public class Main {

	private static final String STR_YES = "Yes";
	private static final String STR_NO = "No";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		sc.close();

		char s3 = str.charAt(2);
		char s4 = str.charAt(3);
		char s5 = str.charAt(4);
		char s6 = str.charAt(5);

		if (s3 == s4 && s5 == s6) {
			System.out.print(STR_YES);
		} else {
			System.out.print(STR_NO);
		}

	}
}
