

import java.util.Scanner;

public class  Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int firstSize = in.nextInt();
		int[] first = new int[firstSize];
		for (int i = 0; i < firstSize; i++) {
			first[i] = in.nextInt();
		}

		int secondSize = in.nextInt();
		int count = 0;
		for (int i = 0; i < secondSize; i++) {
			count += contains(in.nextInt(), first, 0, firstSize - 1);
		}
		System.out.println(count);
	}

	/**
	 * returns 1 if the given element is in the given list between the given indices
	 * and zero otherwise
	 */
	public static int contains(int ele, int[] nums, int low, int high) {

		int mid = low + (high-low)/2;
		if (low > high) {
			return 0;
		} else if (nums[mid] == ele) {
			return 1;
		} else if (nums[mid] < ele) {
			return contains(ele, nums, mid + 1, high);
		} else {
			return contains(ele, nums, low, mid - 1);
		}

	}

}
