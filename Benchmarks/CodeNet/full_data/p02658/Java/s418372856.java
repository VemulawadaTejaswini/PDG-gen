import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long p = 1;

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			p = p * sc.nextLong();
		}
		if (p > 1000000000000000000) System.out.println(-1);
		System.out.println(p);
	}
}