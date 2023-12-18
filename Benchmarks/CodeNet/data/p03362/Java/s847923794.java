import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		List<Integer> list = new ArrayList<>();
		list.add(2);
		for (int k = 3 ; k < 55555 ; k++) {
			for (int i = 2; i < Math.floor(Math.sqrt(55555)) ; i++) {
				if (k % i == 0 && k % 5 != 1) {
					continue;
				}
			}
			list.add(k);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n ; i++) {
			if (i != n-1) {
				sb.append(list.get(i)).append(" ");
			} else {
				sb.append(list.get(i));
			}
		}
		System.out.println(sb.toString());
	}
}
