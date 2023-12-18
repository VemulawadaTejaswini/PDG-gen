import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		double ans = 0;
		int a;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			ans += 1.0 / a;
		}
		ans = 1.0 / ans;
		System.out.println(ans);
	}
}
