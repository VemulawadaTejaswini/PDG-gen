import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		int[] a = new int[n];
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(tokens[i]) % m;
		}
		long count = 0L;
		for (int i = 0; i < n; ++i) {
			long val = 0;
			for (int j = i; j < n; ++j) {
				val += a[j];
				if (val % m == 0) {
					++count;
				}
			}
		}
		System.out.println(count);
		in.close();
	}
}
