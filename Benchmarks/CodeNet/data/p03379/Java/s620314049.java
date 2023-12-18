import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] originArr = new int[n];
		int[] result = new int[n - 1];

		for (int i = 0; i < n; i++) {
			originArr[i] = s.nextInt();
		}

		for (int j = 0; j < n; j++) {
			int l = 0;
			for (int k = 0; k < n - 1; k++) {
				while (k != l) {
					result[k] = originArr[l];
					Arrays.sort(result);
					System.out.println(result[n / 2 - 1]);
				}
				l++;
			}
		}
	}
}
