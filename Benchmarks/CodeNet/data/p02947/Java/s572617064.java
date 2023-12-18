import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

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

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int N = in.nextInt();
			String[] s = new String[N];
			char[] s_array;
			long tmp;
			long[] tmps = new long[N];
			for(int i = 0; i < N; i++) {
				s_array = null;
				s[i] = in.next();
				s_array = s[i].toCharArray();  
				tmp = 1;
				for(int j = 0; j < 10; j++) {
					tmp *= Long.valueOf(s_array[j]);
				}
				tmps[i] = tmp;
			}
			long ans = 0;
			for(int i = 0; i < N; i++) {
				for(int j = i + 1; j < N; j++) {
					if(tmps[i] == tmps[j]) {
						ans++;
					}
				}
			}
			out.println(ans);
		}
	}
	
	static boolean permutation_2(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        
        int[] letters = new int[256]; //文字コードの仮定;
        
        char[] s_array = s.toCharArray();  
        for(char c:s_array){
            letters[c]++;
        }
        
        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

		public char nextChar() {
			return next().charAt(0);
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}
