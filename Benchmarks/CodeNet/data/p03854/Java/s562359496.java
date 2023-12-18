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
		String s = br.readLine();
		String yes = "YES", no = "NO";
		String d="dream", der = "dreamer", e = "erase", eer = "eraser";
		while (s.length() >= 10) {
			String l = s.substring(0, 5);
			String r = s.substring(5, 10);
			if (l.matches(d + "|" + e)) {
				if (r.matches(d + "|" + e)) {
					s = s.substring(5, s.length());
				} else {
					s = s.substring(7, s.length());
				}
			} else {
				s = s.substring(5, s.length());
			}
		}
		if (s.equals(der) || s.equals(eer) || s.length() == 0) {
			System.out.println(yes);
		} else {
			if (s.equals(d) || s.equals(e)) {
				System.out.println(yes);
			} else {
				System.out.println(no);
			}
		}
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
