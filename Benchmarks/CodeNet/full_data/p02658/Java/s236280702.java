import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();

		// リストを作って格納
		List<Long> list = new ArrayList<Long>();

		// resultは10桁オーバーなのでlong型
		long result = 1;

		// resultにlistの数字を全て掛ける
		for(int i = 0; i < N; i++) {
			list.add(sc.nextLong());
			result = Math.abs(result * list.get(i));
		}

		// 10の18乗を超えるなら-1を代入
		long check = (long) Math.pow(10, 18);
		if(result > check) {
			result = -1;
		}

		// 結果の出力
		System.out.println(result);

	}
}