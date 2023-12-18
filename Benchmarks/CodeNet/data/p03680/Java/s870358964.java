import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				// listのindexと合わせるためデクリメントした値を登録
				list.add(Integer.parseInt(sc.nextLine()) - 1);
			}

			int next = 0;
			int count = 0;
			List<Integer> checked = new ArrayList<Integer>();
			while (true) {
				next = list.get(next);
				count++;
				if (next == 1) {
					System.out.println(count);
					return;
				}
				if (checked.contains(next)) {
					// すでに押したことがあるボタンに戻ってしまった場合は到達不可
					System.out.println(-1);
					return;
				}
				checked.add(next);
			}
		} finally {
			sc.close();
		}
	}
}