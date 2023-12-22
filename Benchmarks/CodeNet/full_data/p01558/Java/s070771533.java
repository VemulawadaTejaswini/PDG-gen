import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	Scanner sc = new Scanner(System.in);

	@SuppressWarnings("unused")
	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		Set<Long> set1 = new HashSet<>();
		Set<Long> set2 = new HashSet<>();
		
		RollingHash rh = new RollingHash();
		rh.init(s);
		rh.r = 0;

		int cnt = 0;
		while (m-- > 0) {
			String q = sc.next();
			if (q.charAt(0) == 'R') {
				if (q.charAt(1) == '+') rh.r++;
				else rh.r--;
			} else {
				if (q.charAt(1) == '+') rh.l++;
				else rh.l--;
			}
			long hash1 = rh.getHash1();
			long hash2 = rh.getHash2();
			if(!set1.contains(hash1) || !set2.contains(hash2)) cnt++;
			set1.add(hash1);
			set2.add(hash2);
		}
		System.out.println(cnt);
	}
	
	public class RollingHash {

		String S;
		int N, l, r;

		long B1 = 1007;
		long B2 = 1009;
		long H1 = 1000000007;
		long H2 = 1000000009;

		long[] Base1, Base2;
		long[] Hash1, Hash2;

		void init(String s) {
			S = s;
			N = s.length();
			l = 0;
			r = s.length() - 1;
			Base1 = new long[N + 1];
			Base2 = new long[N + 1];
			Hash1 = new long[N];
			Hash2 = new long[N];

			Base1[0] = Base2[0] = 1;
			Hash1[0] = Hash2[0] = s.charAt(0);
			for (int i = 1; i <= N; i++) Base1[i] = (Base1[i - 1] * B1) % H1;
			for (int i = 1; i <= N; i++) Base2[i] = (Base2[i - 1] * B2) % H2;
			for (int i = 1; i < N; i++) Hash1[i] = (Hash1[i - 1] * B1 + s.charAt(i)) % H1;
			for (int i = 1; i < N; i++) Hash2[i] = (Hash2[i - 1] * B2 + s.charAt(i)) % H2;
		}

		/*
		 * S(this)???T??????????????????(?????¬??????RollingHash)
		 */
		boolean contain1(String T) {
			int sl = S.length();
			int tl = T.length();
			if (tl > sl) return false;

			long b = 1;
			for (int i = 0; i < tl; i++) b = (b * B1) % H1;

			long sh = 0;
			long th = 0;
			for (int i = 0; i < tl; i++) sh = (sh * B1 + (S.charAt(i))) % H1;
			for (int i = 0; i < tl; i++) th = (th * B1 + (T.charAt(i))) % H1;

			for (int i = 0; i + tl <= sl; i++) {
				if (sh == th) return true;
				if (i + tl < sl) sh = sh * B1 - (S.charAt(i)) * b + (S.charAt(i + tl));
				sh = (sh + H1) % H1;
			}
			return false;
		}

		boolean contain2(String T) {
			int sl = N;
			int tl = T.length();
			if (tl > sl) return false;

			long th = 0;
			for (int i = 0; i < tl; i++) th = (th * B1 + (T.charAt(i))) % H1;

			r = tl - 1; 
			l = 0;
			for (; r < N; r++, l++) {
				if (getHash1() == th) return true;
			}
			l = 0; 
			r = S.length();
			return false;
		}

		long getHash1() {
			long res = Hash1[r] - ((l == 0) ? 0 : Hash1[l - 1] * Base1[r - l + 1]);
			if (res < 0) res = (res + ((-res / H1) + 1) * H1) % H1;
			return res;
		}

		long getHash2() {
			long res = Hash2[r] - ((l == 0) ? 0 : Hash2[l - 1] * Base2[r - l + 1]);
			if (res < 0) res = (res + ((-res / H2) + 1) * H2) % H2;
			return res;
		}

		void show() {
			System.out.println("---------show---------");
			System.out.println("String = " + S);
			System.out.println("l = " + l + " r = " + r);
			System.out.println("Hash1 = " + getHash1() + " Hash2 = " + getHash2());
			System.out.println("----------------------");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}