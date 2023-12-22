import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		int n;
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			System.out.println(getResult(n));
		}
	}

	public static int getResult(int n) {
		int count = 0;
		for (int i = 0; i <= 9; i++)
			for (int j = 0; j <= 9; j++)
				for (int k = 0; k <= 9; k++)
					for (int l = 0; l <= 9; l++) {
						if (i + j + k + l == n)
							count++;
					}

		return count;
	}
}