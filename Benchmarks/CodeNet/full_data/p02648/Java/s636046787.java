import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int MAX = 100001;

	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int[] value = new int[N + 1], weight = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			value[i] = sc.nextInt();
			weight[i] = sc.nextInt();
		}
		int[] firstMaxVal = new int[MAX], secondMaxVal = new int[MAX];
		Arrays.fill(firstMaxVal, INF);
		Arrays.fill(secondMaxVal, INF);
		int[] first = new int[1000], second = new int[1000];
		v = new int[20];
		w = new int[20];
		int fSize = 0, sSize = 0;
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int node = sc.nextInt();
			L = sc.nextInt();
			int cant = Integer.numberOfTrailingZeros(Integer.highestOneBit(node)) + 1;
			int ans = 0;
			if (cant == 1) {
				if (weight[1] <= L) ans = value[1];
			} else {
				int idx = 0;
				while (node > 0) {
					v[idx] = value[node];
					w[idx++] = weight[node];
					node /= 2;
				}
				int mid = cant / 2;

				maxValues = firstMaxVal;
				checked = first;
				size = 0;
				go(0, mid, 0, 0);
				fSize = size;
				Arrays.sort(first, 0, fSize);

				maxValues = secondMaxVal;
				checked = second;
				size = 0;
				go(mid, cant, 0, 0);
				sSize = size;
				Arrays.sort(second, 0, sSize);

				int sMax = 0, s = 0;
				for (int f = fSize - 1; f >= 0; f--) {
					int val = first[f];
					while (s < sSize && second[s] <= L - val) {
						sMax = Math.max(sMax, secondMaxVal[second[s]]);
						s++;
					}
					ans = Math.max(ans, sMax + firstMaxVal[val]);
				}

				for (int j = 0; j < fSize; j++) {
					firstMaxVal[first[j]] = INF;
				}
				for (int j = 0; j < sSize; j++) {
					secondMaxVal[second[j]] = INF;
				}
			}
			out.println(ans);
		}

		out.flush();
	}

	static int[] maxValues;
	static int[] v, w;
	static int L;
	static int[] checked;
	static int size;

	static void go(int from, int to, int acumV, int acumW) {
		if (from == to) {
			if (maxValues[acumW] == INF) {
				checked[size++] = acumW;
			}
			maxValues[acumW] = Math.min(maxValues[acumW], acumV);
			return;
		}
		go(from + 1, to, acumV, acumW);
		if (acumW + w[from] <= L) go(from + 1, to, acumV + v[from], acumW + w[from]);
	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
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
