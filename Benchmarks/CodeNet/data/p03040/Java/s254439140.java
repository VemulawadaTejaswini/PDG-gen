import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		long bsum = 0;
		for (int i = 0; i < q; i++) {
			int query = sc.nextInt();
			if (query == 1) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				list.add(a);
				bsum += b;
			} else {
				Collections.sort(list);
				int med = list.get(list.size() / 2);
				long sum = bsum;
				for (int j = 0; j < list.size(); j++) {
					sum += Math.abs(list.get(j) - med);
				}
				System.out.println(med + " " + sum);
			}
		}

	}
}
