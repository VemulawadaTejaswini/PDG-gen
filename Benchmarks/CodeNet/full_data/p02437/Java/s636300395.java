import java.util.*;

public class Main {
	static class Comp implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return Integer.compare(o2, o1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		List<Queue<Integer>> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new PriorityQueue<>(new Comp()));
		}
		for (int i = 0; i < q; i++) {
			switch (sc.nextInt()) {
				case 0:
					list.get(sc.nextInt()).add(sc.nextInt());
					break;
				case 1:
					int t = sc.nextInt();
					if (!list.get(t).isEmpty()) {
						System.out.println(list.get(t).peek());
					}
					break;
				case 2:
					t = sc.nextInt();
					if (!list.get(t).isEmpty()) {
						list.get(t).poll();
					}
					break;
			}
		}
	}
}
