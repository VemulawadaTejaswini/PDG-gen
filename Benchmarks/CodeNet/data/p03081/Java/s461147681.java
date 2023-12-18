import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		char[] t = new char[q];
		char[] d = new char[q];
		for (int i = 0; i < q; i++) {
			t[i] = in.next().charAt(0);
			d[i] = in.next().charAt(0);
		}
		System.out.println(solve(n, q, s, t, d));
		in.close();
	}

	static int[] fpt;
	static int[] npt;
	static int[] qty;

	private static int solve(int n, int q, String s, char[] t, char[] d) {
		fpt = new int[26];
		npt = new int[n];
		for (int i = 0; i < fpt.length; i++)
			fpt[i] = -1;
		for (int i = 0; i < n; i++)
			npt[i] = -1;
		for (int i = 0; i < n; i++)
			SetPt(s.charAt(i) - 'A', i);

		qty = new int[n];
		for (int i = 0; i < n; i++)
			qty[i] = 1;
		for (int i = 0; i < q; i++) {
			n -= magic(t[i] - 'A', d[i]);
		}
		return n;
	}

	private static int magic(int c, char d) {
		int r = 0;
		int pt = fpt[c];
		int tQty = 0;
		int tPt = -1;
		if (d == 'L')
			while (pt >= 0) {
				if (pt == 0)
					r = qty[0];
				else
					qty[pt - 1] += qty[pt];
				qty[pt] = 0;
				pt = npt[pt];
			}
		else {
			while (pt >= 0) {
				int x = qty[pt];
				qty[pt] = 0;
				if (tPt >= 0)
					qty[tPt + 1] += tQty;
				tQty = x;
				tPt = pt;
				pt = npt[pt];
			}
			if (tPt == qty.length - 1)
				r = tQty;
			else if (tPt >= 0)
				qty[tPt + 1] += tQty;
		}
		return r;
	}

	private static void SetPt(int c, int pt) {
		if (fpt[c] < 0) {
			fpt[c] = pt;
			return;
		}
		int p = fpt[c];
		while (npt[p] >= 0)
			p = npt[p];
		npt[p] = pt;
	}
}
