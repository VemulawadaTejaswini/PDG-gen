import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = scanner.nextInt();
		}
		Arrays.parallelSort(l);

		int count = 0;
		for (int i = 2, left, right; i < n; i++) {
			left = 0;
			right = i - 1;
			while (left < right) {
				if (l[left] + l[right] > l[i]) {
					count += right - left;
					right--;
				} else {
					left++;
				}
			}
		}
		System.out.println(count);
	}

}
