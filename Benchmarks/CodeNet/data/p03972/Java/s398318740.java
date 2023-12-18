import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int w = Integer.parseInt(sa[0]);
		int h = Integer.parseInt(sa[1]);
		int[] p = new int[w + 1];
		for (int i = 0; i < w; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		int[] q = new int[h + 1];
		for (int i = 0; i < h; i++) {
			q[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		p[w] = 1000000000;
		q[h] = 1000000000;
		Arrays.parallelSort(p);
		Arrays.parallelSort(q);

		int i = 0;
		int j = 0;
		long ans = 0;
		while (i < w || j < h) {
			if (p[i] < q[j]) {
				ans += (long) p[i] * (h - j + 1);
				i++;
			} else {
				ans += (long) q[j] * (w - i + 1);
				j++;
			}
		}
		System.out.println(ans);
	}
}
