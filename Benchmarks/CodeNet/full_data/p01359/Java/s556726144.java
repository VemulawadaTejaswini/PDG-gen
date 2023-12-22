import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int Q = sc.nextInt();
			String[] name = new String[N];
			int[] ey = new int[N];
			int[] wy = new int[N];
			for (int i = 0; i < N; ++i) {
				name[i] = sc.next();
				ey[i] = sc.nextInt();
				wy[i] = sc.nextInt();
			}
			for (int i = 0; i < Q; ++i) {
				int q = sc.nextInt();
				boolean found = false;
				for (int j = 0; j < N; ++j) {
					if (wy[j] - ey[j] < q && q <= wy[j]) {
						System.out.println(name[j] + " " + (q - (wy[j] - ey[j])));
						found = true;
						break;
					}
				}
				if (!found) System.out.println("Unknown");
			}
		}
	}
}