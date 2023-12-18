import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();
		int o = 0;
		int time = 1;
		int distance = 0;
		int max = 0;
		int min = 0;

		for (int i = 0; i < N; i++) {
			x.add(sc.nextInt());
			if (x.get(i) >= 0) {
				o = i;
			}
		}

		if (x.get(o) == 0)
			ans.add(0);

		while (ans.size() != K) {
			for (int p : x) {
				if (p == time) {
					ans.add(time);
					System.out.println("time"+time);
					if (time > 0) {
						max = time;
					} else {
						min = time;
					}
				}
			}
			if (ans.size() != K) {
				if (time > 0) {
					time *= -1;
				} else {
					time *= -1;
					time += 1;
				}
			}

		}

		if (max > Math.abs(min)) {
			distance = max + Math.abs(min) * 2;
		} else {
			distance = max * 2 + Math.abs(min);
		}
		//出力
		System.out.println(distance);

		sc.close();
	}

}
