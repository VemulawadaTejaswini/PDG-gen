import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		int[] nums = new int[NUM];
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i = 0; i < NUM; i++){
			nums[i] = scan.nextInt();
			if(nums[i] > first && first == second){
				first = nums[i];
			} else if (nums[i] > first){
				first = nums[i];
			} else if (nums[i] > second){
				second = nums[i];
			}
		}

		// answer
		for(int i = 0; i < NUM; i++){
			if(nums[i] == first){
				System.out.println(second);
			} else {
				System.out.println(first);
			}
		}

	}
}
