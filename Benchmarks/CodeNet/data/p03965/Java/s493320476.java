

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int count = 0;

		for (char x : s.toCharArray()) {
			if (x == 'p')
				count++;
		}

		System.out.println(s.length() / 2 - count);
	}

}
