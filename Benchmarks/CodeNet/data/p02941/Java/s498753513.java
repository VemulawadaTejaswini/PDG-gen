import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Obj[] arr = new Obj[n];
		PriorityQueue<Obj> que = new PriorityQueue<>();
		String[] sa = br.readLine().split(" ");
		String[] sb = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			o.a = Integer.parseInt(sa[i]);
			o.b = Integer.parseInt(sb[i]);
			arr[i] = o;
			que.add(o);
		}
		br.close();

		long ans = 0;
		while (!que.isEmpty()) {
			Obj o = que.poll();
			int sum = arr[(o.i - 1 + n) % n].b + arr[(o.i + 1) % n].b;
			if (o.a % sum == o.b % sum) {
				ans += (o.b - o.a) / sum;
				o.b = o.a;
			} else {
				int ng = o.b / sum + 1;
				int ok = 0;
				while (ng - ok > 1) {
					int mid = (ng + ok) / 2;
					if (o.a <= o.b - sum * mid) {
						ok = mid;
					} else {
						ng = mid;
					}
				}
				if (ok == 0) {
					System.out.println(-1);
					return;
				}
				ans += ok;
				o.b = o.b - sum * ok;
				que.add(o);
			}
		}
		System.out.println(ans);
	}

	static class Obj implements Comparable<Obj> {
		int i, a, b;

		@Override
		public int compareTo(Obj o) {
			return o.b - b;
		}
	}
}
