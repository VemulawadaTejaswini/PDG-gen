import java.util.AbstractMap.SimpleEntry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int maxHour = 0;
			PriorityQueue<SimpleEntry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> {
				return Integer.compare(e2.getValue(), e1.getValue());
			});
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				maxHour = Math.max(maxHour, b[i]);
				queue.add(new SimpleEntry<Integer, Integer>(a[i], b[i]));
			}
			SimpleEntry<Integer, Integer> entry;
			int current = -1;
			while((entry = queue.poll()) != null) {
				if(current == -1) {
					current = entry.getValue() - entry.getKey();
				} else {
					if(current < entry.getKey()) {
						System.out.println("No");
						System.exit(0);
					} else {
						current -= entry.getKey();
					}
				}
			}
			System.out.println("Yes");
		}

	}

}
