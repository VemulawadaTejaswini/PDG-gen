import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		int q = in.nextInt();
		boolean rev = false;
		char[] pr = new char[q];
		int ppr = 0;
		char[] po = new char[q];
		int ppo = 0;
		for (int i = 0; i < q; i++) {
			int t = in.nextInt();
			if (t == 1)
				rev ^= true;
			else {
				int f = in.nextInt();
				String c = in.next();
				if ((f == 1 && rev) || (f != 1 && !rev))
					po[ppo++] = c.charAt(0);
				else
					pr[ppr++] = c.charAt(0);
			}
		}
		if (rev) {
			System.out.print(reverse(String.valueOf(po)));
			System.out.print(reverse(s));
			System.out.println(String.valueOf(pr));
		} else
			System.out.print(reverse(String.valueOf(pr)));
			System.out.print(s);
			System.out.println(String.valueOf(po));
	}

	private static String reverse(String s) {
		char[] si = s.toCharArray();
		char[] sr = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			sr[i] = si[s.length() - i - 1];

		return String.valueOf(sr);
	}
}