import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		int q = in.nextInt();
		boolean rev = false;
		for (int i = 0; i < q; i++) {
			int t = in.nextInt();
			if (t == 1)
				rev ^= true;
			else {
				int f = in.nextInt();
				String c = in.next();
				if ((f == 1 && rev) || (f != 1 && !rev))
					s = s.concat(c);
				else
					s = c.concat(s);
			}
		}
		if (rev)
			System.out.println(reverse(s));
		else
			System.out.println(s);
	}

	private static String reverse(String s) {
		char[] si = s.toCharArray();
		char[] sr = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			sr[i] = si[s.length() - i - 1];

		return String.valueOf(sr);
	}
}