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
			print(cks);
			print(ckt);
			if(cks[(int)(s[i] - 'a')] == '.' && ckt[(int)(t[i] - 'a')] == '.') {
				cks[(int)(s[i] - 'a')] = t[i];
				ckt[(int)(t[i] - 'a')] = s[i];
			}
			else if(cks[(int)(s[i] - 'a')] != t[i] || ckt[(int)(t[i] - 'a')] != s[i]) {
				//System.out.println(cks[(int)(s[i] - 'a')] + " " + t[i]);
				//System.out.println(cks[(int)(s[i] - 'a')] != t[i]);
				//System.out.println(ckt[(int)(t[i] - 'a')] + " " + s[i]);
				//System.out.println(ckt[(int)(t[i] - 'a')] != s[i]);
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	void print(char[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
