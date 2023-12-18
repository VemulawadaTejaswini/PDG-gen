import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] sum = new int[n];
		if (s.charAt(0) == '#') {
			sum[0] = 1;
		}
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == '#') {
				sum[i] = sum[i - 1] + 1;
			} else {
				sum[i] = sum[i - 1];
			}
		}
		int min = n - sum[n - 1];
		for (int i = 0; i < n; i++) {
			min = Math.min(sum[i] + (n - i - 1) - (sum[n - 1] - sum[i]), min);
		}
		System.out.println(min);
	}
}