import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {

		// LinkedList型としてインスタンス化
		LinkedList<Integer> list = new LinkedList<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				String[] cmd = br.readLine().split(" ");
				switch (cmd[0]) {
				case "insert":
					// リストの先頭に追加
					list.addFirst(Integer.parseInt(cmd[1]));
					break;

				case "delete":
					// parseIntの戻り値はint型である為、
					// そのまま渡すとremove(int index)が呼び出されてしまう。
					// 明示的にInteger型に変換することで、
					// remove(Object o)メソッドを呼び出す。
					list.remove((Integer)Integer.parseInt(cmd[1]));
					break;

				case "deleteFirst":
					// 先頭の要素を削除
					list.removeFirst();
					break;

				case "deleteLas":
					// 末尾の要素を削除
					list.removeLast();
					break;
				}
			}

			System.out.println(list.getFirst());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
