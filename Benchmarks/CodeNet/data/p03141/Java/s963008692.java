
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		List<Long[]> list = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			list.add(new Long[] {in.nextLong(), in.nextLong()});
		}
		if (N % 2 > 0) {
			list.add(new Long[] {0L, 0L});
		}
		List<Long[]> list2 = new LinkedList<>(list);

		list.sort((a, b) -> {
			if (a[0] > b[0] || a[0] == b[0] && a[1] > b[1]) {
				return -1;
			}
			if (a[0] == b[0] && a[1] == b[1]) {
				return 0;
			}
			return 1;
		});
		list2.sort((a, b) -> {
			if (a[1] > b[1] || a[1] == b[1] && a[0] > b[0]) {
				return -1;
			}
			if (a[0] == b[0] && a[1] == b[1]) {
				return 0;
			}
			return 1;
		});

		long happy = 0;
		for (int i = 0; i < N; i += 2) {
			Long[] ls1 = list.get(0);
			happy += ls1[0];
			list.remove(ls1);
			list2.remove(ls1);

			Long[] ls2 = list2.get(0);
			happy -= ls2[1];
			list.remove(ls2);
			list2.remove(ls2);
		}
		System.out.println(happy);
	}
}
