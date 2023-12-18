
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = -1;
		for (int i = 1; i * i <= m; i++) {
			if(i <= m / n && m % i == 0) {
				ans = Math.max(ans, i);
			}
		}
		
		System.out.println(ans);
	}
}
