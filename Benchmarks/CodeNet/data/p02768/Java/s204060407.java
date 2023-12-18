
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		long sum = 0;
		long sum1 = 1;
		long sum2 = 1;
		for (int i = 1; i <= n; i++) {
			if (i == a || i == b) {
				sum1 = sum1 * (n + 1 - i) % 1000000007;
				sum2 = sum2 * i % 1000000007;
				continue;
			}
			sum1 = sum1 * (n + 1 - i) % 1000000007;
			sum2 = sum2 * i % 1000000007;
			sum = (sum1 / sum2) % 1000000007;
		}
		System.out.println(sum % 1000000007);
	}
}
