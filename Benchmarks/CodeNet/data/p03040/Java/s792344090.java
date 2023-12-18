import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		List<Integer> a = new ArrayList<>();
		long b = 0;
		for (int i = 0; i < q; i++) {
			int type = scanner.nextInt();
			if (type == 1) {
				a.add(scanner.nextInt());
				b = b + scanner.nextInt();
				// |x - a| + b
			} else {
				Collections.sort(a);
				long previous = Integer.MAX_VALUE;
				for (int j = a.get(0); j <= a.get(a.size() - 1); j++) {
					long sum = b;
					for (int k = 0; k < a.size(); k++) {
						sum = sum + Math.abs(j - a.get(k));
					}
					if (j < a.get(a.size() - 1) && sum < previous) {
						previous = sum;
					} else {
						if (sum == previous) {
							System.out.println((j - 1) + " " + sum);
						} else {
							System.out.println(j + " " + sum);
						}
						break;
					}
				}
			}
		}
	}
}
