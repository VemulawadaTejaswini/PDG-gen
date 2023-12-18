import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
	
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
	public final int maxn = 0x3f3f3f3f;
	
	public void solve(InputReader in, PrintWriter out) {
		int[] c = new int[26];
		int[] cc = new int[26];
		int n = in.nextInt();
		
		for (int i=0; i<n; ++i) {
			String s = in.next();
			int len = s.length();
			
			Arrays.fill(cc, 0);
			for (int j=0; j<len; ++j) {
				++cc[s.charAt(j) - 'a'];
			}
			
			if (i == 0) {
				for(int j=0; j<26; ++j)
					c[j] = cc[j];
			} else {
				for (int j=0; j<26; ++j)
					c[j] = Math.min(c[j], cc[j]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<26; ++i) {
			char ch = (char) (i+'a');
			for (int j=0; j<c[i]; ++j) {
				sb.append(ch);
			}
		}
		
		out.println(sb.toString());
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
