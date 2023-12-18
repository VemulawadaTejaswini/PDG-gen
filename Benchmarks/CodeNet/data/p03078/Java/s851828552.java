import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		List<Long> alist = new ArrayList<>();
		List<Long> blist = new ArrayList<>();
		List<Long> clist = new ArrayList<>();

		for (int i = 0; i < x; i++) {
			long a = sc.nextLong();
			alist.add(a);
		}
		for (int i = 0; i < y; i++) {
			long b = sc.nextLong();
			blist.add(b);
		}
		for (int i = 0; i < z; i++) {
			long c = sc.nextLong();
			clist.add(c);
		}
		Collections.sort(alist);
		Collections.sort(blist);
		Collections.sort(clist);
		Collections.reverse(alist);
		Collections.reverse(blist);
		Collections.reverse(clist);
		List<Long> result = new ArrayList<>();

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int m = 0; m < z; m++) {
					long a =alist.get(i);
					long b =blist.get(j);
					long c =clist.get(m);
					result.add(a+b+c);
				}
			}
		}
		Collections.sort(result);
		Collections.reverse(result);
		for (int i = 0; i < k; i++) {
			long r =result.get(i);
			System.out.println(r);
		}

	}
}
