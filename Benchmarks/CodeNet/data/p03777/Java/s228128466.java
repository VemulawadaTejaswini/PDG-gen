

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		boolean flg = true;

		if ("D".equals(a))
			flg = false;

		if (flg) {
			System.out.println(b);
		} else {
			if ("H".equals(b))
				System.out.println("D");
			else
				System.out.println("H");
		}
	}

}
