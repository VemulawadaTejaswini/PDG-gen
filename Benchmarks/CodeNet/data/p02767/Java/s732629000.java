import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) x[i] = scan.nextInt();
		int ans = Integer.MAX_VALUE;
		for(int j = 1; j <= 100; j++) {
			int res = 0;
			for(int i = 0; i < n; i++) {
				res += (x[i]-j)*(x[i]-j);
			}
			ans = Math.min(ans, res);
		}
		System.out.println(ans);
	}

}
