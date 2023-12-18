import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		//		int[] x = new int[n];
		//
		//		for (int i = 0; i < n; i++) {
		//			x[i] = Integer.parseInt(sc.next());
		//		}
		if (a > b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		//必ずa<=b
		int cnt = 0;
		for (int i = 1; i <= Math.sqrt(a); i++) {
			boolean isSosu = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isSosu = false;
					break;
				}
			}

			if (isSosu) {
				if (a % i == 0 && b % i == 0) {
//					System.out.println(i);
					cnt++;
				}
			}
			isSosu = false;
		}

		System.out.println(cnt);
		sc.close();
	}
}