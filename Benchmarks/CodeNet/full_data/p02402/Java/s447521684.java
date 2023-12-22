package aizu.online;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		String[] in = input.split(" ");
		if (n > 0 && n <= 10000) {
			int[] ai = new int[n];
			int min = 0;
			int max = 0;
			int sum = 0;
			for (int i = 0; i < ai.length; i++) {
				ai[i] = Integer.parseInt(in[i]);
				if (ai[i] >= -1000000 && ai[i] <= 1000000) {
					if (i == 0) {
						min = ai[i];
						max = ai[i];
					}

					sum += ai[i];

					if (max < ai[i]) {
						max = ai[i];
					}

					if (min > ai[i]) {
						min = ai[i];
					}
				}
			}
			System.out.print(min + " ");
			System.out.print(max + " ");
			System.out.println(sum);
		}
	}
}