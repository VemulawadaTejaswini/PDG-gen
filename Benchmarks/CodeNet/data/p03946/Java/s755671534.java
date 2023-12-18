import java.lang.*;
import java.io.*;
import java.util.*;


public class Main  {
	
	public static void main(String[] args) throws java.lang.Exception {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskA solver = new TaskA();
		solver.solve(in, out);
		out.close();
	}
}

class TaskA {
	
	public void solve(InputReader in, PrintWriter out) {
		int n = in.nextInt(), T = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i=0; i<n; ++i) {
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		
		for (int i=n-2; i>=0; --i) {
			b[i] = Math.max(b[i], b[i+1]);
		}
		
		int mx = -1;
		int ans = 0;
		
		for (int i=0; i<n-1; ++i) {
			if (b[i+1] > a[i])
				mx = Math.max(mx, b[i+1]-a[i]);
		}
		
		// out.println("mx = " + mx);
		for (int i=0; i<n-1; ++i)
			if (b[i+1] == a[i]+mx)
				++ans;
		
		out.println(ans);
	}
}

class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;
	
	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}
	
	public String next() {
		while (tokenizer==null || !tokenizer.hasMoreTokens()) {
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
}
