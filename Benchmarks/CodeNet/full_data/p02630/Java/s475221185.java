

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{

	static int gcd(int a, int b) {

		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);

		int n = sc.nextInt();
		int ar[] = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		long sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			ar[i] = sc.nextInt();
			map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
			sum += ar[i];
		}
		
		int q = sc.nextInt();
		
		while(q-- > 0) {
			
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(!map.containsKey(b)) {
				
				pr.println(sum);
				continue;
			}
			
			int freq = map.get(b);
			sum -= (b * freq);
			sum += (c * freq);
			
			map.remove(b);
			map.put(c, map.getOrDefault(c, 0) + freq);
			
			pr.println(sum);
		}
		pr.close();
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
