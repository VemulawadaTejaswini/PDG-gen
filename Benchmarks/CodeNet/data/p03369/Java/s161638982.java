

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int pay = 700;
		if (s.charAt(0) == 'o') {
			pay += 100;
		}
		if (s.charAt(1) == 'o') {
			pay += 100;
		}
		if (s.charAt(2) == 'o') {
			pay += 100;
		}
		
		System.out.println(pay);
		scanner.close();

	}

}
