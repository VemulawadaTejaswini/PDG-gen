import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String N = sc.next();
		sc.close();
		int nums[] = new int[String.valueOf(N).length()];
		if(nums.length == 1) {
			System.out.println(N);
			return;
		}
		
		for(int i=0; i<nums.length; i++) nums[i] = Integer.parseInt(""+N.charAt(i));
		
		for(int i=nums.length-1; i>0; i--) {
			if(nums[i] != 9) {
				nums[i] = 9;
				for(int j=i-1; j>=0; j--) {
					if(nums[j] != 0) {
						nums[j]--;
						break;
					}
					else {
						nums[j] = 9;
					}
				}
			}
		}
		
		int sum = 0;
		for(int i=0; i<nums.length; i++) sum += nums[i];
		
		System.out.println(sum);
	}
}