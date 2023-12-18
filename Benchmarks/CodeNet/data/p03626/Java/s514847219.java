import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S1 = sc.next();
		String S2 = sc.next();
		
		int cnt = 0;
		long ans = 0;
		int flag = 0;
		if(S1.substring(cnt, cnt + 1).equals(S2.substring(cnt, cnt + 1))) {
			ans = 3;
			cnt++;
			flag = 0;
		} else {
			ans = 6;
			cnt += 2;
			flag = 1;
		}
		
		while(cnt < S1.length()) {
			if(flag == 0) {
				if(S1.substring(cnt, cnt + 1).equals(S2.substring(cnt, cnt + 1))) {
					ans = ans * 2 % 1000000007;
					cnt++;
					flag = 0;
				} else {
					ans = ans * 2 % 1000000007;
					cnt += 2;
					flag = 1;
				}
			} else {
				if(S1.substring(cnt, cnt + 1).equals(S2.substring(cnt, cnt + 1))) {
					cnt++;
					flag = 0;
				} else {
					ans = ans * 3 % 1000000007;
					cnt += 2;
					flag = 1;
				}
			}
		}
		System.out.println(ans);
	}
}
