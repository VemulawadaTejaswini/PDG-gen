import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Long> a = new ArrayList<>();
		long sum = 0;
		for(int i=0;i<n;i++) {
			long ai =sc.nextLong();
			a.add(ai);
			sum += ai;
		}

		for(int i=0;i<m;i++) {
			long max_a = Collections.max(a);
			sum -= max_a;
			int max_ind = a.indexOf(max_a);
			max_a /= 2;
			sum += max_a;
			a.set(max_ind, max_a);
		}
		System.out.println(sum);

	}

}
