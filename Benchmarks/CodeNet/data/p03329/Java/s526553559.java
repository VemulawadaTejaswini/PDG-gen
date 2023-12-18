import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		int[] dpTable = new int[N + 1];

		HashSet<Integer> sixPow = new HashSet<>();
		HashSet<Integer> ninePow = new HashSet<>();

		int sp = 6;
		while (sp <= N) {
			sixPow.add(sp);
			sp *= 6;
		}

		int np = 9;
		while (np <= N) {
			ninePow.add(np);
			np *= 9;
		}
		dpTable[1] = 1;
		for (int i = 2; i <= N; i++) {
			if (sixPow.contains(i) || ninePow.contains(i)) {
				dpTable[i] = 1;
				continue;
			}

			dpTable[i] = dpTable[i - 1] + 1;
			for (Integer s : sixPow) {
				if (s < i) {
					dpTable[i] = Math.min(dpTable[i], dpTable[i - s] + 1);
				}
			}

			for (Integer n : ninePow) {
				if (n < i) {
					dpTable[i] = Math.min(dpTable[i], dpTable[i - n] + 1);
				}
			}
		}
		System.out.println(dpTable[N]);

		sc.close();
	}

}
