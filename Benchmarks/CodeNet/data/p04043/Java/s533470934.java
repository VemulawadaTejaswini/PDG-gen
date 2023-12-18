import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * コンソールテスト用Main クラス
 *
 * @author RisaTozawa
 */
public class Main {

	/* コンストラクタ */
	Main() {
	//何もしない
	}

	/**
	 * Atcorder 提出
	 * @return
	 *
	 */

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		/* コンソールから、数値を受け取る */
		List<Integer> list = new ArrayList<>();
		for (int i = 0; sc.hasNext(); i++) {
			list.add(sc.nextInt());
		}

		int n5 = 0;
		int n7 = 0;

		/* 入力された数値のカウント */
		for (int n : list)  {
			if (n == 5) {
				n5++;
			}
			if (n == 7) {
				n7++;
			}
		}

		/* 入力された数値が 5・7・7に並び替えられるかを判定 */
		System.out.println(n5 == 2 && n7 == 1 ? "YES" : "NO");

	}

}
