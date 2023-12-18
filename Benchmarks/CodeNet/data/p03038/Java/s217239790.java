import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		HashMap<Integer, Integer> map = new HashMap<>();
//		int[] a = new int[1000000000+1];
		int a = 0;
		for(i=0; i<n; i++) {
//			a[parseInt(sc.next())]++;
			a = parseInt(sc.next());
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}
		int b;
		int c;
		for(i = 0; i < m; i++) {
			b = parseInt(sc.next());
			c = parseInt(sc.next());
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+b);
			} else {
				map.put(c, b);
			}
//			a[c] += b;
		}
		sc.close();
//		out.println(Arrays.toString(a));
		Integer[] keys = map.keySet().toArray(new Integer[map.size()]);
		Arrays.sort(keys, Comparator.reverseOrder());
		int cnt = 0;
		long sum = 0;
		for(Integer ii: keys) {
			if(map.get(ii) == 0) continue;
//			out.printf("%d:%d%n", ii, map.get(ii));
			if(map.get(ii) + cnt > n ) {
				sum += (long)ii*(n-cnt);
				break;
			} else {
				sum += (long)ii*map.get(ii);
			}
			cnt += map.get(ii); 
		}
		out.println(sum);
	}
}
