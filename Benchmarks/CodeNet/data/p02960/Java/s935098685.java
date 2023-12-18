import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		final int mod = (int) 1E9 + 7;

		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		String regex = "^";
		for ( int i = 0; i < s.length; i++ ) {
			if ( s[i] == '?' ) {
				regex += "[0-9]";
			} else {
				regex += s[i];
			}
		}
		regex += "$";
		// System.out.println(regex);
		Pattern ptrn = Pattern.compile(regex);

		long ans = 0;
		for ( long i = 5; String.valueOf(i).length() <= s.length; i += 13 ) {
			String targ = String.format("%0" + s.length +"d", i);
			Matcher m = ptrn.matcher(targ);
			if ( m.find() ) ans++;
			
			if(String.valueOf(ans).length() >= 18) ans %= mod;
		}

		System.out.println(ans);
		in.close();
	}
}