import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		for (int i = 0; i <= n / r; i++) {
			for (int j = 0; j <= n / g; j++) {
				for (int k = 0; k <= n / b; k++) {
					sum = r * i + g * j + b * k;
					if (sum == n) {
						++count;
						break;
					} else if (sum > n) {
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
	/*
	public static int p(int num, int end, int result) {
		if (num < end) {
			return result;
		} else {
			return p(num - 1, end, result * num);
		}
	}
	
	public static int c(int num, int end, int result, int result2) {
		if (num < end) {
			return result;
		} else {
			return p(num - 1, end, result * num) / p(end, 1, result2);
		}
	}
	 */
}
