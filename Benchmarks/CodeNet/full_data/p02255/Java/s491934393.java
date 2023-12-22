import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();

		int v;
		int j;
		printArray(nums);

		for (int i = 1; i < n; i++) {
			v = nums[i];
			j = i - 1;
			while (j >= 0 && nums[j] > v) {
				nums[j + 1] = nums[j];
				j--;
				nums[j + 1] = v;
			}
			printArray(nums);
		}
	}

	private static void printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i != array.length - 1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}