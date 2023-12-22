

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws Exception {
		MyScanner sc = new MyScanner();
		PrintWriter pr = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i = 0; i <= n; i++)
			graph.add(new ArrayList<>());
		
		int heights[] = new int[n + 1];
		
		for(int i = 0; i < n; i++)
			heights[i + 1] = sc.nextInt();
		
		for(int i = 0; i < m; i++ ) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		int count = 0;
		for(int i = 1; i <= n; i++) {
			List<Integer> neighbour = graph.get(i);
			boolean isgood = true;
			for(int x : neighbour) {
				
				if(heights[x] >= heights[i]) {
					isgood = false;
					break;
				}
			}
			if(isgood) {
				//System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
		
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