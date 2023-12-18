import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
    	int N, K;
    	long[][] sushi;
    	
    	long delicious = 0, variety = 0;
    	Map<Long, Integer> kind = new HashMap<>();
    	
    	List<long[]> topK = new ArrayList<>();
    	List<long[]> repl = new ArrayList<>();
    	List<long[]> rem = new ArrayList<>();
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	K = in.nextInt();
        	
        	sushi = new long[N][2];
        	for (int i = 0; i < N; ++i) {
        		long[] item = {in.nextLong(), in.nextLong()};
        		sushi[i] = item;
        		kind.put((long) i + 1, 0);
        	}
        	
        	Arrays.sort(sushi, (a, b) -> Long.signum(b[1] - a[1]));
        	
        	for (int i = 0; i < K; ++i) {
        		long[] item = sushi[i];
        		
        		topK.add(item);
        		if (kind.get(item[0]) > 0) repl.add(item);
        		
        		delicious += item[1];
        		kind.put(item[0], kind.get(item[0]) + 1);
        	}
        	
        	for (int e : kind.values()) {
        		variety += (long)Integer.signum(e);
        	}
        	
        	Set<Long> remKind = new HashSet<>();
        	for (int i = K; i < N; ++i) {
        		long[] item = sushi[i];
        		if (kind.get(item[0]) == 0 && !remKind.contains(item[0])) {
        			remKind.add(item[0]);
        			rem.add(item);
        		}
        	}
        	
        	long base = delicious + variety*variety;
        	long ans = base;
        	
        	//何個入れ替えるかでループ
        	long loss = 0;
        	long gain = 0;
        	for (int i = 0; i < Math.min(rem.size(), repl.size()); ++i) {
        		int remIdx = i;
        		int replIdx = repl.size() - (i + 1);
        		gain = (2*variety + i + 1)*(i + 1);
        		loss += repl.get(replIdx)[1] - rem.get(remIdx)[1];
        		ans = Math.max(ans, base + gain - loss);
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
