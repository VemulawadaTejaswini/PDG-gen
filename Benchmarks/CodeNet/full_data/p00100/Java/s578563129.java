
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			HashMap<Long, Integer> map = new HashMap<Long, Integer>();
			int p=0;
			long[] val = new long[n];
			long[] ids = new long[n];
			for(int i=0;i<n;i++) {
				long id = sc.nextInt(), k = sc.nextInt(), c = sc.nextInt();
				if(map.containsKey(id)) {
					val[map.get(id)] += k * c;
				}
				else {
					map.put(id, p);
					ids[p] = id;
					val[p++] = k * c;
				}
			}
			ArrayList<Long> ans = new ArrayList<Long>();
			for(int i=0;i<n;i++) if( val[i] >= 1000000 ) ans.add(ids[i]);
			if(ans.isEmpty()) {
				System.out.println("NA");
			}
			else {
				for(long l: ans) System.out.println(l);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}