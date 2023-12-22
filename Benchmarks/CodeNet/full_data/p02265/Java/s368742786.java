import java.util.LinkedList;
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
//	private static StringBuilder stringBuilder = new StringBuilder();

	/**
	 * メイン。
	 * @param args
	 */
	public static void main(String[] args) {

		// １行目の読み込み
		int commandNum = Integer.parseInt(scan.next());

		// 2行目以降（プロセスとクオンタム）の読み込み
		String[] commands = new String[commandNum];
		int i = 0;
		while (i < commandNum) {
			commands[i] = scan.next();

			if (commands[i].equals("insert") || commands[i].equals("delete")) {
				commands[i++] += " " + scan.next();
			} else {
				i++;
			}
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算を実行
		LinkedList<Integer> list = execution(commandNum, commands);

		// 結果出力
		for (int j = 0, size = list.size(); j < size; j++) {
//			stringBuilder.append(list.poll());
//			if (j < size - 1) {
//				stringBuilder.append(" ");
//			}
			System.out.print(list.poll() + j < (size - 1) ? " " : "\n");
		}
//		stringBuilder.append("\n");
//		System.out.println(stringBuilder.toString());

	}

	/**
	 *
	 * @param commandNum
	 * @param commands
	 */
	private static LinkedList<Integer> execution(int commandNum, String[] commands) {

		// 計算用リスト
		LinkedList<Integer> linkedList = new LinkedList<>();

		// キューの中身がなくなるまで計算
		for (int i = 0; i < commandNum; i++) {
			// コマンドを一つ取得
			String[] command = commands[i].split(" ");

			// コマンドごとの処理を実行
			if (command[0].equals("insert")) {
				linkedList.push(Integer.parseInt(command[1]));
			} else if (command[0].equals("delete")) {
				int index = linkedList.indexOf(Integer.parseInt(command[1]));
				if (index >= 0) {
					linkedList.remove(index);
				}
			} else if (command[0].equals("deleteFirst")) {
				linkedList.removeFirst();
			} else if (command[0].equals("deleteLast")) {
				linkedList.removeLast();
			}
		}

		return linkedList;

	}

}

