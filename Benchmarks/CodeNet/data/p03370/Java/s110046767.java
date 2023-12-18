import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			min = Math.min(min, m);
			x -= m;
		}
		System.out.println(n+x/min);
	}
}
