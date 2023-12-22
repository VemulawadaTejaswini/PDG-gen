
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int MAX = 10;
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int b = sc.nextInt();
			if(l.size() < MAX || l.get(MAX-1) >= b )
				l.add(b);
			sort(l);
			if(l.size()==MAX) l.remove(MAX-1);
		}
		Integer[] a = l.toArray(new Integer[]{});
		ArrayList<Long> ans = new ArrayList<Long>();

		for(int i=0;i<a.length;i++) for(int j=0;j<a.length;j++) if(i!=j) {
			ans.add(Long.parseLong(String.valueOf(a[i]) + String.valueOf(a[j])));
		}
		sort(ans);
		System.out.println(ans.get(2));
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}