
import java.util.Scanner;

public class Main {
	public static boolean bunarySearch(int key, int n, int[] A) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = (left + right) / 2;
			if (A[mid] == key) {
				return true;
			} else if (A[mid] < key) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int num1 = scanner.nextInt();
		int[] suretu1 = new int[num1 + 1];
		for (int i = 0; i < num1; i++) {
			suretu1[i] = scanner.nextInt();
		}
		int num2 = scanner.nextInt();
		int[] suretu2 = new int[num2];
		for (int i = 0; i < num2; i++) {
			suretu2[i] = scanner.nextInt();
		}
		for (int i = 0; i < num2; i++) {
			int key = suretu2[i];
			if (bunarySearch(key, num1, suretu1)) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}

