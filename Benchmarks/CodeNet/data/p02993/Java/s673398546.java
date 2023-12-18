import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
		in.close();
	}

	private static String solve(String s) {
		for (int i = 1; i < s.length(); i++)
			if (s.charAt(i - 1) == s.charAt(i))
				return "Bad";
		return "Good";
	}

}
