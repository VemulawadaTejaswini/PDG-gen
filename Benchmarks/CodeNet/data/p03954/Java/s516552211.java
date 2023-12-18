import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int length = n * 2 - 1;
		int[] nums = new int[length];
		for (int i = 0; i < length; i++) {
			nums[i] = scanner.nextInt();
		}
		
		for (int i = 0;i < n - 1; i++) {
			nums = center(nums);
		}
		System.out.println(nums[0]);
	}
	
	public static int[] center(int[] nums){
		int [] nextNums = new int[nums.length - 2];
		for (int i = 0; i < nextNums.length; i++) {
			nextNums[i] = center(nums[i], nums[i + 1], nums[i + 2]);
		}
		return nextNums;
	}
	
	public static int center(int a,int b,int c){
		List<Integer> integers = Arrays.asList(a,b,c);
		integers.sort(Comparator.naturalOrder());
		return integers.get(1);
	}
}
