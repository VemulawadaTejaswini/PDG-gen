

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		int i = a.length();

		String c = Integer.toString(i - 2);

		String b = a.charAt(0) + c + a.charAt(i - 1);

		System.out.println(b);
	}
}
