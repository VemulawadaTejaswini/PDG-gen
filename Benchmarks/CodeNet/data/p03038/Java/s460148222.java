import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			long[] a = new long[n];
			for(int i=0; i<n; i++) {
				a[i] = sc.nextLong();
			}
			Arrays.sort(a);
			Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
			for(int i=0; i<m; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				if(map.get(t)!=null)	s+=map.get(t);
				map.put(t, s);
			}
			long ans = 0;
			int now = 0;
			for(Integer key:map.keySet()) {
				int dis = Math.min(now+map.get(key), n);
				for(int i=now; i<dis; i++) {
					if(a[i]<key) {
						a[i] = key;
					}
				}
				now = dis;
			}
			for(int i=0; i<n; i++) {
				ans += a[i];
			}
			System.out.println(ans);
		}
	}

}