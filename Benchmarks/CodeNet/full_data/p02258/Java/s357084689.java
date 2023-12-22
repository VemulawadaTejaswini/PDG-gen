import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		int[] pr = inpNum(t);

		int mp = maxProfit(pr);
		System.out.println(mp);
		sc.close();
	}

	private static int maxProfit(int[] pr) {
		int max_p = 0;

		for(int i = 0; i < pr.length - 1; i++) {
			for(int j = i + 1; j < pr.length; j++) {

				max_p = Math.max(max_p, pr[i] - pr[j]);

			}
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
