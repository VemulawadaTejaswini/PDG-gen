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
		int[] a = new int[n];
		int biggest = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
			biggest = Math.max(biggest, a[i]);
			sum += a[i];
		}
		reader.close();
		
		int floor = biggest;
		int ceiling = sum;
		while (floor < ceiling) {
			int p = floor + (ceiling - floor) / 2;
			int total = 0;
			int cnt = 1;
			for (int i = 0; i < n; i++) {
				if (total + a[i] > p) {
					cnt++;
					total = 0;
				}
				total += a[i];
			}
			if (cnt <= k) {
				ceiling = p;
			} else {
				floor = p + 1;
			}
		}
	
		System.out.println(ceiling);
	}
}

