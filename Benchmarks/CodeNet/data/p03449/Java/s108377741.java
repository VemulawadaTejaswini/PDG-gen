import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] f1 = new int[n];
		int[] f2 = new int[n];
		for (int i = 0; i < n; i++) {
			f1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			f2[i] = sc.nextInt();
		}
		Arrays.parallelPrefix(f1, Integer::sum);
		Arrays.parallelPrefix(f2, Integer::sum);
		int[] nums = new int[n];
		int a = f1[0];
		a += f2[n-1];
		nums[0] = a;
		for(int i = 1; i < n; i++) {
			int profit = f1[i];
			profit += (-f2[i-1] + f2[n-1]);
			nums[i] = profit;
		}
		System.out.println(Arrays.stream(nums).max().getAsInt());
	}
}