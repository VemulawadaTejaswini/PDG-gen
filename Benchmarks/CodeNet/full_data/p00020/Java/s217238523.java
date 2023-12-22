

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";

		while (str != ".") {
			str = sc.next();
			String upper_str = str.toUpperCase();
			System.out.print(upper_str + " ");
		}
		System.out.println(".");
	}

}