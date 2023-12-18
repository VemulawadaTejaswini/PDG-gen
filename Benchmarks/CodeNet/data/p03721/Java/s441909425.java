import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long K = in.nextLong();
		int[][] ab = new int[N][2];
		for (int i = 0; i < N; i++) {
			ab[i][0] = in.nextInt();
			ab[i][1] = in.nextInt();
		}
		Arrays.sort(ab, (x, y) -> Integer.compare(x[0], y[0]));
		int index = 0;
		while (K > 0) {
			K -= ab[index][1];
			index++;
		}
		System.out.println(ab[index - 1][0]);
		in.close();
	}
}