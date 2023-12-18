import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		//int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] c = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < M; i++) {
			if(map.containsKey(c[A[i]])) {
				if(map.get(c[A[i]]) < A[i]) {
					map.put(c[A[i]], A[i]);
				}
			}else {
				map.put(c[A[i]], A[i]);
			}
		}
		int l = map.size();
		int[]k = new int[map.size()];
		int idx = 0;
		for(int key : map.keySet()) {
			k[idx] = key;
			idx++;
		}
		if(l == 1) {
			for(int i = 0; i < N / k[0]; i++) {
				System.out.print(map.get(k[0]));
			}
			System.out.println();
			System.exit(0);
		}
		Arrays.sort(k);
		Data[] d = new Data[N + 1];
		for(int i = 0; i <= N; i++) {
			d[i] = new Data(l);
		}
//		for(int i = 1; i <= N / k[0]; i++) {
//			d[i * k[0]].flag = true;
//			d[i * k[0]].g[0] = i;
//		}
		d[0].flag = true;
		for(int i = 0; i < N; i++) {
			if(!d[i].flag) continue;
			for(int j = 0; j < l; j++) {
				int t = i + k[j];
				if(t > N) break;
				if(d[t].flag == false) {
					d[t].flag = true;
					for(int u = 0; u < l; u++) {
						d[t].g[u] = d[i].g[u];
					}
					d[t].g[j] += 1;
				}else {
					if(d[t].sum() <= d[i].sum()) {
						for(int u = 0; u < l; u++) {
							d[t].g[u] = d[i].g[u];
						}
						d[t].g[j] += 1;
					}else if(d[t].sum() == d[i].sum() + 1) {
						int f1 = 0;
						int f2 = 0;
						for(int u = 0; u < l; u++) {
							f1 += d[t].g[u] * map.get(k[u]);
							f2 += d[i].g[u] * map.get(k[u]);
						}
						f2 += map.get(k[j]);
						if(f1 < f2) {
							for(int u = 0; u < l; u++) {
								d[t].g[u] = d[i].g[u];
							}
							d[t].g[j] += 1;
						}
					}
				}
			}
		}
		Integer[] ans = new Integer[d[N].sum()];
		idx = 0;
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < d[N].g[i]; j++) {
				ans[idx] = map.get(k[i]);
				idx++;
			}
		}
		Arrays.sort(ans, Collections.reverseOrder());
		for(int i : ans) {
			System.out.print(i);
		}
		System.out.println();

	}
	static class Data{
		int[]g;
		boolean flag = false;
		public Data(int n) {
			g = new int[n];
		}
		public int sum() {
			int ret = 0;
			for(int i : g) {
				ret += i;
			}
			return ret;
		}
	}
}