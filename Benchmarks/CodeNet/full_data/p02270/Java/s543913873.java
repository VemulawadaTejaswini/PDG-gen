import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] w = new int[n];
		int m = (1<<30) * -1;
		int j = 0;
		for (int i = 0; i < n; i++) {
			w[i] = Integer.parseInt(reader.readLine());
			m = Math.max(m, w[i]);
			j += w[i];
		}
		reader.close();

		int i = m;
		while (i <= j) {
			int guess = i + (j - i) / 2;
			if (allocate(n, w, k, guess) < 0) {
				i = guess + 1;
			} else {
				j = guess - 1;
			}
		}
		System.out.println(i);
	}

	private int allocate(int n, int[] w, int k, int p) {
		int load = 0;
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			if (load + w[i] > p) {
				cnt++;
				if (cnt > k) return -1;
				load = 0;
			}
			load += w[i];
		}
		return 0;
	}
}
