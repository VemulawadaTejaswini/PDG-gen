import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	enum Order {
		North(1, 0), East(0, 2), South(0, 1), West(2, 0), Right(2, 1), Left(1,
				2);

		final int from, to;

		Order(int from, int to) {
			this.from = from;
			this.to = to;
		}

		public void rool(int[] dice) {
			int ura = 7 - dice[to];
			dice[to] = dice[from];
			dice[from] = ura;
		}
	}

	public static void main(String[] args) {
		Map<String, Order> map = new HashMap<String, Main.Order>();
		for (Order order : Order.values()) {
			map.put(order.name(), order);
		}
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int[] dice = { 1, 2, 3 };
			int count = 1;
			for (int i = in.nextInt(); i > 0; i--) {
				map.get(in.next()).rool(dice);
				count += dice[0];
			}
			System.out.println(count);
		}
	}
}