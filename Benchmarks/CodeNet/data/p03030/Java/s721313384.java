import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

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
    	SortedMap<String, SortedMap<Integer, Integer>> ranking = new TreeMap<>();
    	
        void solve(InputReader in, PrintWriter out) {
            // write your code here
        	N = in.nextInt();
        	for (int i = 1; i <= N; ++i) {
        		String s = in.next();
        		int p = in.nextInt();
        		if (!ranking.containsKey(s)) {
        			ranking.put(s, new TreeMap<>(Comparator.reverseOrder()));
        		}
        		ranking.get(s).put(p, i);
        	}
        	
        	for (Map.Entry<String, SortedMap<Integer, Integer>> e : ranking.entrySet()) {
        		for (Map.Entry<Integer, Integer> e1 : e.getValue().entrySet()) {
        			out.println(e1.getValue());
        		}
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
