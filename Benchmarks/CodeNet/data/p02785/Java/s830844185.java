
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		long ans = 0;
		for(int i = 0; i < n - k; i++) {
			ans += list.get(i);
		}
		System.out.println(ans);
	}

}
