import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int[] a = new int[n];
		for (int j = 0; j < n; j++) {
			a[j] = in.nextInt();
		}
		System.out.println((int)Math.ceil((n - 1) / (double)(k - 1)));
	}
}