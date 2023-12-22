import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static PrintWriter out;

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(System.out);
		int N = sc.nextInt();
		char[][] words = new char[N][];
		for (int i = 0; i < N; i++) {
			words[i] = sc.next().toCharArray();
			insert(words[i], 0, words[i].length - 1);
		}
		//print(0, "\t");
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += calc(words[i]);
		}
		out.println(ans);
		
		out.flush();
	}

	static int[][] count = new int[26][1000002];
	static int[][] next = new int[26][1000002];
	static int size = 1;

	static int insert(char[] word, int node, int pos) {
		if (pos == -1) return 0;
		int idx = word[pos] - 'a';
		int child = next[idx][node];
		if (child == 0) {
			next[idx][node] = child = size++;
		}
		int ret = insert(word, child, pos - 1) | (1 << idx);
		for (int i = 0; i < 26; i++) if (contains(ret, i)) {
			count[i][node]++;
		}
		return ret | (1 << idx);
	}

	static int calc(char[] word) {
		int cur = 0;
		for (int i = word.length - 1; i >= 1; i--) {
			cur = next[word[i] - 'a'][cur];
		}
		//System.err.println(new String(word) + " => " + cur.count[word[0] - 'a']);
		return count[word[0] - 'a'][cur] - 1;
	}

	static void print(int node, String tab) {
		for (int i = 0; i < 26; i++) {
			if (count[i][node] > 0) {
				System.err.print(tab + " count= " + (char) (i + 'a') + " => " + count[i][node]);
			}
		}
		System.err.println();
		for (int i = 0; i < 26; i++) {
			if (next[i][node] != 0) {
				print(next[i][node], tab + (char) (i + 'a'));
			}
		}
	}

	static boolean contains(int mask, int pos) {
		return (mask & (1<<pos)) != 0;
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
