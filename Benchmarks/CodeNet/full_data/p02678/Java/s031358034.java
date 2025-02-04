import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt() + 1;
		int m = sc.nextInt();

		boolean[][] path = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int ai = sc.nextInt();
			int bi = sc.nextInt();
			path[ai][bi] = true;
			path[bi][ai] = true;
		}

		// 残り=探索すべき部屋の集まり
		Set<Integer> rest = new HashSet<Integer>(); // ダブり無しのやつ
		for (int i = 2; i < n; i++)
			rest.add(i);

		// 探索する予定のやつ
		// queueに最後に入れる = add(), 先頭を出す = poll()
		Deque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(1); // 開始点,部屋1

		int[] before = new int[n];
		while (!queue.isEmpty()) { // 次に探索する箇所が無くなるまで
			int searchPos = queue.pollFirst(); // 先頭から取り出す．

			for (int i = 2; i < n; i++) {
				// 次の部屋への道がある，かつ，まだ探索していなかったら
				if (path[searchPos][i] && rest.contains(i)) {
					queue.addLast(i); // キューに加える
					rest.remove(i); // 未探索から削除
					before[i] = searchPos; // 前ノードを覚えさせる
				}
			}
		}

		System.out.println("Yes");
		for (int i = 2; i < n; i++)
			System.out.println(before[i]);
	}

}
