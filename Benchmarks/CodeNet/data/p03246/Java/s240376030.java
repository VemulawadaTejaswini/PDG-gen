

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		int[] v;
		int ans = 0;

		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			if (n % 2 == 1 || n < 2 || n > 100000)
				throw new Exception();

			v = new int[n];

			for (int i = 0; i < n; i++) {
				v[i] = sc.nextInt();
				if (v[i] < 1 || v[i] > 100000)
					throw new Exception();
			}
			Arrays.sort(v);

			if (v[0] == v[v.length - 1]) {
				System.out.println(v.length / 2);
				throw new Exception();
			}

			int containsCountMin = 0;
			int containsCountMax = 0;
			for (int i = 0; i < v.length; i++) {
				if (v[0] == v[i])
					containsCountMin++;
				if (v[v.length - 1] == v[i])
					containsCountMax++;
			}

			if (containsCountMin > v.length / 2)
				containsCountMin = v.length / 2;

			if (containsCountMax > v.length / 2)
				containsCountMax = v.length / 2;

			ans = Math.abs(containsCountMin - v.length / 2) + Math.abs(containsCountMax - v.length / 2);
			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

		}

	}

}
