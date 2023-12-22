import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);
		int[] m = new int[v];

		String line2 = sc.nextLine();
		String[] k = line2.split(" ");
		int[] y = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			y[i] = Integer.parseInt(k[i]);
		}
		Arrays.sort(y);
		long sum = 0;
		for (int i = 0; i < y.length; i++) {
			sum += y[i];
		}
		System.out.print(y[0]);
		System.out.print(" " + y[y.length - 1]);
		System.out.println(" " + sum);
	}
}