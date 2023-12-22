package atcorder.test165;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){

			Integer K = scanner.nextInt();
			Integer A = scanner.nextInt();
			Integer B = scanner.nextInt();

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
