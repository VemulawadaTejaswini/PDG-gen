import java.util.*;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String ans;
		int a = s.indexOf(s.charAt(0), 1);
		int b = -1;
		if(a < 0) {
			ans = "No";
		} else {
			if(a == 1) {
				if(s.charAt(0) == s.charAt(2)) {
					ans = "No";
				} else {
					b = s.indexOf(s.charAt(2), 3);
				}
			} else {
				b = s.indexOf(s.charAt(1), 2);
			}
			if(b < 0) {
				ans = "No";
			} else {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}
