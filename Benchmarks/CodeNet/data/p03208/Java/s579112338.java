import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i  = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n-k+1; i++) {
			int temp = h[k-1+i]-h[i];
			ans = Math.min(temp, ans);
		}
		System.out.println(ans);
	}
}