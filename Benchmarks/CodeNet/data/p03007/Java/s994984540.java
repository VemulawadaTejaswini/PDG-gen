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
    	int ans = 0;
    	List<int[]> q = new ArrayList<>();
    	List<Integer> natural = new ArrayList<>();
    	List<Integer> minus = new ArrayList<>();
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	for (int i = 0; i < N; ++i) {
        		int x = in.nextInt();
        		if (x < 0) {
        			minus.add(x);
        		} else {
        			natural.add(x);
        		}
        	}
        	
        	Collections.sort(natural);
        	Collections.sort(minus, Collections.reverseOrder());
        	
        	if (minus.size() > 0) {
        		int x = minus.get(0);
        		for (int i = 0; i < natural.size(); ++i) {
        			int y = natural.get(i);
        			if (i < natural.size() - 1) {
        				int[] query = {x, y};
            			q.add(query);
            			x -= y;
        			} else {
        				int[] query = {y, x};
            			q.add(query);
            			x = y - x;
        			}
        		}
    			
        		for (int i = 1; i < minus.size(); ++i) {
        			int y = minus.get(i);
        			int[] query = {x, y};
        			q.add(query);
        			x -= y;
        		}
        		ans = x;
        	} else {
        		int x = natural.get(0);
        		for (int i = 1; i < natural.size(); ++i) {
        			int y = natural.get(i);
        			if (i < natural.size() - 1) {
        				int[] query = {x, y};
            			q.add(query);
            			x -= y;
        			} else {
        				int[] query = {y, x};
            			q.add(query);
            			x = y - x;
        			}
        			
        		}
        		ans = x;
        	}
        	
        	out.println(ans);
        	for (int[] v : q) {
        		out.println(v[0] + " " + v[1]);
        	}
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
