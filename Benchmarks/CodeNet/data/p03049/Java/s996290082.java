import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		String s[] = new String[n];
		int acnt = 0, bcnt = 0, same = 0;
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
			char cs = s[i].charAt(0), ce = s[i].charAt(s[i].length() - 1);
			if(cs == 'B' && ce == 'A') {
				acnt++;
				bcnt++;
				same++;
			}
			else if(cs == 'B')acnt++;
			else if(ce == 'A')bcnt++;
		}
		int mcnt = (acnt < bcnt) ? acnt : bcnt;
		if(acnt == bcnt && mcnt == same && same != 0) mcnt--;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < s[i].length() - 1; j++) {
				if(s[i].substring(j, j + 2).equals("AB")) {
					cnt++;
				}
			}
		}
		System.out.println(mcnt + cnt);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
