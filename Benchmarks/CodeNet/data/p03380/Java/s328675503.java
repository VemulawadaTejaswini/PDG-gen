import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int max = a[a.length - 1];
		double k = max / 2;
		double min = max;
		int index = 0;
		for (int i = a.length - 2; i >= 0; i--) {
			if (Math.abs(k - a[i]) < min) {
				index = i;
				min = Math.abs(k - a[i]);
			}
		}
		System.out.println(max + " " + a[index]);
		in.close();
	}
}