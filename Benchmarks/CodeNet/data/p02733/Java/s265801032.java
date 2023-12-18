import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt();
		bar = new char[h][w];
		for(int i = 0; i < h; i++) bar[i] = sc.next().toCharArray();
		int min = (h+w+1);
		for(int mask = 0; mask < (1 << (h-1)); mask++) {
			min = Math.min(min, calc(mask));
		}
		System.out.println(min);
	}
	static int h, w, k;
	static char[][] bar;
	static int calc(int mask) {
		HashSet<Integer> set = toset(mask);
		int m = set.size()+1;
		int[] currs = new int[m];
		int res = set.size();
		for(int i = 0; i < w; i++) {
			int[] vals = new int[m];
			int c = 0;
			boolean badmask = false;
			for(int j = 0; j < h; j++) {
				if(bar[j][i] == '1') vals[c]++;
				if(vals[c] > k) badmask = true;
				if(set.contains(j)) c++;
			}
			if(badmask) return h+w+1;
			boolean valid = true;
			for(int j = 0; j < m; j++) {
				currs[j] += vals[j];
				if(currs[j] > k) {
					valid = false; break;
				}
			}
			if(!valid) {
				res++;
				currs = vals;
			}
		}
		return res;
	}
	static HashSet<Integer> toset(int mask){
		HashSet<Integer> res = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			if((mask & (1 << i)) > 0) res.add(i);
		}
		return res;
	}
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
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
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
