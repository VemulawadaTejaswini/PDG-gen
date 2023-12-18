import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		long constNum = 1000000007;
		int str = sc.nextInt();
		long x;
		long nums[] = new long[300000];
		long sum = 0;
		for (int i = 0; i < str; i++) {
			nums[i] = sc.nextLong();
		}

		for (int i = 0; i < str - 1; i++) {
			for (int j = i + 1; j < str; j++) {
				x = nums[i] ^ nums[j];
				sum += x;
			}
		}
		System.out.println(sum % constNum);
	}
}