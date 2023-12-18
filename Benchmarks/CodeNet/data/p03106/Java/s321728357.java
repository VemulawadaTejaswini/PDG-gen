import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().exec();
	}

	void exec() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> rank = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			if (a % i == 0 && b % i == 0) {
				rank.add(i);
			}
		}
		Collections.sort(rank, Collections.reverseOrder());
		System.out.println(rank.get(k-1));

		sc.close();
	}

}
