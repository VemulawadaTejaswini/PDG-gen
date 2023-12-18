import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class Task{
		
		public void solve(int numTest, InputReader in, PrintWriter out) {
			int njob = in.nextInt(),mday = in.nextInt();
			pair[] lj = new pair[njob];
			for(int n = -1; ++n < njob;) 
				lj[n] = new pair(in.nextInt(), in.nextInt());
			Arrays.sort(lj);
			PriorityQueue<Integer> que = new PriorityQueue<Integer>(new Comparator< Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2-o1;
				}
			});
			int j = 0, res = 0;
			for(int day = 0; ++day <mday+1;) {
				
				while(j < njob &&lj[j].f == day) {
					que.add(lj[j].s);
					j++;
				}
				if(!que.isEmpty()) res+=que.poll();
			}
			out.print(res);
		}//solve

		
	}//task
	
	
/*


*/		
	static class pair implements Comparable<pair>{
		int f,s;

		public pair(int f, int s) {
			this.f = f;
			this.s = s;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return f-o.f;
		}
		
	}
	
	static class InputReader{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		public String next() {
			while(tokenizer==null||!tokenizer.hasMoreTokens()) {
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
		
	}
		
}