import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int[] d = new int[m];
		long[] c = new long[m];
		for (int i = 0; i < m; i++) {
			String[] sa = br.readLine().split(" ");
			d[i] = Integer.parseInt(sa[0]);
			c[i] = Long.parseLong(sa[1]);
		}
		br.close();

		long ans = 0;
		long val = 0;
		for (int i = 0; i < m; i++) {
			ans += c[i];
			val += d[i] * c[i];
			ans += val / 10;
			val %= 10;
		}
		System.out.println(ans - 1);
	}
}
