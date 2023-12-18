import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int n = sc.nextInt();
		int num = 0;
		
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			max = Math.max(num, max);
			min = Math.min(num, min);
			sum += num;
		}
		
		long check = n * (n + 1) /2;
		if (sum % check != 0) {
			System.out.println("NO");
			return;
		}
		
		if (max/min > n) {
			System.out.println("NO");
			return;
		}
		
		System.out.println("YES");
	}
}
