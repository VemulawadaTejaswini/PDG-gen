import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int N = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int answer1 = 0;
		int answer2 = 0;
		int k = 1;
		int m = 1;

		int i = 0;
		while (i < N) {
			int p = scanner.nextInt();
			list.add(p);
			i ++;
		}

		for (int j = 0; j < N; j ++) {
			int after = X - k;

			boolean bool = (list.contains(after));
			System.out.println(bool);

			if (!list.contains(after)) {
				answer1 = after;
				System.out.println(answer1);
				break;
			}
			k++;
		}

		 for (int l = 0; l < N; l++){
			int after2 = X + m;
			if (!list.contains(after2)) {
				answer2 = after2;
				System.out.println(answer2);
				break;
			}
			m++;
		}

		int abs1 = Math.abs(X - answer1);
		int abs2 = Math.abs(X - answer2);

		System.out.println(abs1 < abs2 ? answer1 : answer2);
	}

}