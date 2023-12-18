import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();

		ArrayList<Integer> X = new ArrayList<>();
		ArrayList<Integer> s = new ArrayList<>();

		for (int n = 0; n < N; n++) {
			X.add(sc.nextInt());
			if (X.size() > 1 && X.get(X.size() - 1) == X.get(X.size() - 2)) { // 同じ数字が隣接していれば消す
				X.remove(X.size() - 1);
				X.remove(X.size() - 1);
			}
		}
		
		// Xが空になら終了
		if(X.isEmpty()) {
			System.exit(0);
		}

		for (int i = 0; i < N * K; i++) {
			if (s.isEmpty()) { // sが空なら追加
				s.add(X.get(i % N));
			} else if (s.get(0) == X.get(i % N)) { // sの先頭が一致したら全要素削除
				s.clear();
			} else if (s.contains(X.get(i % N))) { // sが要素を含むあいだ、末尾から削除しつづける
				while (s.contains(X.get(i % N))) {
					s.remove(s.size() - 1);
				}
			} else {
				s.add(X.get(i % N));
			}
			
		}

		// 出力
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i));
			System.out.print(i == s.size() - 1 ? "\n" : " ");
		}
	}
}