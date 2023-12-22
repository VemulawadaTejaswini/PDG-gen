import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		int[] R = inpNum(t);

		int mp = maxProfit(R);
		System.out.println(mp);
		sc.close();
	}

	private static int maxProfit(int[] R) {
		int max_p = R[1] - R[0];
		int min_p = R[0];
			for(int j = 1; j < R.length; j++) {
					max_p = Math.max(max_p, R[j] - min_p);
					min_p = Math.min(min_p, R[j]);
			}
		return max_p;
	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}
}
