import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = 2147483647;
		int q = Integer.parseInt(st.nextToken());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int c = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (c == 0) {
				a[x] = y;
			} else {
				System.out.println(find(a, x, y));
			}
		}
		reader.close();
	}

	private int find(int[] a, int x, int y) {
		int min = Integer.MAX_VALUE;
		for (int i = x; i <= y; i++) {
			min = Math.min(min, a[i]);
		}
		return min;
	}
}
