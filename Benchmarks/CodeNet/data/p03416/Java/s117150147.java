import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;

		for (int i = a ; i <= b ; i++) {
			if (a / 10000 == a % 10 && a / 1000 % 10 == a / 100 % 10) cnt++;
		}
		System.out.println(cnt);
	}
}
