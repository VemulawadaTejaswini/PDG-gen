import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			List<Item> items = new ArrayList<>();
			items.add(new Item(0, 0, 0));
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				items.add(new Item(i + 1, sc.nextInt(), sc.nextInt()));
			}

			int q = sc.nextInt();

			for (int qi = 0; qi < q; qi++) {
				int v = sc.nextInt();
				int l = sc.nextInt();

				List<Item> tempItems = new ArrayList<>();
				for (int tempV = v; 1 <= tempV; tempV /= 2) {
					tempItems.add(items.get(tempV));

				}
				//System.out.println(tempItems);

				int[][] dp = new int[tempItems.size() + 1][l + 1];
				for (int i = 0; i < dp.length - 1; i++) {
					for (int w = 0; w <= l; w++) {
						if (w >= tempItems.get(i).weight) {
							dp[i + 1][w] = Math.max(dp[i][w - tempItems.get(i).weight] + tempItems.get(i).value,
									dp[i][w]);
						} else {
							dp[i + 1][w] = dp[i][w];
						}

					}
				}

				System.out.println(dp[tempItems.size()][l]);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Item {
	int num;
	int value;
	int weight;

	public Item(int num, int value, int weight) {
		this.num = num;
		this.value = value;
		this.weight = weight;
	}
}