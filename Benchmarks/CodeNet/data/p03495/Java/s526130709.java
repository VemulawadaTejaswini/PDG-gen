import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] a = new int[n+1];
		for(int i = 0; i < n; i++) {
			a[sc.nextInt()]++;
		}
		Arrays.sort(a);
		for(int i = n; i > n-k ; i--) {
			count += a[i];
		}
		System.out.println(n-count);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}