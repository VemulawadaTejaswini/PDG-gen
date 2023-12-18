import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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
    	int N, L;
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	L = in.nextInt();
        	
        	int total = 0;
        	int minDiff = Integer.MAX_VALUE;
        	for (int i = 0; i < N; ++i) {
        		int taste = L + i;
        		total += taste;
        		if (Math.abs(minDiff) > Math.abs(taste)) {
        			minDiff = taste;
        		}
        	}
        	
        	out.println(total - minDiff);
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
        
        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }

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
