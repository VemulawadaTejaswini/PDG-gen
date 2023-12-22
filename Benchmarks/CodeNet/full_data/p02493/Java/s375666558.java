
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<LinkedList<Long>> list = new LinkedList<LinkedList<Long>>();

		while (sc.hasNext()) {
			int times = sc.nextInt();
			if (times == 0L) {
				break;
			}
			LinkedList<Long> list2 = new LinkedList<Long>();
			for (int i = times; i > 0; i--) {
				list2.add(sc.nextLong());
			}
			list.add(list2);
		}
		for (LinkedList<Long> list2 : list) {
			StringBuilder sb = new StringBuilder();
			Collections.sort(list2);
			for (ListIterator<Long> it = list2.listIterator(list2.size()); it.hasPrevious();) {
				sb.append(it.previous()).append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}