import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				list.add(a);
			}
			Collections.sort(list);
			Collections.reverse(list);
			BigDecimal result = BigDecimal.ZERO;
			for (int i = 0; i < k; i++) {
				result = result.add(BigDecimal.valueOf(list.get(i) + 1).divide(BigDecimal.valueOf(2)));
			}
			System.out.println(result);
		}
	}

}
