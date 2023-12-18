import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		long amax = 0;
		long bmin = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			amax = Math.max(amax, a);
			bmin = Math.min(bmin, b);
		}

		System.out.println(amax + bmin);
	}
}