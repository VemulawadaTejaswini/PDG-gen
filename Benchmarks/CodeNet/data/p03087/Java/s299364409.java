import java.io.PrintWriter;
import java.util.*;

public class Main {
	int N, Q;
	String S;
	int[] l, r;
	List<Integer> acIndexes;
	int[] memo;
	PrintWriter out = new PrintWriter(System.out);

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		Q = Integer.parseInt(tokens[1]);
		S = in.nextLine();
		l = new int[Q];
		r = new int[Q];
		for (int i = 0; i < Q; ++i) {
			tokens = in.nextLine().split(" ");
			l[i] = Integer.parseInt(tokens[0]);
			r[i] = Integer.parseInt(tokens[1]);
		}
		in.close();
	}

	void calc() {
		this.memo = new int[N];
		Arrays.fill(this.memo, 0);
		this.acIndexes = new ArrayList<>();
		int count = 0;
		char[] c = S.toCharArray();
		for (int i = 0; i < c.length - 1; ++i) {
			if (c[i] == 'A' && c[i + 1] == 'C') {
				++count;
				this.acIndexes.add(i);
			}
			this.memo[i] = count;
		}
		this.memo[this.memo.length - 1] = this.memo[this.memo.length - 2];
		/*
		 * for (int i = 0; i < this.memo.length; ++i) { System.out.println(" " +
		 * this.memo[i]); }
		 */

		for (int i = 0; i < Q; ++i) {
			int left = 0;
			if (l[i] == 1) {
				left = 0;
			} else {
				left = this.memo[l[i] - 2];
			}
			int right = this.memo[r[i] - 2];
			// int left = findRight(this.acIndexes, l[i] - 1);
			// int right = findRight(this.acIndexes, r[i] - 1);
			// System.out.println(left + ", " + right);
			int result = right - left;
			out.println(result);
		}

	}

	/**
	 * 最終的に，indexesのうちval以上のものの個数を返す
	 * 
	 * @param indexes
	 * @param val
	 * @return
	 */
	int findRight(List<Integer> indexes, int val) {
		if (indexes.isEmpty()) {
			return 0;
		} else if (indexes.size() == 1) {
			int i = indexes.get(0);
			if (i >= val) {
				return 1;
			} else {
				return 0;
			}
		}
		if (indexes.get(0) >= val) {
			return indexes.size();
		}
		if (indexes.get(indexes.size() - 1) < val) {
			return 0;
		}
		int midIndex = indexes.size() / 2;
		int midI = indexes.get(midIndex);
		if (midI >= val) {
			// midI -- size()まではval以上である
			int result = indexes.size() - midIndex;
			result += findRight(indexes.subList(0, midIndex), val);
			return result;
		} else {
			return findRight(indexes.subList(midIndex, indexes.size()), val);
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.out.flush();
	}

}