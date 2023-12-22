

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.toUpperCase();

		System.out.println(str);

		//	char[] c = sc.next().toCharArray();
		//
		//	for (int i = 0; i < c.length; i++) {
		//		c[i] -= 'a' - 'A';
		//	}
		//
		//	System.out.println(c);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}