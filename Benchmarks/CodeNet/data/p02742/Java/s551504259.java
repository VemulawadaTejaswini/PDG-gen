
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		long ans = 0;
		ans += h / 2 * w;
		ans += (h % 2) * (w / 2 + 1);
		System.out.println(ans);
	}

}
