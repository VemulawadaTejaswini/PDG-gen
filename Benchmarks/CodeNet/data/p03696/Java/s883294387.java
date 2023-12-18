import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		int cnt = 0;
		int cnt1 = 0;
		boolean flag1 = true;
		boolean flag2 = true;
		int cnt2 = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.substring(S.length() - i - 1, S.length() - i).equals("(")) {
				if(flag1) {
					cnt1++;
				} else {
					cnt++;
				}
			} else {
				flag1 = false;
				cnt--;
			}
		}
		
		for(int i = 0; i < S.length(); i++) {
			if(S.substring(i, i + 1).equals(")") && flag2) {
				cnt2++;
			} else {
				flag2 = false;
			}
		}
		cnt += cnt2;
		
		for(int i = 0; i < cnt2; i++) {
			System.out.print("(");
		}
		if(cnt > 0) {
			System.out.print(S);
			for(int i = 0; i < cnt; i++) {
				System.out.print(")");
			}
		} else {
			for(int i = 0; i < Math.abs(cnt); i++) {
				System.out.print("(");
			}
			System.out.print(S);
		}
		for(int i = 0; i < cnt1; i++) {
			System.out.print(")");
		}
	}
}
