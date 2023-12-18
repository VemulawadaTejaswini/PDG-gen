import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	static final long MIN = -1000000001;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int Q = sc.nextInt();
		MultiSet first = new MultiSet(), second = new MultiSet();
		long constant = 0;
		for (int i = 0; i < Q; i++) {
			int type = sc.nextInt();
			if (type == 1) {
				int a = sc.nextInt();
				constant += sc.nextInt();
				if (!second.isEmpty()) first.add(second.removeSmallest());
				first.add(a);
				while (first.size > second.size + 1) {
					second.add(first.removeBiggest());
				}
			} else {
				long x = first.getBiggest();
				long ans = first.sumOfDists(x) + second.sumOfDists(x) + constant;
				out.println(x + " " + ans);
			}
		}
		
		out.flush();
	}
	
	static class MultiSet {
		private TreeMap<Integer, Integer> map = new TreeMap<>();
		long sumFromMin;
		int size;
		
		void add(int value) {
			Integer old = map.get(value);
			if (old == null) old = 0;
			map.put(value, old + 1);
			size++;
			sumFromMin += value - MIN;
		}
		
		boolean isEmpty() {
			return size == 0;
		}
		
		int removeSmallest() {
			Map.Entry<Integer, Integer> ret = map.pollFirstEntry();
			int key = ret.getKey();
			int value = ret.getValue();
			if (value > 1) {
				map.put(key, value - 1);
			}
			sumFromMin -= key - MIN;
			size--;
			return key;
		}
		
		int removeBiggest() {
			Map.Entry<Integer, Integer> ret = map.pollLastEntry();
			int key = ret.getKey();
			int value = ret.getValue();
			if (value > 1) {
				map.put(key, value - 1);
			}
			sumFromMin -= key - MIN;
			size--;
			return key;
		}
		
		int getBiggest() {
			return map.lastKey();
		}
		
		long sumOfDists(long value) {
			return Math.abs((value - MIN) * size - sumFromMin);
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
