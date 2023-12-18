import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		String ans = "No";

		if (c>a) {
			if (c-a<=d) {
				ans = "Yes";
			} else if ((b>a) && (b<c) && (b-a<=d) && (c-b<=d)) {
				ans = "Yes";
			}
		} else if (a>c) {
			if (a-c<=d) {
				ans = "Yes";
			} else if ((b>c) && (b<a) && (b-c<=d) && (a-b<=d)) {
				ans = "Yes";
			}
		} else if (a == c) {
			ans = "Yes";
		}

		System.out.println(ans);

		scan.close();

	}

}
