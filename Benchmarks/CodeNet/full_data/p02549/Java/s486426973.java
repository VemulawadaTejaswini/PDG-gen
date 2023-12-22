import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int k = sc.nextInt();

		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < k; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			for (int j=l; j<=r; j++){
				set.add(j);
			}
		}
		long[] ptn = new long[n + 1];

		Integer[] kukan = set.toArray((new Integer[0]));
		ptn[1] = 1;

		for (int i=1; i<n; i++){

			if (ptn[i] == 0) {
				continue;
			}

			for (int j= 0; j < kukan.length; j++){
				if (i + kukan[j] <= n){
					ptn[i + kukan[j]] += ptn[i];
					ptn[i + kukan[j]] %= 998244353;
				}
			}
		}
		System.out.println(ptn[n]);
	}

}