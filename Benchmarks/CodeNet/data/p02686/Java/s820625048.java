import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] s = new char[n][];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		Obj[] arr = new Obj[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			int cnt = 0;
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] == '(') {
					cnt++;
				} else {
					cnt--;
					o.min = Math.min(o.min, cnt);
				}
			}
			o.cnt = cnt;
			arr[i] = o;
			total += cnt;
		}
		if (total != 0) {
			System.out.println("No");
			return;
		}

		Arrays.sort(arr, (o1, o2) -> {
			if (o1.min != o2.min) {
				return o2.min - o1.min;
			}
			return o2.cnt - o1.cnt;
		});

		int now = 0;
		List<Obj> list = new ArrayList<>();
		for (Obj o : arr) {
			if (now + o.min < 0) {
				System.out.println("No");
				return;
			}
			if (o.cnt >= 0) {
				now += o.cnt;
			} else {
				list.add(o);
			}
		}

		Collections.sort(list, (o1, o2) -> (o2.cnt - o2.min) - (o1.cnt - o1.min));
		for (Obj o : list) {
			if (now + o.min < 0) {
				System.out.println("No");
				return;
			}
			now += o.cnt;
		}
		System.out.println("Yes");
	}

	static class Obj {
		int min, cnt;
	}
}
