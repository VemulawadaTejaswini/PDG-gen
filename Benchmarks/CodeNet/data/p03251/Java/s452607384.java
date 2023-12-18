
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		int X = Integer.parseInt(scan.next());
		int Y = Integer.parseInt(scan.next());
		int[] x = new int[N];
		int[] y = new int[M];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(scan.next());
		}
		for (int i = 0; i < M; i++) {
			y[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(x);
		Arrays.sort(y);
		if (x[x.length - 1] >= y[0]) {
			System.out.println("War");
			return;
		}
		if (X >= y[0] || Y <= x[x.length - 1]) {
			System.out.println("War");
			return;
		}
		System.out.println("No War");
	}
}
