import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		Obj[] arr = new Obj[m];
		for (int i = 0; i < m; i++) {
			Obj o = new Obj();
			sa = br.readLine().split(" ");
			o.b = Integer.parseInt(sa[0]);
			o.c = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.sort(a);
		Arrays.sort(arr, (o1, o2) -> o2.c - o1.c);
		long ans = 0;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (j >= m || a[i] >= arr[j].c) {
				ans += a[i];
			} else {
				ans += arr[j].c;
				arr[j].b--;
				if (arr[j].b == 0) {
					j++;
				}
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int b, c;
	}
}
