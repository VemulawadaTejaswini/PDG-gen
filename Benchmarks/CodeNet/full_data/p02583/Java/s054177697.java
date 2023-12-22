import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();
		Integer[] l = new Integer[n];

		for (Integer i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		Arrays.sort(l);

		Integer count = 0;

		for (Integer i = 0; i < n - 2; i++) {
			for (Integer j = i + 1; j < n - 1; j++) {
				for (Integer k = j + 1; k < n; k++) {
					if (l[i] == l[j] || l[j] == l[k] || l[k] == l[i]) {
						continue;
					}
					if (l[k] < l[i] + l[j]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}