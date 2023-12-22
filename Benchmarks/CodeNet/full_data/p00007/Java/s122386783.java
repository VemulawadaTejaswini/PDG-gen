import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ans = 100000;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ans = (int)((double)ans * 1.05);
			ans = ans % 1000 != 0 ? ans - (ans % 1000) + 1000 : ans;
		}
		System.out.println(ans);

	}

}