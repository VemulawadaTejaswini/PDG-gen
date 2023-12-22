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
		long time01 = 0, time02 = 0, time03 = 0, time04 = 0;
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		if (debug)
			time01 = threadMXBean.getCurrentThreadCpuTime();

		// Scanner scan = new Scanner(System.in);
		Uscanner scan = new Uscanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		KDTree kdt = new KDTree(n, debug);

		for (int i = 0; i < n; i++)
			kdt.add(i, scan.nextInt(), scan.nextInt());

		if (debug)
			time02 = threadMXBean.getCurrentThreadCpuTime();

		kdt.build();

		if (debug)
			time03 = threadMXBean.getCurrentThreadCpuTime();

		//StringBuilder answer = new StringBuilder();
		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			kdt.judge(pwriter, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());

		// System.out.print(answer);
		pwriter.flush();

		if (debug)
			time04 = threadMXBean.getCurrentThreadCpuTime();
		if (debug) {
			System.out.println("---- cpu 1 " + ((time02 - time01) / 1000000) + "ms");
			System.out.println("---- cpu 2 " + ((time03 - time02) / 1000000) + "ms");
			System.out.println("---- cpu 3 " + ((time04 - time03) / 1000000) + "ms");
		}
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
	}

	public void add(int id, int x, int y) {
		pt[id] = new Pt(id, x, y);
	}

	public void build() {
		root = buildTree(0, pt.length, true, false);
		if (debug) {
			printKd(root, 0);
		}
	}

	private void printKd(int p, int v) {
		if (v > 5 || p == Integer.MAX_VALUE)
			return;
		System.out.println("id " + pt[p].id + "\tlevel " + v + "\t" + pt[p].x + "," + pt[p].y + "\tXdim " + pt[p].xJudge
				+ "\tleft " + pt[p].leftC + " rignt " + pt[p].rightC);
		printKd(pt[p].leftC, v + 1);
		printKd(pt[p].rightC, v + 1);
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

	private int buildTree(int st, int len, boolean xjudge, boolean contig) {
		if (len == 0)
			return Integer.MAX_VALUE;

		if (len == 1) {
			pt[st].xJudge = xjudge;
			pt[st].leftC = Integer.MAX_VALUE;
			pt[st].rightC = Integer.MAX_VALUE;
			return st;
		}

		if (!contig) {
			sortbyX = xjudge;
			sorteq = 0;
			Arrays.sort(pt, st, st + len, new compPt());
		}

		int med = st + len / 2;
		pt[med].xJudge = xjudge;
		if (len > 3 && sorteq < len / 2) {
			pt[med].leftC = buildTree(st, len / 2, xjudge, true);
			pt[med].rightC = buildTree(med + 1, len - len / 2 - 1, xjudge, true);
		} else {
			pt[med].leftC = buildTree(st, len / 2, !xjudge, false);
			pt[med].rightC = buildTree(med + 1, len - len / 2 - 1, !xjudge, false);
		}
		return med;
	}

	List<Integer> inPt = new ArrayList<Integer>();

	public void judge(PrintWriter pwriter, int sx, int tx, int sy, int ty) {
		inPt.clear();
		countIn(root, sx, tx, sy, ty);
		inPt.sort(null);
		for (int i = 0; i < inPt.size(); i++)
			pwriter.print(inPt.get(i) + "\n");
		pwriter.print("\n");
	}

	private int countIn(int p, int sx, int tx, int sy, int ty) {
		if (p == Integer.MAX_VALUE)
			return 0;
		int r = 0;
		if (pt[p].x >= sx && pt[p].x <= tx && pt[p].y >= sy && pt[p].y <= ty) {
			inPt.add(pt[p].id);
			r++;
		}
		if (pt[p].xJudge) {
			if (pt[p].x >= sx)
				r += countIn(pt[p].leftC, sx, tx, sy, ty);
			if (pt[p].x <= tx)
				r += countIn(pt[p].rightC, sx, tx, sy, ty);
		} else {
			if (pt[p].y >= sy)
				r += countIn(pt[p].leftC, sx, tx, sy, ty);
			if (pt[p].y <= ty)
				r += countIn(pt[p].rightC, sx, tx, sy, ty);
		}
		return r;
	}
}