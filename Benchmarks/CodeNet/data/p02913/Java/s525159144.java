import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		// char[] s = in.next().toCharArray();

		HashSet<String> set = new HashSet<>();

		int len = 1;
		int lenMax = 0;
		for ( int st = 0; st + len - 1 < n; st++ ) {
			String temp = s.substring(st, st + len);

			while ( s.indexOf(temp, st + len) > st ) {
				len++;
				temp = s.substring(st, st + len);
			}
			lenMax = Math.max(lenMax, lenMax);
		}

		System.out.println(lenMax);
		in.close();
	}
}