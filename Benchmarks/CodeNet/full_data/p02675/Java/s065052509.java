import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char c = s.charAt(s.length() - 1);

		String a = "24579";
		String b = "0168";

		if (a.indexOf(c) > -1) {
			System.out.println("hon");
		} else if (b.indexOf(c) > -1) {
			System.out.println("pon");
		} else {
			System.out.println("bon");
		}

	}

}