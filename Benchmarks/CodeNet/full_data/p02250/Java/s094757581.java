import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		String t = scan.next();
		StringIndex si = new StringIndex(t, false);

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			if (si.isExist(scan.next(), t))
				System.out.println("1");
			else
				System.out.println("0");

		scan.close();
		System.exit(0);
	}
}

class StringIndex {
	class StIdx {
		int pos;
		char ch;

		public StIdx(int i, char c) {
			pos = i;
			ch = c;
		}
	}

	List<StIdx> idx = new ArrayList<StIdx>();
	int[] seq;
	int compLen = 1;

	class strIndexComp implements Comparator<StIdx> {

		@Override
		public int compare(StIdx o1, StIdx o2) {
			return idxComp(o1, o2);
		}
	}

	private int idxComp(StIdx o1, StIdx o2) {
		if (compLen == 1)
			if (o1.ch > o2.ch)
				return 1;
			else if (o1.ch == o2.ch)
				return 0;
			else
				return -1;

		if (seq[o1.pos] > seq[o2.pos])
			return 1;
		if (seq[o1.pos] == seq[o2.pos]) {
			int npos1 = o1.pos + compLen / 2;
			int npos2 = o2.pos + compLen / 2;
			int nseq1 = 0, nseq2 = 0;
			if (npos1 < seq.length)
				nseq1 = seq[npos1];
			if (npos2 < seq.length)
				nseq2 = seq[npos2];
			if (nseq1 > nseq2)
				return 1;
			else if (nseq1 == nseq2)
				return 0;
			else
				return -1;
		}
		return -1;
	}

	boolean debug;

	public StringIndex(String t, boolean d) {
		debug = d;

		seq = new int[t.length()];
		for (int i = 0; i < t.length(); i++)
			idx.add(new StIdx(i, t.charAt(i)));

		for (compLen = 1; compLen < idx.size(); compLen *= 2) {
			Collections.sort(idx, new strIndexComp());

			seq[idx.get(0).pos] = 1;
			for (int i = 1; i < idx.size(); i++) {
				if (idxComp(idx.get(i - 1), idx.get(i)) == 0)
					seq[idx.get(i).pos] = seq[idx.get(i - 1).pos];
				else
					seq[idx.get(i).pos] = seq[idx.get(i - 1).pos] + 1;
			}

			if (debug) {
				System.out.println("--------------------");
				for (int i = 0; i < idx.size(); i++)
					System.out.println(i + "\t" + seq[idx.get(i).pos] + "\t" + idx.get(i).pos + "\t"
							+ t.substring(idx.get(i).pos));
			}
		}

	}

	public boolean isExist(String p, String t) {
		int low = 0, hi = idx.size() - 1;
		return (findBin(p, t, low, hi));
	}

	private boolean findBin(String p, String t, int low, int hi) {
		if (low > hi)
			return false;
		int i = low + (hi - low) / 2;
		int r = p.compareTo(t.substring(idx.get(i).pos, Math.min(idx.get(i).pos + p.length(), t.length())));
		if (r == 0)
			return true;
		else if (r < 0)
			return findBin(p, t, low, i - 1);
		else
			return findBin(p, t, i + 1, hi);
	}
}