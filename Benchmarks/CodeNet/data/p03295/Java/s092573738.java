
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<Integer> list[] =new ArrayList[N];

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			list[i].add(b);
		}

		int hashi = 0;
		for (int j = 0; j < N - 1; j++) {
			if (list[j].contains(j+1)) {
			} else {
				list[j + 1].addAll(list[j]);
				hashi += 1;
			}
		}
		System.out.println(N - 1 - hashi);
	}
}
