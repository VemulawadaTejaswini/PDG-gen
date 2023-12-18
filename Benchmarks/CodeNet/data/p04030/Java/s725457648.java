import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				ans = ans.append('0');
			}else if(s.charAt(i) == '1') {
				ans = ans.append('1');
			}else if(s.charAt(i) == 'B') {
				if(ans.length() > 0) {
					ans = ans.deleteCharAt(ans.length()-1);
				}
		}
		}
		System.out.println(ans);
	}
}
