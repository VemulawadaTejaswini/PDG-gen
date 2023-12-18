
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		int min = Integer.MAX_VALUE;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum2 += a[i];
			min = Math.min(min, Math.abs(2 * sum2 - sum));
		}
		
		System.out.println(min);
		
		
	}
}
