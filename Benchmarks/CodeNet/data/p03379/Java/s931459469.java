import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int[] nums = new int[NUM];
		for(int i = 0; i < NUM; i++){
			nums[i] = scan.nextInt();
		}
		
		// copy&sort
		int[] numsCopy = nums.clone();
		Arrays.sort(numsCopy);
		int median1 = numsCopy[NUM / 2 - 1];
		int median2 = numsCopy[NUM / 2];
		
		// answer
		for(int i = 0; i < NUM; i++){
			if(nums[i] == median1){
				System.out.println(median2);
			} else if (nums[i] == median2){
				System.out.println(median1);
			} else if(nums[i] < median1) {
				System.out.println(median2);
			} else{
				System.out.println(median1);
			}
		}

	}
}