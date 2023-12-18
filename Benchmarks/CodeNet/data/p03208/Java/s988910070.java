import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		
		int ans = 1000000000;
		for(int i = 0; i <= n-k; i++) {
			ans = Math.min(ans, h[i+k-1]-h[i]);
		}
		System.out.println(ans);
	}
}
