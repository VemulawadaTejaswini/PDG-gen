
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		long[] ans = new long[n];
		for(int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			list.add(tmp);
			ans[i] = tmp;
		}
		Collections.sort(list);
		for(int i = 0; i < n; i++) {
			if(list.indexOf(ans[i]) < n / 2) {
				System.out.println(list.get(n / 2));
			} else {
				System.out.println(list.get(n / 2 - 1));
			}
		}
	}

}
