import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[][] text = new int[N][M + 1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M + 1; j++) {
				text[i][j] = sc.nextInt();
			}
		}
		/*for (int i = 0; i < N; i++) {
			for (int j = 0; j < M + 1; j++) {
				System.out.println(text[i][j]);
			}
		}*/
		int[] skill = new int[M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				skill[i] = skill[i] + text[j][i + 1];
			}
		}
		/*for (int i : skill) {
			System.out.println(i);
		}*/
		for (int i = 0; i < M; i++) {
			if (X > skill[i]) {
				System.out.println(-1);
				//System.out.println(skill[i]);
			}
		}

	}

}