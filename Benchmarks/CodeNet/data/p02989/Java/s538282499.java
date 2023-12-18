import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];

		int idx;
		for (idx = 0; idx < N; idx++) {
			d[idx] = Integer.parseInt(sc.next());
		}

		Arrays.sort(d);

		int low = d[N / 2 - 1];
		int high = d[N / 2];

		System.out.println(high - low);

	}

}
