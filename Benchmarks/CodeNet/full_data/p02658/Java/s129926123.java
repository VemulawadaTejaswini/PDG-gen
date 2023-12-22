import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		// リストを作って格納
		List<Integer> list = new ArrayList<Integer>();
		while(sc.hasNext()) {
			list.add(sc.nextInt());
		}

		// resultは10桁オーバーなのでlong型
		long result = 1;

		// resultにlistの数字を全て掛ける
		for(Integer i: list) {
			result *= i;
		}

		// 10の18乗を超えるなら-1を代入
		long checks = (long) Math.pow(10, 18);
		if(result > checks) {
			result = -1;
		}

		// 結果の出力
		System.out.println(result);

	}
}
