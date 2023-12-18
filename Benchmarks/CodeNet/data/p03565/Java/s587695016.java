import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Solve s = new Solve();
		s.solve();
	}

}

class Solve {

	public void solve() {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String T = sc.next();
		String ans;

		char[] s = S.toCharArray();
		char[] t = T.toCharArray();


		int temp;
		boolean flag;
		boolean breakF = false;
		StringBuffer sb = new StringBuffer();


		int sl = s.length;
		int tl = t.length;
		int start = 0;
		int last = sl-tl;

		for (int i = 0; i < tl; i++) {
			for (int j = last ; j >= i; j--) {

				flag = true;
				if (s[j] == t[i] || s[j] == '?') {

					for (int k = 0; k < tl; k++) {
						if (!check(s[j-i+k], t[k])){
							flag = false;
							break;
						}
					}

					if (flag) {
						int c = 0;
						for (int k = 0; k < sl; k++) {
							// j-i~j-i+tlまではsbにtlを入れる。
							// ?部分はaを入れる。
							if (k >= j-i && k < j-i+tl) {
								sb.append(t[c]);
								c++;
							} else {
								if (s[k] == '?') {
									sb.append('a');
								} else {
									sb.append(s[k]);
								}
							}
						}
						breakF = true;
						break;
					}

				}	// end if
				if (breakF) break;
			}	// end for j
			if (breakF) break;
		}	// end for i

		if (breakF) {
			System.out.println(sb.toString());
		} else {
			System.out.println("UNRESTORABLE");
		}
	}

	public boolean check(char s, char t) {
		if (s == '?' || s == t) {
			return true;
		}
		return false;
	}

	public int checkContain(char s, char[] a) {
		if (s =='?') return 0;
		for (int i = 0; i < a.length; i++) {
			if (s == a[i]) return i;
		}
		return -1;
	}

	public boolean check(char s, char[] t, int index) {
		boolean flag = false;
		if (s == '?') {
			flag = true;
		} else {
			for (int i = index; i < t.length; i++) {
				if (s == t[i]) {
					flag = true;
				}
			}
		}
		return flag;
	}
}