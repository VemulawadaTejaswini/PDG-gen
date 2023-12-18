import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
    	int N, M, ans = 0;
    	boolean[] box;
    	int[] ball; 
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	M = in.nextInt();
        	
        	box = new boolean[N];
        	Arrays.fill(box, false);
        	box[0] = true;
        	
        	ball = new int[N];
        	Arrays.fill(ball, 1);
        	
        	for (int i = 0; i < M; ++i) {
        		int x = in.nextInt() - 1;
        		int y = in.nextInt() - 1;
        		
        		if (box[x]) {
        			box[y] = true;
        			if (ball[x] < 2) box[x] = false;
        		}
        		
        		ball[x]--;
        		ball[y]++;
        	}
        	
        	for (boolean red : box) {
        		if (red) ans++;
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
