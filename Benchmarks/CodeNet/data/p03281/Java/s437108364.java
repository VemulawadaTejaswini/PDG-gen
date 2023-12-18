import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();                
		
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				continue;
			}
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
				if (count > 8) {
					break;
				}
			}
			if (count == 8) {
				ans++;
			}
		}
		System.out.println(ans);			
	}	
}
