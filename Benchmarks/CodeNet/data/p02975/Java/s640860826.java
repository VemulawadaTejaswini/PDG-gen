import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] input = new int[n];
		int[] nums = new int[n + 2];
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			input[i] = m;
			nums[i+1] = m;
		}
		
		nums[0] = input[n-1];
		nums[n+2-1] = input[0];
		String res = "Yes";
		for (int i = 1; i <= n; i++) {
			if (nums[i] != (nums[i-1] ^ nums[i+1])) {
				res = "No";
				break;
			}
		}
		System.out.println(res);
		sc.close();
	}

}
