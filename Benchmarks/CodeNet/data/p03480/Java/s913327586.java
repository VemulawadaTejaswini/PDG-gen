import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = 0;
		int b = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == '0') a++;
			else b++;
		}
		if(a == s.length() && b == 0) {
			System.out.println(s.length());
		} else {
			int ans = Math.max(a, b);
			System.out.println(ans);
		}
	}
}
