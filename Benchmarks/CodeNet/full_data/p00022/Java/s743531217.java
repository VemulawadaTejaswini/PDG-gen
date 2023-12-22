import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 0;

		do {
			n = sc.nextInt();
				if (n == 0) {
					break;
				} else {
					System.out.println( maximumSum(n) );
				}
		}while(true);

	}

	private static int maximumSum(int n) {
		int[] nums = new int[n];
		int max = Integer.MIN_VALUE;
		int sum = 0;

			for (int i = 0; i < n; i++ ) {
				nums[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++ ) {
				sum = 0;
					for (int j = i ; j < n; j++ ) {
						 sum += nums[j];
					 	 max = Math.max(max, sum);
					}

			}

		return max;
	}

}
