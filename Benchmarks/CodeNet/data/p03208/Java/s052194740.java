import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			list.add(h);
		}

		list.sort((a, b) -> a - b);

		int sub = Integer.MAX_VALUE;

		for (int i = 0; i <= n - k; i++) {
			int max = 0;
			int min = Integer.MAX_VALUE;

			for (int j = i; j < i + k; j++) {
				int num = list.get(j);
				if (num > max)
					max = num;
				if (num < min)
					min = num;
			}

			if (sub > max - min) {
				sub = max - min;
			}

		}
		System.out.println(sub);

		sc.close();
	}

}
