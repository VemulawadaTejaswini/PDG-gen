import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[] l = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			l[i] = stdIn.nextInt();
		}
		Arrays.sort(l);

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (l[i] != l[j] && l[j] != l[k]) {
						if (l[k] < l[i] + l[j])
							count++;
					}
				}
			}
		}

		System.out.println(count);

		stdIn.close();
	}
}
