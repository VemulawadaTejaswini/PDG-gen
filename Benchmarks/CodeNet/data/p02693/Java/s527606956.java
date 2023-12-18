package atcorder.test165;

import java.util.Scanner;

public class Test165A {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){

			Integer K = Integer.parseInt(scanner.next());
			Integer A = Integer.parseInt(scanner.next());
			Integer B = Integer.parseInt(scanner.next());

			int a = A / K;
			if (B > (a+1) * K || A == B) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		} catch(Exception e) {

		}
	}

}
