
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int sum1 = 0;
			for (int j = 0; j <= i; j++) {
				sum1 += a[j];
			}
			
			int sum2 = 0;
			for (int j = i + 1; j < n; j++) {
				sum2 += a[j];
			}
			if (sum2 == 0) {
				break;
			}
			int t = Math.abs(sum1 - sum2);
			ans = Math.min(ans, t);
		}
		System.out.println(ans);
	}
}
