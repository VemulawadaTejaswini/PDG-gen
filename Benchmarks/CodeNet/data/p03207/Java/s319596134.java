package b115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}

		int max = p[0];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] > max) {
				max = p[i];
				index = i;
			}
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i == index) {
				sum += p[i]/2;
				continue;
			}

			sum += p[i];
		}

		System.out.println(sum);
	}

}
