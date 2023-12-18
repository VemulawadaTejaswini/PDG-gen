import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		if(k == n) {
			System.out.println(1);
		}else {
			if(k-1 < n-k) {
				int count = 1;
				while(k<n) {
					k += k-1;
					count++;
				}
				System.out.println(count+1);
			}else {
				System.out.println(2);
			}
		}
	}
}
