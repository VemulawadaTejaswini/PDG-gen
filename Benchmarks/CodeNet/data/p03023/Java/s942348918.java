import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		long[] answer = new long[q];
		for (int i = 0; i<q; i++) {
			int x = (sc.nextInt()) % 1000003;
			int d = (sc.nextInt()) % 1000003;
			int n = (sc.nextInt()) % 1000003;
			answer[i] = calc(x,d,n);
		}

		for (long a : answer ) {
			System.out.println(a);
		}

	}

	static long calc(Integer x, Integer d, Integer n) {
		long result = 1;
		for (int i = 0; i < n; i++) {
			int val = (x + i * d) % 1000003;
			result = (result * val) % 1000003;
		}

		result = result % 1000003;
		return result;
	}


}
