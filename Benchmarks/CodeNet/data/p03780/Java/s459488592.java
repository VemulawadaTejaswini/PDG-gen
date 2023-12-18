import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int ans = 0;
		Set<Integer> ar1 = new HashSet<>();
		ar1.add(0);
		Set<Integer> ar2 = new HashSet<>();
		Iterator<Integer> it;
		for(int m = 0; m < n; m++) {

			for(int i = 0; i < n; i++) {
				if(i == m) {
					continue;
				}
				for(it = ar1.iterator(); it.hasNext();) {
					int x = it.next();
					ar2.add(x + a[i]);
				}
				ar2.add(a[i]);
				ar1.addAll(ar2);
				ar2.clear();

			}
			for(int x = k - a[m]; x < k; x++) {
				if(ar1.contains(x)) {
					ans++;
					break;
				}
			}
			ar1.clear();
			ar2.clear();
			ar1.add(0);
		}
		System.out.println(n - ans);

	}

}