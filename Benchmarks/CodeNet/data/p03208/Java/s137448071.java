import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		//String s = sc.next();
		String s = "Christmas";
		int[] h = new int[n];
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			h[i] = sc.nextInt();
			sum += h[i];
		}
		Arrays.sort(h);
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < n && i + k - 1 < n; i++) {
			min = Math.min(Math.abs(h[i] - h[i + k - 1]) , min);
		}

		System.out.println(min);

	}
}

