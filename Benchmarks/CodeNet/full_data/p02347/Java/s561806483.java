import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		// Scanner scan = new Scanner(System.in);
		Uscanner scan = new Uscanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		KDTree kdt = new KDTree(n, debug);

		for (int i = 0; i < n; i++)
			kdt.add(i, scan.nextInt(), scan.nextInt());

		kdt.build();

		// StringBuilder answer = new StringBuilder();
		int[] ans;

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			ans = kdt.judge(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			if (!debug) {
				for (int j = 1; j < ans[0]; j++)
					pwriter.println(ans[j]);
				pwriter.println();
			}
		}

		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class Uscanner {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] in = {};
	int pt = 0;

	public String next() throws IOException {
		if (pt < in.length)
			return in[pt++];
		pt = 0;
		String s = br.readLine();
		if (s == null)
			return null;
		in = s.split(" ", 0);
		return next();
	}

	public Integer nextInt() throws IOException {
		String s = next();
		if (s == null)
			return null;
		return Integer.parseInt(s);
	}

	public void close() throws IOException {
		br.close();
	}
}

class KDTree {
	boolean debug;

	class Pt {
		int id;
		int x, y;
		boolean xJudge;
		int leftC, rightC;

		public Pt(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}

		public int key(boolean xjudge) {
			if (xjudge)
				return this.x;
			else
				return this.y;
		}
	}

	Pt[] pt;
	int root;

	public KDTree(int n, boolean b) {
		pt = new Pt[n];
		debug = b;
		ans = new int[n + 1];
	}

	public void add(int id, int x, int y) {
		pt[id] = new Pt(id, x, y);
	}

	public void build() {
		root = buildTree(0, pt.length, true, 0);
		if (debug) {
			printKd(root, 0);
		}
	}

	private void printKd(int p, int v) {
		if (v > 20 || p == Integer.MAX_VALUE)
			return;
		System.out.println("id " + pt[p].id + "\tlevel " + v + "\t" + pt[p].x + "," + pt[p].y + "\tXdim " + pt[p].xJudge
				+ "\tleft " + pt[p].leftC + " rignt " + pt[p].rightC);
		printKd(pt[p].leftC, v + 1);
		//printKd(pt[p].rightC, v + 1);
	}

	class compPt implements Comparator<Pt> {

		@Override
		public int compare(Pt o1, Pt o2) {
			if (o1.key(sortbyX) > o2.key(sortbyX))
				return 1;
			else if (o1.key(sortbyX) == o2.key(sortbyX)) {
				sorteq++;
				return 0;
			} else
				return -1;
		}
	}

	boolean sortbyX;
	long sorteq;

	private int buildTree(int st, int len, boolean xjudge, int contig) {
		if (len == 0)
			return Integer.MAX_VALUE;

		if (len == 1) {
			pt[st].xJudge = xjudge;
			pt[st].leftC = Integer.MAX_VALUE;
			pt[st].rightC = Integer.MAX_VALUE;
			return st;
		}

		if (contig == 0) {
			sortbyX = xjudge;
			sorteq = 0;
			Arrays.sort(pt, st, st + len, new compPt());
		}

		int med = st + len / 2;
		pt[med].xJudge = xjudge;
		if (sorteq < len / 2 && contig < 5) {
			contig++;
			pt[med].leftC = buildTree(st, len / 2, xjudge, contig);
			pt[med].rightC = buildTree(med + 1, len - len / 2 - 1, xjudge, contig);
		} else {
			pt[med].leftC = buildTree(st, len / 2, !xjudge, 0);
			pt[med].rightC = buildTree(med + 1, len - len / 2 - 1, !xjudge, 0);
		}
		return med;
	}

	int[] ans;

	public int[] judge(int sx, int tx, int sy, int ty) {
		ans[0] = 1;
		inCheck(root, sx, tx, sy, ty);
		Arrays.sort(ans, 1, ans[0]);
		return ans;
	}

	private void inCheck(int p, int sx, int tx, int sy, int ty) {
		if (p == Integer.MAX_VALUE)
			return;
		if (pt[p].x >= sx && pt[p].x <= tx && pt[p].y >= sy && pt[p].y <= ty) {
			ans[ans[0]++] = pt[p].id;
		}
		if (pt[p].xJudge) {
			if (pt[p].x >= sx)
				inCheck(pt[p].leftC, sx, tx, sy, ty);
			if (pt[p].x <= tx)
				inCheck(pt[p].rightC, sx, tx, sy, ty);
		} else {
			if (pt[p].y >= sy)
				inCheck(pt[p].leftC, sx, tx, sy, ty);
			if (pt[p].y <= ty)
				inCheck(pt[p].rightC, sx, tx, sy, ty);
		}
	}
}