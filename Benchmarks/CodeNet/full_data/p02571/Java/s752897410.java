import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = scan.next();
		String t = scan.next();
		int ans = t.length();
		
		for(int i=0;i<=s.length()-t.length();i++) {
			int now_ans = t.length();
			for(int j=0;j<t.length();j++) {
				if(s.charAt(i+j) == t.charAt(j)) {
					now_ans--;
				}
			}
			ans = Math.min(ans, now_ans);
		}
		
		System.out.println(ans);
		
		
		
		
	}
	
	
	public static int gcd(int x,int y) {
		if(x%y == 0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}
}
 



