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
			int x = Integer.parseInt(sa[0]);
			int l = Integer.parseInt(sa[1]);
			o.x = x;
			o.l = x - l;
			o.r = x + l;
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, (o1, o2) -> o1.r - o2.r);
		int ans = 0;
		int now = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (now <= arr[i].l) {
				ans++;
				now = arr[i].r;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int x, l, r;
	}
}
