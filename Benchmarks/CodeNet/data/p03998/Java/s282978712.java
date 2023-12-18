import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		int len1 = s1.length() - 1;
		int len2 = s2.length() - 1;
		int len3 = s3.length() - 1;

		char temp = 'a';
		char ans;
		while (true) {
			if (temp == 'a') {
				if (len1 == -1) {
					ans = 'A';
					break;
				}
				temp = s1.charAt(len1);
				len1--;
			} else if (temp == 'b') {
				if (len2 == -1) {
					ans = 'B';
					break;
				}
				temp = s2.charAt(len2);
				len2--;
			} else if (temp == 'c') {
				if (len3 == -1) {
					ans = 'C';
					break;
				}
				temp = s3.charAt(len3);
				len3--;
			}
		}
		System.out.println(ans);

	}
}