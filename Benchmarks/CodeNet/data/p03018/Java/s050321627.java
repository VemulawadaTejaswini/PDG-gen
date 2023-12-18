import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
		in.close();
	}

	private static int solve(String s) {
		int r = 0;
		int a = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'A')
				a++;
			else if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
				r += a;
				i++;
			} else
				a = 0;
		}
		return r;
	}

}