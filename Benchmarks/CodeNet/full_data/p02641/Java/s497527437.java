import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int x = sc.nextInt();
			int n = sc.nextInt();

			boolean[] exist = new boolean[101];

			for (int i = 0; i < n; i++) {
				exist[sc.nextInt()] = true;
			}

			if (exist[x] == false) {
				System.out.println(x);
				return;
			}

			int diff = 1;
			while (true) {
				if (x - diff == 0) {
					System.out.println(x - diff);
					return;
				}

				if (exist[x - diff] == false) {
					System.out.println(x - diff);
					return;
				}

				if (100 < x + diff) {
					System.out.println(101);
					return;
				}
				if (exist[x + diff] == false) {
					System.out.println(x + diff);
					return;
				}

				diff++;

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
