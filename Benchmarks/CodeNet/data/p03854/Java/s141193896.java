import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		new ABC049C().solve();
	}
}

class ABC049C {
	void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s =new StringBuilder(br.readLine());
		String yes = "YES", no = "NO";
		String d="dream", der = "dreamer", e = "erase", eer = "eraser";
		String l,r;
		while (s.length() >= 10) {
			l = s.substring(0, 5);
			r = s.substring(5, 10);
			//System.out.printf("%s\t%s\t%s\n", s, l, r);
			if (l.matches(d + "|" + e)) {
				if (r.matches(d + "|" + e)) {
					s = s.delete(0, 5);
				} else {
					if (l.matches(d))
						s = s.delete(0, 7);
					else
						s = s.delete(0, 6);
				}
			} else {
				s = s.delete(0, 5);
			}
		}
		String str = s.toString();
		if (str.equals(der) || str.equals(eer) || str.length() == 0) {
			System.out.println(yes);
		} else {
			if (str.equals(d) || str.equals(e)) {
				System.out.println(yes);
			} else {
				System.out.println(no);
			}
		}
		//System.out.println(str);
	}
}

class ABC049B {
	void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hw = br.readLine();
		int h = Integer.parseInt(hw.split(" ")[0]);
		int w = Integer.parseInt(hw.split(" ")[1]);
		String[] c = new String[h];
		for (int i=0; i < h; i++) {
			c[i] = br.readLine();
		}
		for (int i=0; i < c.length; i++) {
			System.out.println(c[i]);
			System.out.println(c[i]);
		}
	}
}

class ABC049A {
	void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yes = "vowel";
		String no = "consonant";
		if (br.readLine().matches("a|e|i|o|u")) System.out.println(yes);
		else System.out.println(no);
	}
}
