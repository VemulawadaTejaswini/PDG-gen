import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static final boolean debugMode = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = readInt(sc);
		char[] s = sc.next().toCharArray();

		Set<Integer> r = new HashSet<>();
		Set<Integer> g = new HashSet<>();
		Set<Integer> b = new HashSet<>();

		for (int i = 0; i < n; i++) {
			if (s[i] == 'R')
				r.add(i);
			else if (s[i] == 'G')
				g.add(i);
			else
				b.add(i);
		}

		long cnt = 0;
		for (int i : r) {
			for (int j : g) {

				// lk
				int lk = 2 * j - i;
				if (lk >= 0 && lk < n && b.contains(lk)) {
					cnt++;
				}

				// rk
				int rk = 2 * i - j;
				if (rk >= 0 && rk < n && b.contains(rk)) {
					cnt++;
				}

				// sk
				if ((i + j) % 2 != 0)
					continue;

				int sk = (i + j) / 2;
				if (sk >= 0 && sk < n && b.contains(sk)) {
					cnt++;
				}
			}
		}

		long total = (long) r.size() * (long) g.size() * (long) b.size();
		System.out.println(total - cnt);

	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = readInt(sc);
//		char[] s = sc.next().toCharArray();
//		
//		long cnt = 0;
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = i+1; j < n; j++) {
//				if(s[i] == s[j])
//					continue;
//				
//				for (int k = j+1; k < n; k++) {
//					if(j-i == k-j)
//						continue;
//					if(s[i] == s[k]|| s[j] == s[k])
//						continue;
//					cnt++;
//				}
//			}
//		}
//		
//		System.out.println(cnt);
//		
//		
//	}

	// con.) a >= b
	static int gcd(int a, int b) {
		while (true) {
			if (b == 0)
				break;

			int mod = a % b;
			a = b;
			b = mod;
		}
		return a;
	}

	static int readInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static void log(String s) {
		if (debugMode) {
			System.out.println(s);
		}
		return;
	}
}

class Pair {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pair() {

	}

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}