import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 127
//D	Integer Cards
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		List<Integer> As = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			As.add(sc.nextInt());
		}
		sc.nextLine();
		List<Integer> Bs = new ArrayList<>();
		List<Integer> Cs = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			Bs.add(sc.nextInt());
			Cs.add(sc.nextInt());
			sc.nextLine();
		}

		sc.close();

		Collections.sort(As, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});

		for (int j = 0; j < M; j++) {
			int b = Bs.get(j);
			int c = Cs.get(j);
			boolean isReplaced = false;
			for (int i = 0; i < N; i++) {
				if (i >= b) {
					break;
				}
				int a = As.get(i);
				if (a < c) {
					As.set(i, c);
					isReplaced  = true;
				}
			}

			if (isReplaced) {
				Collections.sort(As, new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
			}
		}
		long ans = 0;
		for (Integer a : As) {
			ans += a;
		}

		System.out.println(ans);

	}
}
