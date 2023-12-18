import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int ans = Integer.MAX_VALUE;
		for(char c = 'a' ; c <= 'z' ; c++) {
			boolean find = false;
			for(int i = 0 ; i < s.length ; i++) {
				if(c == s[i]) find = true;
			}
			if(!find) continue;
			int cnt = 0;
			char[] t = Arrays.copyOf(s, s.length);
			while(true) {
				boolean ok = true;
				for(int j = 0 ; j < t.length ; j++) {
					if(c != t[j]) ok = false;
				}
				if(ok) break;
				char[] u = new char[t.length - 1];
				for(int j = 0 ; j < t.length - 1 ; j++) {
					if(c == t[j] || c == t[j + 1]) {
						u[j] = c;
					} else {
						u[j] = t[j];
					}
				}
				t = u;
				cnt++;
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}
}
