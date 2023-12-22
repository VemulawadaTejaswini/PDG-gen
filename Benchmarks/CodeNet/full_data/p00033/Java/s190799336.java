import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		LinkedList<Integer> list1, list2;

		while ((line = br.readLine()) != null) {
			if (!line.contains(" ")) {
				continue;
			}
			Integer[] balls = new Integer[11];
			list1 = new LinkedList<Integer>();
			list2 = new LinkedList<Integer>();

			list1.add(0);// ダミーのボール(値比較用)
			list2.add(0);// ダミーのボール(値比較用)

			//
			for (int i = 0; i < 10; i++) {
				balls[i] = Integer.valueOf((line.split(" ")[i]));
			}

			list1.add(balls[0]);// 最初のボールは無条件で落とす
			for (int i = 1; i < 10; i++) {
				int ball = balls[i];
				if (ball < list1.getLast() && ball < list2.getLast()) {
					// 落とせる筒がない
					System.out.println("NO");
					break;
				} else if (ball > list1.getLast() && ball > list2.getLast()) {
					// 値の差が小さい方に落とす
					if (ball - list1.getLast() < ball - list2.getLast()) {
						list1.add(ball);
					} else {
						list2.add(ball);
					}
				} else {
					// 落とせる方に落とす
					if (ball > list1.getLast()) {
						list1.add(ball);
					} else if (ball > list2.getLast()) {
						list2.add(ball);
					}
				}
				// 全てのボールを落とせたら
				if (i == 9) {
					System.out.println("YES");
				}
			}
		}
	}
}