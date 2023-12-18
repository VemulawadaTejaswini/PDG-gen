import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
//		Collections.sort(list, new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return Integer.compare(o1.h, o2.h);
//			}
//		});
		int count = 0;

		for (int i = 2; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				int sum = list.get(j) + list.get(j + i);
				if (i == sum) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
