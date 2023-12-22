import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			char[] c = sc.next().toCharArray();
			int[] score = new int[n];
			int card = 0, ba = 0;
			while (card < 100) {
				for (int i = 0; i < n; i++) {
					if (c[card] == 'M') {
						score[i]++;
					} else if (c[card] == 'S') {
						ba += score[i] + 1;
						score[i] = 0;
					} else {
						score[i] += ba + 1;
						ba = 0;
					}
					card++;
				}
			}
			Arrays.sort(score);
			for (int i = 0; i < n; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println(ba);
		}
	}
}