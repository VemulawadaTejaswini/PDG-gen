import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
	static boolean check(String a,String b) {
		if(a.length() != b.length())return false;
		for(int i = 0;i < a.length();i ++) {
			if(a.charAt(i) == b.charAt(0) && (a.substring(i, a.length()) + a.substring(0, i)).equals(b)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d;
		int ans = 0;
		for(int i = 0;i < n;i ++) {
			d = in.nextInt();
			ans += d - 1;
		}
		System.out.println(ans);
	}
}
