import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    	int N;
    	List<int[]> points = new ArrayList<>();
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	
        	for (int i = 0; i < N; ++i) {
        		int[] item = {in.nextInt(), in.nextInt()};
        		points.add(item);
        	}
        	
        	Collections.sort(points, (a, b) -> a[0] - b[0]);
        	
        	int ans = N;
        	for (int i = 0; i < N; ++i) {
        		for (int j = i + 1; j < N; ++j) {
        			int[] a = points.get(i);
        			int[] b = points.get(j);
        			int p = b[0] - a[0];
        			int q = b[1] - a[1];
        			
        			int res = N;
        			Set<Integer> used = new HashSet<>();
        			
        			for (int k = 0; k < N; ++k) {
        				if (used.contains(k)) continue;
        				
        				int mul = 1;
        				int[] cur = points.get(k);
        				used.add(k);
        				
        				for (int l = k + 1; l < N; ++l) {
        					int nx = cur[0] + p*mul;
        					int ny = cur[1] + q*mul;
        					if (nx == points.get(l)[0] && ny == points.get(l)[1]) {
        						used.add(l);
        						res--;
        						mul++;
        					}
        				}
        			}
        			ans = Math.min(res, ans);
        		}
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
