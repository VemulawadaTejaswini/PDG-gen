import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int len = s.length;
		char[] cks = new char[26];
		char[] ckt = new char[26];
		Arrays.fill(cks, '.');
		Arrays.fill(ckt, '.');
		for(int i = 0; i < len; i++) {
			if(cks[(int)(s[i] - 'a')] == '.') {
				cks[(int)(s[i] - 'a')] = t[i];
			}
			if(cks[(int)(t[i] - 'a')] == '.') {
				cks[(int)(t[i] - 'a')] = s[i];
			}
			else if(cks[(int)(s[i] - 'a')] != t[i] 
					|| cks[(int)(t[i] - 'a')] != s[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
