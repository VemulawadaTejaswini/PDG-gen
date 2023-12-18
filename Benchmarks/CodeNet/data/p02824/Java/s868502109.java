import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int v = Integer.parseInt(sa[2]);
		int p = Integer.parseInt(sa[3]);
		sa = br.readLine().split(" ");
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			o.a = Integer.parseInt(sa[i]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, (o1, o2) -> o2.a - o1.a);
		long[] sum = new long[n + 1];
		for (int i = 0; i < n; i++) {
			sum[i + 1] = sum[i] + arr[i].a;
		}
		int min = arr[p - 1].a;
		int over = 0;
		for (int i = 0; i < n; i++) {
			Obj o = arr[i];
			if (o.a > min) {
				over++;
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			Obj o = arr[i];
			if (o.a >= min) {
				ans++;
				continue;
			}
			if (o.a + m < min) {
				continue;
			}
			long num1 = n - over - (n - i);
			long num2 = v - over - (n - i);
			long s = num1 * (o.a + m);
			s -= sum[i] - sum[over];
			if (num2 * m <= s) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int i, a;
	}
}
