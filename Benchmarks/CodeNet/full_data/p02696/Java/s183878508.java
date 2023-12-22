import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long B = sc.nextLong();
		long N = sc.nextLong();
		sc.close();

		long max = 0;
		for (int i = 1; i <= N; i++) {
			long v = ((long) Math.floor((double) A * i / B) - A * (long) Math.floor((double) i / B));
			max = Math.max(max, v);
		}
		System.out.println(max);
	}
}
