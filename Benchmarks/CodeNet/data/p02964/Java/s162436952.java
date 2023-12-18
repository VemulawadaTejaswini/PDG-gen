import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> X = new ArrayList<>();
		ArrayList<Integer> s = new ArrayList<>();

		for (int n = 0; n < N; n++) {
			X.add(sc.nextInt());
		}

		for (int k = 0; k < K-1; k++) {
			for (int n = 0; n < N; n++) {
				X.add(X.get(n));
			}
		}

		for (int i = 0; i < N * K; i++) {
			if (s.contains(X.get(i))) {
				// 末尾からsの要素を削除しつづける
				while (s.contains(X.get(i))) {
					s.remove(s.size() - 1);
				}
			} else {
				s.add(X.get(i));
			}
		}

		for(int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i));
			System.out.print(i == s.size() - 1 ? "\n" : " ");
		}
	}
}