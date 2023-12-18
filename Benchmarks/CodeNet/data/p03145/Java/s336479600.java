

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ab = Integer.parseInt(scan.next());
		int bc = Integer.parseInt(scan.next());
		int ca = Integer.parseInt(scan.next());

		System.out.println(ab * bc / 2);
	}
}
