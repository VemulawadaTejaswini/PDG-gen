import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// LinkedList型としてインスタンス化
		// LinkedList<Integer> list = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				String[] cmd = br.readLine().split(" ");
				switch (cmd[0]) {
				case "insert":
					// リストの先頭に追加
					// list.addFirst(Integer.parseInt(cmd[1]));
					list.add(0, Integer.parseInt(cmd[1]));
					break;

				case "delete":
					// parseIntの戻り値はint型である為、
					// そのまま渡すとremove(int index)が呼び出されてしまう。
					// 明示的にInteger型に変換することで、
					// remove(Object o)メソッドを呼び出す。
					// list.remove((Integer) Integer.parseInt(cmd[1]));
					list.remove((Integer) Integer.parseInt(cmd[1]));
					break;

				case "deleteFirst":
					// 先頭の要素を削除
					list.remove(0);
					break;

				case "deleteLast":
					// 末尾の要素を削除
					list.remove(list.size() - 1);
					break;
				}
			}

			for(int i=0;i<list.size();i++) {
				if(i!=list.size()-1) {
					System.out.print(list.get(i)+" ");
				}else {
					System.out.println(list.get(i));
				}
			}

			// for (Iterator<Integer> it = list.listIterator(); it.hasNext();) {
			// System.out.print(it.next());
			// if (it.hasNext()) {
			// System.out.print(" ");
			// } else {
			// System.out.println();
			// }
			//
			// }

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
