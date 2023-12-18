import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();

		Map<Integer, String> map = new HashMap<>();
		//整数A(i,j)をマッピング
		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= h; j++) {
				map.put(sc.nextInt(), i + "," + j);
			}
		}

		int q = sc.nextInt();
		//実技試験開始
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			int ans = 0;

			while (l != r) {
				String str1 = map.get(l);
				int befX = Integer.valueOf(str1.substring(0, str1.indexOf(",")));
				int befY = Integer.valueOf(str1.substring(str1.indexOf(",") + 1));

				String str2 = map.get(l + d);
				int aftX = Integer.valueOf(str2.substring(0, str2.indexOf(",")));
				int aftY = Integer.valueOf(str2.substring(str2.indexOf(",") + 1));

				ans += Math.abs(aftX - befX) + Math.abs(aftY - befY);
				l += d;
			}

			System.out.println(ans);

		}
	}

}
