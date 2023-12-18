import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < Math.pow(2, n) / 2; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == b) {
				list.add(a);
			} else {
				list.add(Math.abs(a - b));
			}
		}
		while (list.size() > 1) {
			int a = list.poll();
			int b = list.poll();
			if (a == b) {
				list.add(a);
			} else {
				list.add(Math.abs(a - b));
			}
		}
		System.out.println(list.poll());
	}
}
