import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.l = Integer.parseInt(sa[0]);
			o.r = Integer.parseInt(sa[1]);
			o.v = o.r - o.l + 1;
			arr[i] = o;
		}
		br.close();

		Obj maxV = new Obj();
		Obj maxL = new Obj();
		Obj minR = new Obj();
		minR.r = 1000000000;
		for (int i = 0; i < n; i++) {
			Obj o = arr[i];
			if (o.v > maxV.v) {
				maxV = o;
			}
			if (o.l > maxL.l) {
				maxL = o;
			}
			if (o.r < minR.r) {
				minR = o;
			}
		}
		int ans = maxV.v + minR.r - maxL.l + 1;
		if (maxL == minR) {
			System.out.println(ans);
			return;
		}

		Arrays.parallelSort(arr);

		int minr = maxL.r;
		for (int i = 1; i < n; i++) {
			Obj o = arr[i - 1];
			minr = Math.min(minr, o.r);
			int v1 = Math.max(minR.r - arr[i].l + 1, 0);
			int v2 = Math.max(minr - maxL.l + 1, 0);
			ans = Math.max(ans, v1 + v2);
		}
		System.out.println(ans);
	}

	static class Obj implements Comparable<Obj> {
		int l, r, v;

		@Override
		public int compareTo(Obj o) {
			if (l != o.l) {
				return o.l - l;
			}
			return o.r - r;
		}
	}
}
