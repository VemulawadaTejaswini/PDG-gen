import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		solve51();
	}

	public static void solve51() {
		Scanner sc = new Scanner(System.in);
		{

			//最初の数字を読み込む
			int n = sc.nextInt();

			//n行分inputを読み込むまで繰り返す
			for (int i = 0; i < n; i++) {

				//数字が入るArrayを作る
				char[] arr = sc.next().toCharArray();

				//ソートして昇順に並べる
				Arrays.sort(arr);

				//昇順に並べた数字をIntに変換する
				int min = Integer.parseInt(new String(arr));
				//System.out.println(min);

				//降順に並べる
				int max = Integer.parseInt(new StringBuffer(new String(arr)).reverse()
						.toString());
				//System.out.println(max);

				//最大値から最小値を引く
				int result = max - min;
				System.out.println(result);

			}
		}

	}

}

