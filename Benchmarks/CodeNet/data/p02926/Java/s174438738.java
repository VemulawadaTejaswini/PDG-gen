import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Vec[] arr = new Vec[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Vec v = new Vec();
			v.x = Integer.parseInt(sa[0]);
			v.y = Integer.parseInt(sa[1]);
			v.i = i;
			if (v.x != 0 || v.y != 0) {
				v.atan = Math.atan2(v.y, v.x);
			}
			arr[i] = v;
		}
		br.close();

		Arrays.sort(arr, (a, b) -> a.atan < b.atan ? -1 : a.atan == b.atan ? 0 : 1);

		long max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < i + n; j++) {
				long x = 0;
				long y = 0;
				for (int k = i; k <= j; k++) {
					x += arr[k % n].x;
					y += arr[k % n].y;
				}
				max = Math.max(max, x * x + y * y);
			}
		}
		System.out.println(Math.sqrt(max));
	}

	static class Vec {
		int i, x, y;
		double atan = 0;
	}
}
