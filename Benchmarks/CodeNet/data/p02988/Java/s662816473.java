
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 2; i < n; i++) {
			int max = p[i-2];
			int min = p[i-2];
			max = Math.max(max, p[i-1]);
			max = Math.max(max, p[i]);
			min = Math.min(min, p[i-1]);
			min = Math.min(min, p[i]);
			if(max != p[i-1] && min != p[i-1]) {
				ans ++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
