
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			list.add(a);
		}
		for(int i = 0; i < m; i++) {
			Collections.sort(list);
			Collections.reverse(list);
			long tmp = list.get(0);
			list.set(0, tmp / 2);
		}
		long ans = 0;
		for(Long e : list) {
			ans += e;
		}
		System.out.println(ans);
	}

}
