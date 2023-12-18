import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
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
    	long A, B, C, D, CD;
    	
    	long cnt(long x) {
    		long X = A/x*x;
    		long Y = B/x*x;
    		
    		long ret = (Y - X)/x;
    		if (A % x == 0) ret++;
    		
    		return ret;
    	}
    	
        void solve(InputReader in, PrintWriter out) {
        	A = in.nextLong();
        	B = in.nextLong();
        	C = in.nextLong();
        	D = in.nextLong();
        	CD = lcm(C, D);
        	
        	out.println((B - A + 1) - (cnt(C) + cnt(D) - cnt(CD)));
        }
        
        long gcd(long a, long b) {
    		return (a < b) ? gcd(b, a) : (b > 0) ? gcd(b, a % b) : a;
    	}
    	
    	long lcm(long a, long b) {
    		return a / gcd(a, b) * b;
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
