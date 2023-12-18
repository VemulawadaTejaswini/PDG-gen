import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long b = x;		//下からN層
		long ans = 0;		//答え
		for (int i = n; i >= 0; i--) {
			long h = height(i);		//総枚数
			long mid = (h + 1) / 2;		//真ん中
			if (b == mid) {		//真ん中にぶち当たったら、とりあえず、N-1のサイズのバーガーの肉全部と一番真ん中の肉を食べられる
				ans += patties(i - 1);
				ans++;
				break;
			} else if (b == 1) {		//一番下ならパンしか食って無いので自明に0枚
				break;
			} else if (b == h) {		//上から下までまるまる食べているのならNのパティの数を加算する
				ans += patties(i);
				break;
			} else if (b < mid) {		//中央値よりも小さい時
				b--;
			} else {			//中央値よりも大きかったら、その中央値を下限としてまた計算し直す
				ans += patties(i - 1);
				ans++;
				b -= mid;
			}
		}
		System.out.println(ans);
	}
	public static long height(int n) {
		return (1L << (n + 2)) - 3;
	}
	public static long patties(int n) {
		if (n < 0) {
			return 0;
		}
		return (1L << (n + 1)) - 1;
	}
}