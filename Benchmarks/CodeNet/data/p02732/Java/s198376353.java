import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] arr = new int[n];
		Multiset ms = new Multiset();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			ms.add(a);
		}
		long count = 0;
		for(int x: ms.map.keySet()) {
			long a = ms.count(x);
			count += a*(a-1)/2;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			long a = ms.count(arr[i]);
			long dif = a*(a-1)/2 - (a-2)*(a-1)/2;
			sb.append((count - dif)+"\n");
		}
		PrintWriter pw = new PrintWriter(System.out);
//		sb.replace(sb.length()-1, sb.length(), "\n");
		pw.print(sb.toString());
		pw.flush();
	}
	
	static class Multiset{
		HashMap<Integer, Long> map;
		public Multiset() {
			map = new HashMap<>();
		}
		public void add(int a) {
			if(!map.containsKey(a)) map.put(a, 1L);
			else map.put(a, map.get(a)+1);
		}
		public void remove(int a) {
			map.put(a, map.get(a)-1);
			if(map.get(a) == 0) map.remove(a);
		}
		public boolean contains(int a) {
			return map.containsKey(a);
		}
		public long count(int a) {
			if(!map.containsKey(a)) return 0;
			else return map.get(a);
		}
		public boolean isEmpty() {
			return map.isEmpty();
		}
		public boolean equals(Multiset ms) {
			for(int k: map.keySet()) {
				if(count(k) != ms.count(k)) return false;
			}
			return true;
		}
		public String toString() {
			return map.toString();
		}
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
