import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = Long.parseLong(sc.next());
		int amari = (int) (x % 11);
		long ans = x / 11 * 2;

		if (amari >= 1 && amari <= 6) {
			ans += 1;
		} else if (amari >= 7 && amari <= 10) {
			ans += 2;
		}

		System.out.println(ans);
		sc.close();
	}
}