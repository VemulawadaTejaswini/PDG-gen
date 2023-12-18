import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);
			long x = Math.min(a, b);
			long y = Math.max(a, b);
			long xy = x * y;

			if (y - x <= 1) {
				System.out.println((x - 1) * 2);
			} else {
				long ans = (x - 1) * 2;
				long start = (long) (Math.sqrt(xy)) + 10;
				start = start + start - x;
				for (long r = start; r > x; r--) {
					long d = r - x;
					if (d % 2 == 0) {
						long m = (x + r) / 2;
						if (m * m < xy) {
							ans += r - x;
							break;
						}
					} else {
						long m = (x + r) / 2;
						if (m * (m + 1) < xy) {
							ans += r - x;
							break;
						}
					}
				}
				System.out.println(ans);
			}
		}
		br.close();
	}
}
