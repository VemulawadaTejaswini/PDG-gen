

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		while (n != 0) {
			// int[] point = new int[20];
			int num, resule = 0;
			int sum = 0, max = 0, min = 1000;
			for (int i = 0; i < n; i++) {
				num = a.nextInt();
				sum += num;
				if (num > max)
					max = num;
				if (num < min)
					min = num;

			}

			resule = (sum - min - max) / (n - 2);
			System.out.println(resule);
			n = a.nextInt();
		}
	}
}