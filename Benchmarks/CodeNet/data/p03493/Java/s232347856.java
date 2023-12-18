import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		no4();
	}

	static void no4() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			Integer[] a = new Integer[N];

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}

			int max = -99999;
			int maxi = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
					maxi = i;
				}
			}

			int min = 99999;
			int mini = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] < min) {
					min = a[i];
					mini = i;
				}
			}

			List<String> list = new ArrayList<String>();
			if (max > 0) {
				for (int i = 0; i < N - 1; i++) {
					while (a[i] > a[i + 1]) {
						a[i + 1] += max;
						list.add((maxi + 1) + " " + (i + 2));
					}
					System.out.println(a[i] + ":" + a[i + 1]);
				}
			} else {
				for (int i = N - 1; i > 0; i--) {
					while (a[i - 1] > a[i]) {
						a[i - 1] += min;
						list.add((mini + 1) + " " + (i));
					}
					System.out.println(a[i] + ":" + a[i + 1]);
				}
			}
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			Long[] a = new Long[N];

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
			}

			Map<Long, Long> map = new HashMap<Long, Long>();
			for (int i = 0; i < N; i++) {
				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]).longValue() + 1);
				} else {
					map.put(a[i], 1L);
				}
			}

			List<Entry<Long, Long>> entries = new ArrayList<Entry<Long, Long>>(map.entrySet());

			Collections.sort(entries, new Comparator<Entry<Long, Long>>() {
				// 比較関数
				@Override
				public int compare(Entry<Long, Long> o1, Entry<Long, Long> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
			});

			int size = map.size();
			int ans = 0;
			for (int i = 0; i < N; i++) {
				if (size > K) {
					Long t = entries.get(i).getValue();
					size = size - 1;
					ans += t;
				} else {
					break;
				}
			}
			System.out.println(ans);
		}
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] a = new long[N];

			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong();
			}

			int flg = 0;
			int ans = -1;
			for (int i = 0; i < 100; i++) {
				ans++;
				for (int n = 0; n < N; n++) {
					if (a[n] % 2 == 0) {
						a[n] = a[n] / 2;
					} else {
						flg = 1;
					}
				}
				if (flg == 1) {
					break;
				}
			}
			System.out.println(ans);
		}
	}

	static void no1() {
		try (Scanner sc = new Scanner(System.in)) {
			String t = sc.next();

			int a = Integer.parseInt(t.substring(0, 1));
			int b = Integer.parseInt(t.substring(1, 2));
			int c = Integer.parseInt(t.substring(2, 3));

			System.out.println(a + b + c);
		}
	}
}
