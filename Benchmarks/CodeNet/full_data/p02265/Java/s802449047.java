import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
		int commandNum = Integer.parseInt(scan.nextLine());

		// 2行目以降（プロセスとクオンタム）の読み込み
		String[] commands = new String[commandNum];
		for (int i = 0; i < commandNum; i++) {
			commands[i] = scan.nextLine();
		}

		// 読み込み終了
		scan.close();
		scan = null;

		// 計算を実行
		LinkedList<Integer> list = execution(commandNum, commands);

		// 結果出力
		for (int i = 0, size = list.size(); i < size; i++) {
			System.out.print(list.poll() + (i < size - 1 ? " " : "\n"));
		}

	}

	/**
	 *
	 * @param commandNum
	 * @param commands
	 */
	private static LinkedList<Integer> execution(int commandNum, String[] commands) {

		// 計算用リスト
		List<Integer> list = new ArrayList<>();

		LinkedList<Integer> linkedList = new LinkedList<>();

		// キューの中身がなくなるまで計算
		for (int i = 0; i < commandNum; i++) {
			// コマンドを一つ取得
			String[] command = commands[i].split(" ");

			// コマンドごとの処理を実行
			if (command[0].equals("insert")) {
				list.add(Integer.parseInt(command[1]));
				linkedList.push(Integer.parseInt(command[1]));
			} else if (command[0].equals("delete")) {
				list.remove(list.indexOf(Integer.parseInt(command[1])));
				linkedList.remove(linkedList.indexOf(Integer.parseInt(command[1])));
			} else if (command[0].equals("deleteFirst")) {
				list.remove(0);
				linkedList.removeFirst();
			} else if (command[0].equals("deleteLast")) {
				list.remove(list.size() - 1);
				linkedList.removeLast();
			}
		}

		return linkedList;

	}

}

