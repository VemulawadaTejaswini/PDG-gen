import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int ans = 0;
		while (n > 0) {
			n /= k;
			ans++;
		}
		System.out.println(ans);
	}
}
