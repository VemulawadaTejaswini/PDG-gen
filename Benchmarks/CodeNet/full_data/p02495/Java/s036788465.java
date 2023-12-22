import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		int i, j;
		for (i = 0; i < H; i++) {
			for (j = 0; j < M; j++) {
				int s = i + j;
				if (s % 2 == 0) {
					System.out.printf("#");
				} else {
					System.out.printf(".");
				}

			}
			System.out.printf("\n");
		}
	}

}