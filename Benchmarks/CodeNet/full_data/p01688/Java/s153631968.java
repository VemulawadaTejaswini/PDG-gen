import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static class Problem implements Comparable<Problem> {
		int cost;
		int benefit;
		
		public Problem(int cost, int benefit) {
			super();
			this.cost = cost;
			this.benefit = benefit;
		}

		@Override
		public int compareTo(Problem arg0) {
			return -(this.benefit * arg0.cost - this.cost * arg0.benefit);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int D = sc.nextInt();
		
		ArrayList<Problem> list = new ArrayList<Problem>();
		
		final int x = sc.nextInt();
		for(int i = 0; i < x; i++){
			final String a = sc.next();
			final int p = sc.nextInt();
			
			list.add(new Problem(1, a.equals("D") ? p : 0));
		}
		
		final int y = sc.nextInt();
		for(int i = 0; i < y; i++){
			String bc = sc.next();
			final int q = sc.nextInt();
			
			list.add(new Problem(2, bc.equals("DD") ? q : 0));
		}
		
		int max = 0;
		final int all_problems = x + y;
		final int bit_max = 1 << all_problems;
		for(int bit = 0; bit < bit_max; bit++){
			if(Integer.bitCount(bit) > D){
				continue;
			}
			
			int cost = 0, benefit = 0;
			for(int i = 0; i < all_problems; i++){
				final Problem p = list.get(i);
				
				if((bit & (1 << i)) != 0){
					cost += p.cost;
					benefit += p.benefit;
				}
			}
			
			if(cost <= D){
				max = Math.max(max, benefit);
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			if (tok == null) {
				return false;
			} else {
				return tok.hasMoreTokens();
			}
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}