import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int[] mons = new int[cnt + 1];
		int[] heros = new int[cnt];
		for (int i = 0; i < cnt + 1; i++) {
			mons[i] = sc.nextInt();
		}
		for (int i = 0; i < cnt; i++) {
			heros[i] = sc.nextInt();
		}

		int score = 0;

		for (int i = 0; i < cnt; i++) {
			int hero = heros[i];
			if (hero > mons[i]) {
				score = score + mons[i];
				hero = hero - mons[i];
				if (hero >= mons[i + 1]) {
					score = score + mons[i + 1];
					mons[i + 1] = 0;
				} else {
					score = score + hero;
					mons[i + 1] = mons[i + 1] - hero;
				}
			} else {
				score = score + hero;
			}
		}

		System.out.println(score);
	}

}
