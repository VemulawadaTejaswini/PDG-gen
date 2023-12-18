import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double ans = 0;
		for (int i = 1; i <= n; i++) {
			int tmp = i;
			int cnt = 0;
			while (tmp < k) {
				tmp *= 2;
				cnt++;
			}
			ans += 1.0 / n * Math.pow(0.5, cnt);
		}
		System.out.println(ans);
	}
}