import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		long x = 0;
		long y = 0;
		int count = 0;
		double distance = 0;

		for (int i = 0; i < N; i++ ) {
			x = sc.nextLong();
			y = sc.nextLong();
			distance = Math.hypot(x, y);
			if (distance <= D) count++;
		}

		sc.close();

		System.out.println(count);
	}
}