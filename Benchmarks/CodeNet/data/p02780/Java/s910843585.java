import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextDouble());
		}
		sc.close();

		List<Double> ansList = new ArrayList<>();
		for (int i = 0; i < n - k + 1; i++) {
			Double sum = 0d;
			for (int j = 0; j < k; j++) {
				sum += list.get(i + j);
			}
			ansList.add(sum);
		}

		System.out.println(p(Collections.max(ansList)));
	}

	public static Double p(Double num) {
		return ((1d + num) * (num / 2d)) / num;
	}
}
