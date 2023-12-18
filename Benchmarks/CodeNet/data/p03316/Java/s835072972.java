import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String num = String.valueOf(n);
		String[] nums = num.split("");
		long sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum += Long.parseLong(nums[i]);
		}
		if(n%sum == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
