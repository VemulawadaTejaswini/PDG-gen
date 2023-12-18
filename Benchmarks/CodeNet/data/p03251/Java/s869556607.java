
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int[] x = new int[N];
		int[] y = new int[M];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < M; i++) {
			y[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(x);
		Arrays.sort(y);
		int Z = y[0];
		if (X < Z && Z <= Y && x[x.length - 1] < Z) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}

		sc.close();

	}
}