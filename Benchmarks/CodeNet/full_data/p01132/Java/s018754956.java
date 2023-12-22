import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		String tab = "";

		while (true) {
			int o = sc.nextInt();
			if (o == 0)
				break;
			int k10  = sc.nextInt();
			int k50  = sc.nextInt();
			int k100 = sc.nextInt();
			int k500 = sc.nextInt();

			int o10, o50, o100, o500;
			o10 = o50 = o100 = o500 = 1 << 20;
			for (int p10 = 0; p10 <= k10; p10++) {
				for (int p50 = 0; p50 <= k50; p50++) {
					for (int p100 = 0; p100 <= k100; p100++) {
						for (int p500 = 0; p500 <= k500; p500++) {
							int pay = 10*p10 + 50*p50 + 100*p100 + 500*p500;
							if (pay < o) continue;

							int change = pay - o;
							int c500 = change / 500;
							change %= 500;
							int c100 = change / 100;
							change %= 100;
							int c50 = change / 50;
							change %= 50;
							int c10 = change / 10;

							int r10 = k10 - p10 + c10;
							int r50 = k50 - p50 + c50;
							int r100 = k100 - p100 + c100;
							int r500 = k500 - p500 + c500;
							if (r10+r50+r100+r500 < o10+o50+o100+o500) {
								o10 = r10;
								o50 = r50;
								o100 = r100;
								o500 = r500;
							}
						}
					}
				}
			}

			System.out.print(tab);
			tab = "" + '\n';
			if (o10 < k10)
				System.out.println(10 + " " + (k10 - o10));
			if (o50 < k50)
				System.out.println(50 + " " + (k50 - o50));
			if (o100 < k100)
				System.out.println(100 + " " + (k100 - o100));
			if (o500 < k500)
				System.out.println(500 + " " + (k500 - o500));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}