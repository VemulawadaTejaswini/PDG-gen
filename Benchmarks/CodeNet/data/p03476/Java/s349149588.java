import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];

		int max = 0;
		for(int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();

			max = Math.max(max, l[i]);
			max = Math.max(max, r[i]);
		}

		// (max+1)/2までの素数を列挙
		int cnt = max;
		ArrayList<Integer> pnums = new ArrayList<Integer>();
		pnums.add(2);
		pnums.add(3);
		for(int i = 5; i <= cnt; i++) {
			if(i % 2 == 0)
				continue;

			int j;
			for(j = 0; j < pnums.size(); j++) {
				if(i % pnums.get(j) == 0)
					break;
			}
			if(j != pnums.size())
				continue;

			pnums.add(i);
		}

		for(int i = 0; i < q; i++) {
			int ans = 0;
			for(int j = l[i]; j <= r[i]; j++) {
				if( (Collections.binarySearch(pnums, j) > -1) && (Collections.binarySearch(pnums, (j+1)/2 ) > -1)) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}