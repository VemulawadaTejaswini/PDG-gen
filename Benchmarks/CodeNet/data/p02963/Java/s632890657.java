

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();

		System.out.println("0 0 1000000000 1 " + (s%1_000_000_000) + " " + (s/1_000_000_000));
	}

}
