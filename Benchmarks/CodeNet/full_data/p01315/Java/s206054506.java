import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			Info info[] = new Info[N];
			for (int i = 0; i < N; i++) {
				String name = sc.next();
				int price = sc.nextInt();
				int time[] = new int[5];
				for (int j = 0; j < 5; j++) {
					time[j] = sc.nextInt();
				}
				int F = sc.nextInt();
				int S = sc.nextInt();
				int M = sc.nextInt();
				info[i] = new Info(name, price, time, F, S, M, 0);
			}
			for (int i = 0; i < N; i++) {
				double time = 0;
				double money = 0;
				time = info[i].time[0] + info[i].time[1] + info[i].time[2];
				time += (info[i].time[3] + info[i].time[4]) * info[i].M;
				money = info[i].F * info[i].S * info[i].M - info[i].price;
				info[i].efficient = money / time;
			}
			Arrays.sort(info, new ComparatorInfo());
			for (int i = 0; i < N; i++) {
				System.out.println(info[i].name);
			}
			System.out.println("#");
		}
	}

	class Info {
		String name;
		int price;
		int time[];
		int F;
		int S;
		int M;
		double efficient;

		public Info(String name, int price, int[] time, int F, int S, int M,
				double efficient) {
			this.name = name;
			this.price = price;
			this.time = time;
			this.F = F;
			this.S = S;
			this.M = M;
			this.efficient = efficient;
		}
	}

	class ComparatorInfo implements Comparator<Info> {

		@Override
		public int compare(Info arg0, Info arg1) {
			int cmp = 0;
			if (arg0.efficient < arg1.efficient) {
				cmp = 1;
			} else if (arg0.efficient > arg1.efficient) {
				cmp = -1;
			} else {
				cmp = arg0.name.compareTo(arg1.name);
			}
			return cmp;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}