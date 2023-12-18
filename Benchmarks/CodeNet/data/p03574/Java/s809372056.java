
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		String[] s = new String[h + 2];
		char[] c = new char[w + 2];
		for (int i = 0; i < c.length; i++) {
			c[i] = '.';
		}
		
		for (int i = 0; i < h + 2; i++) {
			if (i == 0 || i == h + 1) {
				s[i] = String.valueOf(c); 
				continue;
			}
			s[i] = "." + sc.next() + ".";
		}
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				
				if (s[i].charAt(j) == '#') {
					System.out.print("#");
					continue;
				}
				
				int cnt = 0;
				if (s[i - 1].charAt(j - 1) == '#') {
					cnt++;
				}
				if (s[i - 1].charAt(j) == '#') {
					cnt++;
				}
				if (s[i - 1].charAt(j + 1) == '#') {
					cnt++;
				}
				if (s[i].charAt(j - 1) == '#') {
					cnt++;
				}
				if (s[i].charAt(j + 1) == '#') {
					cnt++;
				}
				if (s[i + 1].charAt(j - 1) == '#') {
					cnt++;
				}
				if (s[i + 1].charAt(j) == '#') {
					cnt++;
				}
				if (s[i + 1].charAt(j + 1) == '#') {
					cnt++;
				}
				System.out.print(cnt);
			}
			System.out.println();
		}
	}
}