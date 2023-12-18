package javalayout;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		long s = 0;
		m /= 2;
		s += n;
		s += (m - n) / 2;
		System.out.println(s);
	}

}
