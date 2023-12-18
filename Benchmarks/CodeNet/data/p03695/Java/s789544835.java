import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		boolean[] rf = new boolean[8];
		int wc = 0;
		for (int i = 0; i < n; i++) {
			int r = a[i] / 400;
			if (r < 8) {
				rf[r] = true;
			} else {
				wc++;
			}
		}
		long count = IntStream.range(0, rf.length).filter(i -> rf[i]).count();
		System.out.println(String.format("%d %d", Math.max(count, 1), Math.min(count + wc , 8)));
	}
}
