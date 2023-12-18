import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			arr[i] = o;
		}
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(br.readLine()) - 1;
			arr[a].list.add(arr[i]);
		}
		br.close();

		for (int i = 0; i < n; i++) {
			List<Obj> list = arr[i].list;
			if (!list.isEmpty()) {
				arr[i].d++;
				Collections.sort(list);
				for (int j = 0; j < list.size(); j++) {
					list.get(j).d = arr[i].d + j;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, arr[i].d);
		}
		System.out.println(ans);
	}

	static class Obj implements Comparable<Obj> {
		int i, d;
		List<Obj> list = new ArrayList<>();

		@Override
		public int compareTo(Obj o) {
			return o.list.size() - list.size();
		}
	}
}
