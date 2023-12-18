import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int array[][] = new int[2][N+1];
		int max = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N+1; j++) {
				array[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < N+1; i++) {
			int current = 0;
			for (int j = 0; j < i; j++) {
				current += array[0][j];
			}
			for (int k = i; k < N+1; k++) {
				current += array[1][k];
			}
			if (current > max) {
				max = current;
			}
		}
		System.out.println(max);
	}
}
