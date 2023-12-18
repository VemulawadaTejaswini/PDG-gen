import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int min = Integer.MAX_VALUE;

		int ab = 0;
		if (X > Y)
			ab = 2 * X;
		else
			ab = 2 * Y;

		for (int i = 0; i <= X; i++) {
			for (int j = 0; j <= Y; j++) {
				for (int k = 0; k <= ab; k++) {
					if (i + (k / 2) == X && j + (k / 2) == Y)
						if ((i * A) + (j * B) + (k * C) < min)
							min = ((i * A) + (j * B) + (k * C));
				}
			}
		}

		System.out.println(min);
	}
}