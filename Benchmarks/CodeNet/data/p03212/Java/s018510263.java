import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int N = sc.nextInt();                

		// 答えを出力
		
		int ans = 0;
		for (int i = 357; i < N; i++) {
			int x = i;
			int len = String.valueOf(x).length();
			int[] h = new int[len];

			boolean seven = false;
			boolean five = false;
			boolean three = false;
			boolean other = false;

			for (int j = 0; j < len; j++) {
				h[j] = x % 10;
				if (h[j] == 7) {
					seven = true;
				} else if (h[j] == 5) {
					five = true;
				} else if (h[j] == 3) {
					three = true;
				} else {
					other = true;
					break;
				}
				x = x / 10;
			}
			if (seven && five && three && !other) {
				ans += 1;
			}
		}		
		System.out.println(ans);
	}
}
