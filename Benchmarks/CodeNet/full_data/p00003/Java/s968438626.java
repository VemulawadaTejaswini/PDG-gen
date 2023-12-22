import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final int n = sc.nextInt();
			while (sc.hasNext()) {
				int[] x = new int[3];
				x[0] = sc.nextInt();
				x[1] = sc.nextInt();
				x[2] = sc.nextInt();
				Arrays.sort(x);
				boolean isTriangle = (x[0] * x[0]) + (x[1] * x[1]) == (x[2] * x[2]);
				System.out.println(isTriangle ? "YES" : "NO");
			}
		}
	}
}