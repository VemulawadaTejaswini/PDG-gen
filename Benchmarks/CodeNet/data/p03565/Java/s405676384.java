import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int S = s.length; int T = t.length;
		boolean flg2 = false;
		for(int i = 0 ; i < S - T + 1 ; i++) {
			boolean flg = true;
			for(int j = 0 ; j < T ; j++) {
				if(s[j + i] != t[j] && s[j + i] != '?') {
					flg = false;
				}
			}
			if(flg) {
				for(int j = 0 ; j < T ; j++) {
					s[j + i] = t[j];
					flg2 = true;
				}
			}
		}
		if(flg2) {
			for(int i = 0 ; i < S ; i++) {
				if(s[i] == '?') s[i] = 'a';
			}
			String ans = String.valueOf(s);
			System.out.println(ans);
		} else {
			System.out.println("UNRESTORABLE");
		}

	}
}
