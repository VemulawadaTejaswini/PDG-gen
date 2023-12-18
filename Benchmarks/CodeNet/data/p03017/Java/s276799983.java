import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		String s = in.next();
		System.out.println(solve(a - 1, b - 1, c - 1, d - 1, s));
		in.close();
	}

	private static String solve(int a, int b, int c, int d, String s) {
		if (c >= b)
			if (!canMove(a, Math.max(c, d), s))
				return "No";
			else {
				if (!canMove(a, c, s))
					return "No";
				if (!canMove(b, d, s))
					return "No";
			}
		if (c > d)
			if (!canPass(b - 1, d - 1, s))
				return "No";
		return "Yes";
	}

	private static boolean canPass(int a, int b, String s) {
		for (int i = a; i <= b; i++)
			if (s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.')
				return true;
		return false;
	}

	private static boolean canMove(int a, int b, String s) {
		for (int i = a; i < b; i++)
			if (s.charAt(i) == '#' && s.charAt(i + 1) == '#')
				return false;
		return true;
	}

}