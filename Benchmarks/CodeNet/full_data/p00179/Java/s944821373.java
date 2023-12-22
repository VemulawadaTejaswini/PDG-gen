import static java.util.Arrays.deepToString;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
	
	int n;
	int[] memo = new int[60000];
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			String s = sc.next();
			if (s.equals("0")) break;
			Arrays.fill(memo, -1);
			
			int ans = -1;
			n = s.length();
			Queue<char[]> q = new ArrayDeque<char[]>();
			q.add(s.toCharArray());
			memo[h(s.toCharArray())] = 0;
			while (!q.isEmpty()) {
				char[] cur = q.poll();
				if (isok(cur)) {
					ans = memo[h(cur)];
					break;
				}
				int w = memo[h(cur)];
				for (int i = 0; i + 1 < cur.length; i++) {
					if (cur[i] != cur[i+1]) {
						char nc = getnc(cur[i], cur[i+1]);
						char[] nxt = cur.clone();
						nxt[i] = nxt[i+1] = nc;
						
						int h = h(nxt);
						if (memo[h] == -1) {
							memo[h] = w + 1;
							q.add(nxt);
						}
					}
				}
			}
			
			if (ans < 0) {
				System.out.println("NA");
			} else {
				System.out.println(ans);
			}
		}
	}
	char getnc(char c1, char c2) {
		if (c1 == 'r' && c2 == 'g') return 'b';
		if (c1 == 'g' && c2 == 'r') return 'b';
		
		if (c1 == 'r' && c2 == 'b') return 'g';
		if (c1 == 'b' && c2 == 'r') return 'g';
		
		if (c1 == 'b' && c2 == 'g') return 'r';
		if (c1 == 'g' && c2 == 'b') return 'r';
		throw new RuntimeException("orz");
	}
	boolean isok(char[] s) {
		for (int i = 0; i + 1 < s.length; i++) {
			if (s[i] != s[i+1]) return false;
		}
		return true;
	}
	int h(char[] s) {
		int h = 0;
		for (char c : s) h = h * 3 + "rgb".indexOf(c);
		return h;
	}
	char[] g(int h) {
		char[] s = new char[n];
		for (int i = n - 1; i >= 0; i--) {
			s[i] = "rgb".charAt(h % 3);
			h /= 3;
		}
		return s;
	}
}