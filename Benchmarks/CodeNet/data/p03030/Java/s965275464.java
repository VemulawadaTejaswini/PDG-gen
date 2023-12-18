import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		String[] city = new String[n];
		int[] point = new int[n];
		int[] result = new int[n];

		Arrays.fill(result, 1);

		for (int i = 0; i < n; i++) {
			city[i] = sc.next();
			point[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (city[i].compareTo(city[j]) < 0) {
					result[j]++;
				}else if(city[i].compareTo(city[j]) == 0) {
					if(point[i] > point[j]) {
						result[j]++;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}