import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class F {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt() - 1;
		}
		List<Segment>[] queries = new List[N];
		for (int i = 0; i < N; i++) {
			queries[i] = new ArrayList<>();
		}
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			queries[r].add(new Segment(l, r, i));
		}
		int[] prev = new int[N];
		Arrays.fill(prev, -1);
		int[] ans = new int[Q];
		
		SumSegmentTree tree = new SumSegmentTree(N);
		for (int i = 0; i < N; i++) {
			tree.add(i, 1);
			if (prev[C[i]] != -1) {
				tree.add(prev[C[i]], -1);
			}
			prev[C[i]] = i;
			for (Segment segment : queries[i]) {
				ans[segment.idx] = (int)tree.getSum(segment.from, i + 1);
			}
		}
		
		for (int an : ans) {
			out.println(an);
		}
		
		out.flush();
	}
	
	static class Segment {
		int from, to, idx;
		
		public Segment(int from, int to, int idx) {
			this.from = from;
			this.to = to;
			this.idx = idx;
		}
	}
	
	static class SumSegmentTree {
		public int size;
		public long[] values;  // sum of subtree
		
		/**
		 * @param capacity for queries in range [0, capacity)
		 */
		public SumSegmentTree(int capacity) {
			size = 1;
			while (size < capacity) size *= 2;
			values = new long[2 * size];
		}
		
		public void add(int position, long value) {
			add(position,1, 0, size, value);
		}
		
		private void add(int position, int idx, int idxFrom, int idxTo, long value) {
			if (idxTo <= position || position < idxFrom) return;
			if (position == idxFrom && idxTo == position + 1) {
				values[idx] += value;
				return;
			}
			int med = (idxFrom + idxTo) / 2;
			add(position, 2*idx, idxFrom, med, value);
			add(position, 2*idx+1, med, idxTo, value);
			values[idx] = values[2*idx] + values[2*idx+1];
		}
		
		public long getSum(int fromInclusive, int toExclusive) {
			return getSum(fromInclusive, toExclusive, 1, 0, size);
		}
		
		private long getSum(int fromInclusive, int toExclusive, int idx, int idxFrom, int idxTo) {
			if (idxTo <= fromInclusive || toExclusive <= idxFrom) return 0;
			if (fromInclusive <= idxFrom && idxTo <= toExclusive) {
				return values[idx];
			}
			// Previous conditions => not a leaf
			int med = (idxFrom + idxTo) / 2;
			long ret = getSum(fromInclusive, toExclusive, 2*idx, idxFrom, med);
			ret += getSum(fromInclusive, toExclusive, 2*idx+1, med, idxTo);
			return ret;
		}
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
