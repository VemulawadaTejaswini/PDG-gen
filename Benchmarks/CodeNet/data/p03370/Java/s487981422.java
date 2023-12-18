import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int cnt = 0;
		int sum = sc.nextInt();
		int min = sum;
		while (sc.hasNext()) {
			int min2 = sc.nextInt();
			if (min > min2) min = min2;
			sum = sum + min2;
		}
		System.out.println((n - sum) / min + x);
	}
}
