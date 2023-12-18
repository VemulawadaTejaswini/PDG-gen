import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Obj o = new Obj();
			o.a = Integer.parseInt(sa[0]);
			o.b = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, new Comparator<Obj>() {
			public int compare(Obj o1, Obj o2) {
				return o1.a - o2.a;
			}
		});

		PriorityQueue<Obj> pq = new PriorityQueue<>(new Comparator<Obj>() {
			public int compare(Obj o1, Obj o2) {
				return o2.b - o1.b;
			}
		});

		int ans = 0;
		int j = 0;
		for (int i = 1; i <= m; i++) {
			for ( ; j < n; j++) {
				if (arr[j].a > i) {
					break;
				}
				pq.add(arr[j]);
			}
			Obj o = pq.poll();
			if (o != null) {
				ans += o.b;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int a, b;
	}
}
