import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] h = new int[n];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}

		Arrays.sort(h);

		for (int i = 0; i < (Math.max(0,n - k)); i++) {
			sum += h[i];
		}
		System.out.println(sum);

		sc.close();
	}
}