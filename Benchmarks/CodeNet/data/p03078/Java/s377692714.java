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
import java.util.PriorityQueue;
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
    	int X, Y, Z, K;
    	
    	List<Long> A = new ArrayList<>();
    	List<Long> B = new ArrayList<>();
    	List<Long> C = new ArrayList<>();
    	
    	PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> {
    		return Long.signum(b[0] - a[0]);
    	});
    	Set<String> used = new HashSet<>(); 
    	
    	List<Long> ans = new ArrayList<>();
    	
        void solve(InputReader in, PrintWriter out) {
        	X = in.nextInt();
        	Y = in.nextInt();
        	Z = in.nextInt();
        	K = in.nextInt();
        	
        	for (int i = 0; i < X; ++i) {
        		A.add(in.nextLong());
        	}
        	Collections.sort(A, Collections.reverseOrder());
        	
        	for (int i = 0; i < Y; ++i) {
        		B.add(in.nextLong());
        	}
        	Collections.sort(B, Collections.reverseOrder());
        	
        	for (int i = 0; i < Z; ++i) {
        		C.add(in.nextLong());
        	}
        	Collections.sort(C, Collections.reverseOrder());
        	
        	long[] max = {A.get(0) + B.get(0) + C.get(0), 0, 0, 0};
        	pq.add(max);
        	
        	for (int i = 0; i < K; ++i) {
        		long[] cur = pq.poll();
        		long v = cur[0], a = cur[1], b = cur[2], c = cur[3];
        		ans.add(v);
        		
        		if (a + 1 < X) {
        			long[] next = {A.get((int)a + 1) + B.get((int)b) + C.get((int)c), a + 1, b, c};
        			if (!used.contains(id(next))) {
        				pq.add(next);
        				used.add(id(next));
        			}
        		}
        		
        		if (b + 1 < Y) {
        			long[] next = {A.get((int)a) + B.get((int)b + 1) + C.get((int)c), a, b + 1, c};
        			if (!used.contains(id(next))) {
        				pq.add(next);
        				used.add(id(next));
        			}
        		}
        		
        		if (c + 1 < Z) {
        			long[] next = {A.get((int)a) + B.get((int)b) + C.get((int)c + 1), a, b, c + 1};
        			if (!used.contains(id(next))) {
        				pq.add(next);
        				used.add(id(next));
        			}
        		}
        	}
        	
        	for (int i = 0; i < K; ++i) out.println(ans.get(i));
        }
        
        String id(long[] a) {
        	return String.format("%d,%d,%d", a[1], a[2], a[3]);
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
