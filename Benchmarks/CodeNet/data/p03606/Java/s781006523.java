
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			ans += r - l + 1;
		}
		System.out.println(ans);
		sc.close();
	}
}