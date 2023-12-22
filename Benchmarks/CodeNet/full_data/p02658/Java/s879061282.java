import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final long MAX = (long) 1e18;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		for (int i = 0; i < n; i++) {
			if(ans <= MAX)ans *= sc.nextLong();
			else break;
		}
		if (ans > MAX)ans = -1;
		System.out.println(ans);
	}
}