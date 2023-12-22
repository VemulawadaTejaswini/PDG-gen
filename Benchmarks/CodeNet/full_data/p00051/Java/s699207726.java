import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < n; i++) {
				String strNum = sc.nextLine();
				System.out.println( min_max_diff(strNum) );
			}

	}

	private static int min_max_diff(String strNum) {
		Integer[] nums = new Integer[strNum.length()];

			for (int i = 0; i < strNum.length(); i++) {
				nums[i] = Integer.parseInt(String.valueOf(strNum.charAt(i)));
			}

		Arrays.sort(nums, Comparator.naturalOrder());
		int biggest = toInt(nums);

		Arrays.sort(nums, Comparator.reverseOrder());
		int smallest = toInt(nums);

		return biggest - smallest;
	}

	private static int toInt(Integer[] nums) {
		int sum = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			sum += (int)Math.pow(10, i) * nums[i];
		}


		return sum;
	}

}
