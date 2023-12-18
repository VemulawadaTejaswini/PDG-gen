import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Obj[] arr = new Obj[n + 1];
		String[] sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.t = Integer.parseInt(sa[i]);
			arr[i] = o;
		}
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i].v = Integer.parseInt(sa[i]);
		}
		br.close();

		Obj o = new Obj();
		o.v = 1000;
		arr[n] = o;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i].t1 = sum;
			arr[i].a = arr[i].v + sum;
			sum += arr[i].t;
			arr[i].t2 = sum;
			arr[i].b = arr[i].v - sum;
		}
		o.t2 = sum;
		o.b = sum;

		double[] v = new double[sum * 2 + 1];
		for (int i = 0; i < v.length; i++) {
			double x = i / 2.0;
			double min = 1000;
			for (int j = 0; j < arr.length - 1; j++) {
				if (x <= arr[j].t1) {
					min = Math.min(min, -x + arr[j].a);
				}
				if (arr[j].t1 <= x && x <= arr[j].t2) {
					min = Math.min(min, arr[j].v);
				}
				if (arr[j].t2 <= x) {
					min = Math.min(min, x + arr[j].b);
				}
			}
			min = Math.min(min, x + o.a);
			min = Math.min(min, -x + o.b);
			v[i] = min;
		}

		double ans = 0;
		for (int i = 1; i < v.length; i++) {
			double val = (v[i - 1] + v[i]) / 4;
			ans += val;
		}
		System.out.println(ans);
	}

	static class Obj {
		int t, t1, t2, v, a, b;
	}
}
