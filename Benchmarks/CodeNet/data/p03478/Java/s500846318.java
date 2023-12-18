import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (check(i, a, b)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

	private static boolean check(int x, int a, int b) {
		int sum = 0;
		while (x > 0) {
			sum += x - (x / 10 * 10);
			x /= 10;
		}
		return sum >= a && sum <= b;
	}
}
