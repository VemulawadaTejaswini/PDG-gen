import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashSet;
import java.util.*;

class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
		int N = in.nextInt();
		int M = in.nextInt();
		Comparator<Work> comparator_1 = new Comparator<Work>() {
		    @Override
		    public int compare(Work o1, Work o2) {
		        return Integer.compare(o1.A, o2.A);
		    }
		};
		Comparator<Work> comparator_2 = new Comparator<Work>() {
		    @Override
		    public int compare(Work o1, Work o2) {
		        return Integer.compare(o2.B, o1.B);
		    }
		};
		PriorityQueue<Work> queue_1 = new PriorityQueue<Work>(comparator_1);
		for (int i=0;i<N;i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			queue_1.add(new Work(A, B));
		}

		long ans = 0L;
		PriorityQueue<Work> queue_2 = new PriorityQueue<Work>(comparator_2);
		for (int i=0;i<=M;i++) {
			while(true) {
				if (queue_1.isEmpty()) {
					break;
				}
				Work tmp = queue_1.peek();
				if (tmp.A<=i) {
					queue_2.add(queue_1.poll());
				} else {
					break;
				}
			}
			if (!queue_2.isEmpty()) {
				Work rem = queue_2.poll();
				ans += rem.B;
			}
		}
		System.out.println(ans);
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

    }

	static class Work {
		public int A;
		public int B;

		public Work(int A, int B) {
			this.A = A;
			this.B = B;
		}
	}
}
