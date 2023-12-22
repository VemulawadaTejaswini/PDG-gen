import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int arrayIndex = 0; arrayIndex < n; arrayIndex++) {
			nums[arrayIndex] = sc.nextInt();
		}
		printArray(nums);
		for(int i = 1; i <= n - 1; i++) {
			int v = nums[i];
			int j = i - 1;
			while(j >= 0 && nums[j] > v) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = v;
			printArray(nums);
		}
	}
	public static void printArray(int[] array) {
		int arrayLength = array.length;
		for(int index = 0; index < arrayLength - 1; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println(array[arrayLength - 1]);
	}
}