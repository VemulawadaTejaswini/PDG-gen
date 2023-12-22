import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] A = inpNum(n);

		Arrays.sort(A);
		third_p(A);

	}

	private static void third_p(int[] a) {
		int limit = Math.min(a.length, 4);
		List<Integer> conv_num = new ArrayList<Integer>();

		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < limit; j++) {
				if (i == j) {
					continue;
				}

				conv_num.add(a[i] * (int)Math.pow(10, Integer.toString(a[j]).length()) + a[j]);
			}
		}
		Collections.sort(conv_num);
		System.out.println(conv_num.get(2));

	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}

}

