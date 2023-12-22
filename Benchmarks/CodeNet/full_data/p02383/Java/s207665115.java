import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int one = Integer.parseInt(s.split(" ")[0]),
		 		two = Integer.parseInt(s.split(" ")[1]),
				three = Integer.parseInt(s.split(" ")[2]),
				four = Integer.parseInt(s.split(" ")[3]),
				five = Integer.parseInt(s.split(" ")[4]),
				six = Integer.parseInt(s.split(" ")[5]);
				s	= scan.nextLine();
		for (int i = 0; i < s.length(); i++) {
			int tmp;
			if (s.charAt(i) == 'E') {
				tmp = one;
				one = four;
				four = six;
				six = three;
				three = tmp;
			} else if (s.charAt(i) == 'N') {
				tmp = one;
				one = two;
				two = six;
				six = five;
				five = tmp;
			} else if (s.charAt(i) == 'S') {
				tmp = one;
				one = five;
				five = six;
				six = two;
				two = tmp;
			} else if (s.charAt(i) == 'W') {
				tmp = one;
				one = three;
				three = six;
				six = four;
				four = tmp;
			}

		}
		System.out.println(one);
	}
}

