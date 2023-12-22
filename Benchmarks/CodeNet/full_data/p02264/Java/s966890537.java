import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * ZAKIREN第5章
 *
 * @author K.Yamauchi
 *
 */
public class Main {

	/** 入力用 */
	private static Scanner scan = new Scanner(System.in);

	/** 出力用 */
	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 * メイン。
	 * @param args
	 */
	public static void main(String[] args) {

		// １行目の読み込み
		String[] firstLine = scan.nextLine().split(" ");
		int size = Integer.parseInt(firstLine[0]);

		// 2行目以降（プロセスとクオンタム）の読み込み
		String[] processes = new String[size];
		for (int i = 0; i < size; i++) {
			processes[i] = scan.nextLine();
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算を実行
		calculation(size, Integer.parseInt(firstLine[1]), processes);

		// 結果出力
//		System.out.println(stringBuilder.toString());

	}

	/**
	 *
	 * @param size
	 * @param quantum
	 * @param processes
	 */
	private static void calculation(int size, int quantum, String[] processes) {

		// 計算用キュー
		Queue<String> queue = new ArrayDeque<>();

		// キューにプロセスを設定
		for (int i = 0; i < size; i++) {
			queue.add(processes[i]);
		}

		// 経過時間
		int elapsedTime = 0;

		// キューの中身がなくなるまで計算
		while (!queue.isEmpty()) {
			// キューからプロセスを一つ取得
			String[] process = queue.poll().split(" ");
			// 取得したプロセスの残り時間
			int remainedTime = Integer.parseInt(process[1]);

			if (remainedTime <= quantum) {
				// プロセスの残り時間がクオンタム以下であれば、そのプロセスは終了
				stringBuilder.append(process[0] + " " + (elapsedTime + remainedTime) + "\n");
				System.out.println(process[0] + " " + (elapsedTime + remainedTime));
				elapsedTime -= (quantum - remainedTime);
			} else {
				// プロセスの残り時間がクオンタムより大きければ、クオンタム分残り時間を減らし、再度キューに登録
				remainedTime -= quantum;
				queue.add(process[0] + " " + remainedTime);
			}
			elapsedTime += quantum;
		}

	}

}

