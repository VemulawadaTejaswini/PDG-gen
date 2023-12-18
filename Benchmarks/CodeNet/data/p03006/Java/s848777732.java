import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for ( int i = 0; i < n; i++ ) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		HashMap<String, Integer> vectorCnt = new HashMap<>();
		String vec = "";
		int maxV = 0;
		// 総当たりで2点間のベクトルを見ていく
		for ( int targ = 0; targ < n; targ++ ) {

			for ( int next = 0; next < n; next++ ) {

				int tempX = x[next] - x[targ];
				int tempY = y[next] - y[targ];
				vec = String.valueOf(tempX) + "_" + String.valueOf(tempY);

				if ( tempX == 0 && tempY == 0 ) {
					// 0移動はカウントしない
				} else {
					// ベクトルがマップにあったら個数を加算
					if ( vectorCnt.containsKey(vec) ) {
						//System.out.println(vec);
						vectorCnt.put(vec, vectorCnt.get(vec) + 1);
					} else
					// 無かったら登録して個数は１
					{
						vectorCnt.put(vec, 1);
					}
				}
			}
			//vectorCnt.clear();
		}

		// 同種ベクトルの個数の最大値を取得
		for ( Integer val : vectorCnt.values() ) {
			//System.out.println(val);
			if ( maxV < val ) maxV = val;
		}

		//System.out.println(maxV);
		System.out.println(n - maxV);
		in.close();
	}
}
