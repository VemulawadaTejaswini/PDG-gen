package atcoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String answer = null;

		if((A.equals("1") || A.equals("2")) && (B.equals("1")|| B.equals("2"))) {
			answer = "3";
		} else if ((A.equals("2") || A.equals("3")) && (B.equals("2")|| B.equals("3"))) {
			answer = "1";
		} else {
			answer = "2";
		}

		System.out.println(answer);
	}
}
