import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int nums[] = new int[len] ;
		for (int i = 0; i < len; i++) {
			nums[i] = scanner.nextInt();
		}
		
		for (int i = 1; i < nums.length; i++) {
			new Main().arrayToString(nums);
			int val = nums[i];
			int preIndex = i-1;
			while (preIndex>=0 && nums[preIndex] > val) {
				nums[preIndex+1] = nums[preIndex];
				nums[preIndex] = val;
				preIndex--;
			}
		}
		new Main().arrayToString(nums);
	}
	
	public void arrayToString(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			if (i == arr.length-1) {
				System.out.println(arr[i]);
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
