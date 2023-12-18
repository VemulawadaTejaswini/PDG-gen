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
		String a = in.nextLine();
		String b = in.nextLine();
		System.out.println(check(a,b) ? "Yes" : "No");
	}
}
