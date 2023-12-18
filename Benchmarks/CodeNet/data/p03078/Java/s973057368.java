import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[3];
		int max = 0;
		for (int i = 0; i < 3; ++i) {
			x[i] = sc.nextInt();
			max = Math.max(max, x[i]);
		}
		int k = sc.nextInt();
		List<Long> a[] = new List[3];
		for (int i = 0; i < 3; ++i)
			a[i] = new ArrayList<Long>();
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < x[i]; ++j)
				a[i].add(sc.nextLong());
		}
		sc.close();
		List<Long> ans = new ArrayList<Long>();
		long an = 0;
		for (int i = 0; i < x[0]; ++i) {
			an = a[0].get(i);
			for (int j = 0; j < x[1]; ++j) {
				long tmp = an + a[1].get(j);
				for (int m = 0; m < x[2]; ++m) {
					long tmp2 = tmp + a[2].get(m);
					ans.add(tmp2);
				}
			}
		}
		Collections.sort(ans);
		int n = ans.size();
		for (int i = 0; i < k; ++i)
			System.out.println(ans.get(n - i - 1));
	}

}
