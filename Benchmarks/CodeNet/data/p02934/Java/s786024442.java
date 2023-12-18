import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = 0;
		for (int i = 0; i < n; i++) {
			ans += (double)1 / sc.nextInt();
		}
		System.out.println(1/ans);
	}
}