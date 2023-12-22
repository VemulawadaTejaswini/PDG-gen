import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		long ans = 1;
		long max = (long) Math.pow(10, 18);
		for (int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			ans *= tmp;
		}
		if (ans > max) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}

}
