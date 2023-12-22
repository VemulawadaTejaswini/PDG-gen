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

			if(cmd == 0) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int x = sc.nextInt();
				V[0].updateRangeValue(x, s, t);

			} else {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int ans = V[0].getMinimum(s, t);
				sb.append(ans);
				sb.append("\n");
			}

//			System.out.print("i:" + i + " value");
//			for(int j=0; j<N; j++) {
//				System.out.print(" " + V[j].value);
//			}
//			System.out.println();
//
//			System.out.print("i:" + i + " lazy");
//			for(int j=0; j<N; j++) {
//				System.out.print(" " + V[j].lazy);
//			}
//			System.out.println();
		}

		System.out.print(sb);

	}

	static class NodeSegmentTree {
		int seg_left;
		int seg_right;
		int id;
		int value = Integer.MAX_VALUE;
		int lazy = -1;
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

		void updateValue(int value) {
			if(id >= N/2 || value < this.value) {
				this.value = value;
				if(id != 0) {
					V[(id - 1) / 2].updateValue(value);
				}
			} else if(this.value != V[2 * id + 1].value && this.value != V[2 * id + 2].value) {
				this.value = Math.min(V[2 * id + 1].value, V[2 * id + 2].value);
				V[(id - 1) / 2].updateValue(value);
			}
		}

		void updateRangeValue(int value, int l, int r) {
			if(id >= N/2 && lazy != -1) {
				this.value = lazy;
				lazy = -1;
				V[(id - 1) / 2].updateValue(value);
			} else if(lazy != -1) {
				V[2 * id + 1].lazy = lazy;
				V[2 * id + 2].lazy = lazy;
				V[2 * id + 1].updateValue(lazy);
				V[2 * id + 2].updateValue(lazy);
				lazy = -1;
			}

			if(l <= seg_left && r >= seg_right) {
				if(id < N/2) {
					lazy = value;
				}
				this.value = value;
				V[(id - 1) / 2].updateValue(value);
				return;
			}
			if(l > seg_right || r < seg_left) {
				return;
			}


			V[2 * id + 1].updateRangeValue(value, l, r);
			V[2 * id + 2].updateRangeValue(value, l, r);
		}

		public int getMinimum(int l, int r) {
			if(id >= N/2 && lazy != -1) {
				value = lazy;
				lazy = -1;
				V[(id - 1) / 2].updateValue(value);
			} else if(lazy != -1) {
				V[2 * id + 1].lazy = lazy;
				V[2 * id + 2].lazy = lazy;
				V[2 * id + 1].updateValue(lazy);
				V[2 * id + 2].updateValue(lazy);
				lazy = -1;
			}

			if(l <= seg_left && r >= seg_right) {
				return value;
			}
			if(l > seg_right || r < seg_left) {
				return Integer.MAX_VALUE;
			}

			int a = V[2 * id + 1].getMinimum(l, r);
			int b = V[2 * id + 2].getMinimum(l, r);
			return Math.min(a, b);
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