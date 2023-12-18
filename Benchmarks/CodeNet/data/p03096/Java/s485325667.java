
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] c = new int[n];
		HashMap<Integer,TreeSet<Integer>> map = new HashMap<>();
		for (int i=0;i<=200_000;i++) {
			map.put(i, new TreeSet<Integer>());
		}
		for (int i=0;i<n;i++) {
			c[i]=sc.nextInt();
			map.get(c[i]).add(i);
		}
		long MOD = 1_000_000_007;
		long[] ans = new long[n];

		ans[0]=1;
		for (int i=1;i<n;i++) {
			ans[i]=ans[i-1];
			if (c[i]!=c[i-1]) {
				TreeSet<Integer> ts = (TreeSet<Integer>) map.get(c[i]).headSet(i);
				if (ts.size()==1) {
					if (ts.last()>0) {
						ans[i]+=ans[ts.last()-1];
					}
					else {
						ans[i]++;
					}
					ans[i]%=MOD;
				}
				if (ts.size()>1) {
					ans[i]+=ans[ts.last()];
					ans[i]%=MOD;

				}
			}
		}

		System.out.println(ans[n-1]);
	}
}
