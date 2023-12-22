import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int w = scan.nextInt();
		String[] t = new String[h];
		for (int i = 0; i < h; i++)
			t[i] = scan.next();

		int r = scan.nextInt();
		int c = scan.nextInt();
		String[] p = new String[r];
		for (int i = 0; i < r; i++)
			p[i] = scan.next();

		PtFind f = new PtFind(t, p, false);

		scan.close();
		System.exit(0);
	}
}

class PtFind {
	boolean debug;

	public PtFind(String[] t, String[] p, boolean d) {
		debug = d;

		boolean[][] jg = new boolean[t.length - p.length + 1][t[0].length() - p[0].length() + 1];
		for (int y = 0; y < jg.length; y++)
			for (int x = 0; x < jg[0].length; x++)
				jg[y][x] = true;

		for (int r = 0; r < p.length; r++) {
			StFind stf = new StFind(p[r], d);
			for (int y = 0; y < jg.length; y++) {
				boolean[] result = new boolean[jg[0].length];
				stf.find(t[y + r], p[r], result);
				for (int x = 0; x < jg[0].length; x++)
					jg[y][x] &= result[x];
			}
		}

		for (int y = 0; y < jg.length; y++)
			for (int x = 0; x < jg[0].length; x++)
				if (jg[y][x])
					System.out.println(y + " " + x);
	}

}

class StFind {
	boolean debug;

	public StFind(String p, boolean d) {
		debug = d;
		// createCharPt(p);
		createMatchPt(p);
	}

	public void find(String t, String p, boolean[] result) {
		int x = 0;
		for (int st = 0; st < t.length() - p.length() + 1;) {
			if ((x = isBaEqual(t, p, st)) == p.length())
				// System.out.println(st);
				result[st] = true;
			// st += Math.max(sft[t.charAt(st + p.length() - 1)], msft[x]);
			st += msft[x];
		}
	}

	int[] msft;

	private void createMatchPt(String p) {
		msft = new int[p.length() + 1];
		msft[0] = p.length();

		for (int sft = p.length(); sft > 0; sft--) {
			for (int m = 1; m < msft.length; m++) {
				if (m > p.length() - sft) {
					msft[m] = sft;
					continue;
				}
				if (p.charAt(p.length() - m) != p.charAt(p.length() - m - sft)) {
					msft[m - 1] = sft;
					break;
				} else if (m == p.length() - sft)
					msft[m] = sft;
			}
		}

		if (debug)
			for (int i = 0; i < msft.length; i++)
				System.out.println("--- " + i + " : " + msft[i]);
	}

	int[] sft = new int[Character.MAX_CODE_POINT];

	private void createCharPt(String p) {
		for (int i = 0; i < sft.length; i++)
			sft[i] = p.length();

		for (int i = 1; i < p.length(); i++) {
			char c = p.charAt(p.length() - i - 1);
			if (sft[c] == p.length())
				sft[c] = i;
		}

		if (debug)
			for (int i = 0; i < sft.length; i++)
				if (('a' <= i && i <= 'z') || ('A' <= i && i <= 'Z') || ('0' <= i && i <= '9'))
					System.out.println("-- " + (char) i + " : " + sft[i]);
	}

	private boolean isEqual(String t, String p, int st) {
		for (int i = 0; i < p.length(); i++)
			if (t.charAt(i + st) != p.charAt(i))
				return false;
		return true;

	}

	int stPre = 0;
	int retPre = 0;

	private int isBaEqual(String t, String p, int st) {
		int clen = p.length();
		if (st >= stPre + p.length() - retPre && st < stPre + p.length())
			clen -= stPre + p.length() - st;
		for (int i = 0; i < clen; i++)
			if (t.charAt(p.length() - 1 - i + st) != p.charAt(p.length() - 1 - i)) {
				stPre = st;
				retPre = i;
				return i;
			}
		stPre = st;
		retPre = p.length();
		return p.length();
	}

}