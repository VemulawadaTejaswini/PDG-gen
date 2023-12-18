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


		for (int i=0; i<n; i++){
			HashMap<Long, Long> cloneMap = new HashMap<Long, Long>();
			cloneMap.putAll(map);
			cloneMap.put(a[i], cloneMap.get(a[i])-1);
			long tmp = 0;
			long total =0;
			Iterator it = cloneMap.keySet().iterator();

			while (it.hasNext()){
				long key = (long) it.next();
				tmp = cloneMap.get(key) -1;
				total += (tmp * (tmp+1)) / 2;
			}

			System.out.println(total);
		}

	}
}