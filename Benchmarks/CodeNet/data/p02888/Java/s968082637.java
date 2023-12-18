
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					for (int l = k + 1; l < n; l++) {
						if (arr[j] + arr[k] > arr[l])
							sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
