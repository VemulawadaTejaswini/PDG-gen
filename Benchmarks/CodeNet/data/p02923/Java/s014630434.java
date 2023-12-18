import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		long[][] H = new long[N][2];

		for (int i = 0; i < N; i++) {
			H[i][0] = scanner.nextLong();
			H[i][1] = 0;
		}

		long max = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i; j < N - 1; j++) {
				if (H[j][0] >= H[j + 1][0])
					H[i][1]++;
				else
					break;
			}
			if (i == 0)
				max = H[i][1];
			else {
				if (max < H[i][1])
					max = H[i][1];
			}
		}

		System.out.println(max);

	}

}
