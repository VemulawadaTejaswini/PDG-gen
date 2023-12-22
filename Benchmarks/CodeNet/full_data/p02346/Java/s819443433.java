import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	static NodeSegmentTree[] V;
	static int N;

	public static void main(String[] args) {
		int n = sc.nextInt();
		int q = sc.nextInt();

		N = 1;
		while(N < n) {
			N *= 2;
		}
		N = N * 2 - 1;
		if(N == 1) {
			N = 3;
		}

		V = new NodeSegmentTree[N];
		for(int i=0; i<N; i++) {
			V[i] = new NodeSegmentTree(i);
		}

		for(int i=N/2 - 1; i>=0; i--) {
			V[i].setSegment();
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<q; i++) {
			int cmd = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			if(cmd == 0) {
				x--;
				V[N/2 + x].addValue(y);
			} else {
				x--;
				y--;
				int ans = V[0].getSum(x, y);
				sb.append(ans);
				sb.append("\n");
			}
		}

		System.out.print(sb);

	}

	static class NodeSegmentTree {
		int seg_left;
		int seg_right;
		int id;
		int value = 0;
		//left = 2 * id + 1
		//right = 2 * id + 2
		//parent = (id - 1) / 2
		//array[i] -> V[N/2 + i]

		NodeSegmentTree(int id) {
			this.id = id;
			this.seg_left = id - N/2;
			this.seg_right = id - N/2;
		}

		void setSegment() {
			seg_left = V[2 * id + 1].seg_left;
			seg_right = V[2 * id + 2].seg_right;
		}

//		void updateValue(int value) {
//			if(id >= N/2 || value < this.value) {
//				this.value = value;
//				V[(id - 1) / 2].updateValue(value);
//			} else if(this.value != V[2 * id + 1].value && this.value != V[2 * id + 2].value) {
//				this.value = Math.min(V[2 * id + 1].value, V[2 * id + 2].value);
//				V[(id - 1) / 2].updateValue(value);
//			}
//		}

		void addValue(int value) {
			this.value += value;
			if(id != 0) {
				V[(id - 1) / 2].addValue(value);
			}
		}

//		public int getMinimum(int l, int r) {
//			if(l <= seg_left && r >= seg_right) {
//				return value;
//			}
//			if(l > seg_right || r < seg_left) {
//				return Integer.MAX_VALUE;
//			}
//
//			int a = V[2 * id + 1].getMinimum(l, r);
//			int b = V[2 * id + 2].getMinimum(l, r);
//			return Math.min(a, b);
//		}

		public int getSum(int l, int r) {
			if(l <= seg_left && r >= seg_right) {
				return value;
			}
			if(l > seg_right || r < seg_left) {
				return 0;
			}

			int a = V[2 * id + 1].getSum(l, r);
			int b = V[2 * id + 2].getSum(l, r);
			return a + b;
		}

	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}