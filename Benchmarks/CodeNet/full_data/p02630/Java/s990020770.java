import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

		int N = in.nextInt();
		int[] A = new int[N];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i=0;i<N;i++) {
			A[i] = in.nextInt();
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			} else {
				map.put(A[i], 1);
			}
		}
		long ans = 0L;
		ArrayList<Integer> key = new ArrayList<Integer>(map.keySet());
		ArrayList<Integer> vall = new ArrayList<Integer>(map.values());
		for (int i=0;i<key.size();i++) {
			ans += (long)key.get(i)*vall.get(i);
		}
		int Q = in.nextInt();
		int[] B = new int[Q];
		int[] C = new int[Q];
		for (int i=0;i<Q;i++) {
			B[i] = in.nextInt();
			C[i] = in.nextInt();
			if (map.containsKey(B[i])) {
				int val = map.get(B[i]);
				ans -= (long)B[i]*val;
				ans += (long)C[i]*val;
				map.remove(B[i]);
				if (map.containsKey(C[i])) {
					map.put(C[i], map.get(C[i])+val);
				} else {
					map.put(C[i], val);
				}
			}
			out.println(ans);
		}
		out.close();
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
