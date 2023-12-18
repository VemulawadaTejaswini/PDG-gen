

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		for (int i = 0; i <= n.length(); i++) {
			if (n.substring(i).equals("7")) {
				System.out.println("Yes");
				return;
			}
			sc.close();
		}
		System.out.println("No");
	}
}
