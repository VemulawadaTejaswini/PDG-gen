import java.util.Scanner;

// MainT1P2018D
public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int N = in.nextInt();
			int d = 8*N + 1;
			int dr = (int)Math.sqrt(d);
			if (dr * dr != d) {
				System.out.println("No");
				return;
			}

			final int k = (1 + dr) / 2;

			final int[] startIdx = new int[k - 1];
			{
				int idx = 1;
				for (int i = 0; i < k - 1; ++i) {
					startIdx[i] = idx;
					idx += i + 1;
				}
			}

			System.out.println("Yes");
			System.out.println(k);
			{
				System.out.print(k - 1);
				for (int i = 0; i < k - 1; ++i) {
					System.out.print(' ');
					System.out.print(startIdx[i] + i);
				}
				System.out.println();
			}
			for (int i = 0; i < k - 1; ++i) {
				System.out.print(k - 1);
				for (int j = 0; j < i; ++j) {
					System.out.print(' ');
					System.out.print(startIdx[i] + j);
				}
				for (int j = i; j < k - 1; ++j) {
					System.out.print(' ');
					System.out.print(startIdx[j] + i);
				}
				System.out.println();
			}
		}
	}
}
