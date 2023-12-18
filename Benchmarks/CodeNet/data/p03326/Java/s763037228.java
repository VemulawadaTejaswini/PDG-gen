import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        static int[][] D = {
        		{1, 1, 1},
        		{-1, 1, 1},
        		{1, -1, 1},
        		{1, 1, -1},
        		{1, -1, -1},
        		{-1, 1, -1},
        		{-1, -1, 1},
        		{-1, -1, -1},
        };
        
        int N, M;
        List<long[]> cake = new ArrayList<>();
        long ans = 0;
        
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	M = in.nextInt();
        	
        	for (int i = 0; i < N; ++i) {
        		long[] item = {
	        		in.nextLong(),
	        		in.nextLong(),
	        		in.nextLong()
        		};
        		cake.add(item);
        	}
        	
        	for (int[] d : D) {
        		Collections.sort(cake, (a, b) -> 
        			Long.signum(
        					(b[0]*d[0] + b[1]*d[1] + b[2]*d[2]) - 
        					(a[0]*d[0] + a[1]*d[1] + a[2]*d[2]))
        		);
        		long cur = 0;
        		for (int i = 0; i < M; ++i) {
        			cur += cake.get(i)[0]*d[0] + cake.get(i)[1]*d[1] + cake.get(i)[2]*d[2];
        		}
        		ans = Math.max(cur, ans);
        	}
        	
        	out.println(ans);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        long[] nextLongArray(int n) {
        	long[] arr = new long[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextLong();
        	}
        	return arr;
        }
    }
}
