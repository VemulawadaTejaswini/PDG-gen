import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];
		HashMap<Long, Long>map = new HashMap<Long,Long>();

		for (int i=0; i<n; i++){
			a[i] = sc.nextLong();
			if (map.containsKey(a[i])){
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], (long) 1);
			}
		}

		Iterator it = map.keySet().iterator();
		long total = 0;
		while (it.hasNext()){
			long key = (long) it.next();
			long tmp = map.get(key) -1;
			total += (tmp * (tmp+1)) / 2;
		}

		for (int i=0; i<n; i++){
			long tmp2 = map.get(a[i]);
			System.out.println(total - (tmp2 -1));
		}

	}
}