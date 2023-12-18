
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int ans = 0;
		if (a <= c && b <= c) {
			ans = b - c;
		} else if (c <= a && a <= d) {
			ans = d -a;
		}
		
		System.out.println(ans);
	}
}