import java.util.*;

public class Main {

	public static int solve(String s) {
		int n = s.length();
		int t = 0;
		int ans = 0;
		StringBuffer s2 = new StringBuffer();
		if(n == 0)return 0;
		for(int i = 1; i < n; ++i) {
			if(s.charAt(i) == s.charAt(t)) {
				t = i;
				s2.append(s.charAt(i));
			}
			else {
				if(t + 1 == i) {
					ans+= 2;
				}
				else s2.append(s.charAt(i));
			}
		}
		if(ans == 0)return ans;
		return ans + solve(s2.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		sc.close();
		int ans = solve(s);
		System.out.println(ans);
	}

}
