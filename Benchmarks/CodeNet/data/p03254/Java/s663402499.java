import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		
		int[] nums = new int [N];
		int sum = 0;
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		Arrays.sort(nums);
		
		if (x>sum) {
			System.out.println(N - 1);
		} else if (x == sum ) {
			System.out.println(N);
		} else {
			int cnt = 0;
			for(int i=0; i<N; i++) {
				if(nums[i]<=x) {
					x -= nums[i];
					cnt++;
				}else {
					System.out.println(0);
				}
			}
			System.out.println(cnt);
		}
		
	}
	
}
