import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int[] nums = new int[w];
		for(int i = 0; i < w; i++){
			nums[i] = i+1;	
		}
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String input = sc.next();
			String[] resultInput = input.split(",");
			int a = Integer.parseInt(resultInput[0]);
			int b = Integer.parseInt(resultInput[1]);
			nums = swap(nums, a, b);
		}
		for(int i = 0; i < w; i++){
			System.out.println(nums[i]);
		}
	}

	public static int[] swap(int[] nums, int a, int b){
		a -= 1;
		b -= 1;
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
		return nums;
	}
}