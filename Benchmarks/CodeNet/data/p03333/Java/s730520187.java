import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		TreeSet<Segment> left = new TreeSet<Segment>((s1, s2) -> {
			int cmp = Integer.compare(s2.left, s1.left);
			if (cmp != 0) return cmp;
			return Integer.compare(s1.id, s2.id);
		});
		TreeSet<Segment> right = new TreeSet<Segment>((s1, s2) -> {
			int cmp = Integer.compare(s1.right, s2.right);
			if (cmp != 0) return cmp;
			return Integer.compare(s1.id, s2.id);
		});
		int tmp1, tmp2;
		for (int i = 0; i < N; i++) {
			tmp1 = sc.nextInt();
			tmp2 = sc.nextInt();
			Segment segment = new Segment(tmp1, tmp2, i);
			left.add(segment);
			right.add(segment);
		}
		long ans = calc(new TreeSet<>(left), new TreeSet<>(right), 0, true);
		ans = Math.max(ans, calc(left, right, 0, false));
		out.println(ans);
		
		out.flush();
	}
	
	static final int NONE = 10000000;
	
	static long calc(TreeSet<Segment> left, TreeSet<Segment> right, int pos, boolean leftTurn) {
		long ret = 0;
		int nPos = NONE;
		if (leftTurn) {
			if (!left.isEmpty()) {
				Segment seg = left.pollFirst();
				if (pos < seg.left) {
					ret += seg.left - pos;
					right.remove(seg);
					nPos = seg.left;
				}
			}
		} else {
			if (!right.isEmpty()) {
				Segment seg = right.pollFirst();
				if (seg.right < pos) {
					ret += pos - seg.right;
					right.remove(seg);
					nPos = seg.right;
				}
			}
		}
		if (nPos == NONE) {
			ret += Math.abs(pos);
		} else {
			ret += calc(left, right, nPos, !leftTurn);
		}
		return ret;
	}
	
	static class Segment {
		int left, right, id;
		
		public Segment(int left, int right, int id) {
			this.left = left;
			this.right = right;
			this.id = id;
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
