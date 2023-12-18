
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
		while(m > 0) {
			Collections.sort(list);
			Collections.reverse(list);
			long tmp = list.get(0);
			tmp = tmp >> 1;
			for(int i = 0; i < list.size(); i++) {
				long val = list.get(i);
				if(val >= tmp && m > 0) {
					val = val >> 1;
					list.set(i, val);
					m--;
				}
			}
		}
		long ans = 0;
		for(Long e : list) {
			ans += e;
		}
		System.out.println(ans);
	}

}
