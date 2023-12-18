

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String s = sc.nextLine();
		int n = t.length();
		int m = s.length();
	
		char[] ss = new char[n];
		boolean found = false;
		String res = "";
		for (int i = 0; i <= n - m; i++) {
			boolean ok = true;
			ss = t.toCharArray();
			
			for (int j = 0; j < m; j++) {
				if (ss[i + j] == '?') {
					ss[i + j] = s.charAt(j);
				} else if (ss[i + j] != s.charAt(j)) {
					ok = false;
					break;
				}
			}
			if (ok) {
				
				for (int j = 0; j < n; j++) {
					if(ss[j]=='?')
					{
						ss[j]='a';
					}
				}
				if (found) {
					if (res.compareTo(new String(ss)) <= 0) {
						res = new String(ss);
					}
				} else {
					res = new String(ss);
					found = true;
				}
			}
		}
		if (found) {
			System.out.println(res);
		} else {
			System.out.println("UNRESTORABLE");
		}

	}
}
