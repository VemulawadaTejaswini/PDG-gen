import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] h = new int[n];
		Arrays.setAll(h, i -> sc.nextInt());
		Arrays.sort(h);
		
		int minH = Integer.MAX_VALUE;
		for (int i = 0; i < n - k + 1; i++) {
			int dif = h[i + k - 1] - h[i];
			minH = Math.min(minH, dif);
		}
		
		System.out.println(minH);
		
	}
	
}
