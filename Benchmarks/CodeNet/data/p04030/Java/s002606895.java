import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "";
		for (char c : S.toCharArray()) {
			if (c == '0') {
				ans += "0";
			} else if (c == '1') {
				ans += "1";
			} else {
				ans = ans.substring(0, ans.length()-1);
			}
		}
		System.out.println(ans);
	}
}