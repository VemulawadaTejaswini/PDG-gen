import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long k = Long.parseLong(str[1]);

		int a[] = new int[n];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]) - 1;
		}

		int dist[] = new int[n];
		Arrays.fill(dist, -1);

		int next = 0;
		int count = 1;
		int hsize = 0;

		long ans = 0;
		dist[0] = 0;

		while (true) {
			next = a[next];

			if (dist[next] == -1) {
				dist[next] = count;
			} else {
				hsize = count - dist[next];
				ans = (k - dist[next]) % hsize;
				break;
			}
			count++;
		}

		if (k < dist[next]) {
			System.out.println(a[(int) k] + 1);
		} else {
			System.out.println(a[(int) (ans + dist[next])] + 1);
		}
	}
}
