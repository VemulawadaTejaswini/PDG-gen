import java.util.*;

public class Main {
	boolean test = false;
	
	Scanner sc;
	String s;
	String t;
	int[] next;
	
/*-------------
 * constructor
 */
	public Main() {
		sc = new Scanner(System.in);
	}
	
	public Main(String input) {
		sc = new Scanner(input);
	}
	
/*------------------
 * instance methods
 */
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	private final boolean match(String AA, int len, String t) {
		return AA.substring(len).startsWith(t);
	}
	public void exec() throws Exception {
		s = sc.next();
		t = sc.next();
		
		next = new int[s.length()];
		
		// 無限に長いAAAAA..の代わりの文字列
		StringBuilder aa = new StringBuilder();
		while (aa.length() < 2 * t.length()) {
			aa.append(s);
		}
		String AA = aa.toString();
		
		for (int i = 0; i < s.length(); i++) {
			// もしAAのi番目からの部分文字列がtであれば
			if (match(AA, i, t)) next[i] = (i+t.length())%s.length();
			else next[i] = -1;
		}
//		for (int i = 0; i < next.length; i++) {
//			System.out.println(i + ":" +next[i]);
//		}
		
		// もっとも長いものを探す
		int longest = -1;
	loop:
		for (int i = 0; i < s.length(); i++) {
			int len = 0;
			int index = i;
			
			while (true) {
				index = next[index];
				if (index == -1) break;
				if (index == i) {
					longest = -1;
					break loop;
				}
				len++;
			}
			if (len > longest) longest = len;
		}
		out(longest);
	}
	
/*------
 * main
 */
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
}
