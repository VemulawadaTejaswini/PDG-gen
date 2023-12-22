import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int length = sc.nextInt();
			int[] nums = new int[length];
			for(int i = 0; i < length; i++) {
				nums[i] = i + 1;
			}
			permutation(nums, "");
		}
	}
	public static void permutation(int[] nums, String usedNums) {
		if(nums.length == 1) {
			System.out.println(usedNums + nums[0]);
		}
		else {
			for(int i = 0; i < nums.length; i++) {
				int[] pNums = new int[nums.length - 1];
				System.arraycopy(nums, 0, pNums, 0, i);
				System.arraycopy(nums, i + 1, pNums, i, nums.length - i - 1);
				permutation(pNums, usedNums + nums[i] + " ");
			}
		}
	}
}
