

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sLen = s.length();
		char[] ca = s.toCharArray();

		ArrayList<Character> a = new ArrayList<>();

		for (char c : ca) {
			if (!a.contains(c))
				a.add(c);
		}

		if (a.size() == sLen) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
