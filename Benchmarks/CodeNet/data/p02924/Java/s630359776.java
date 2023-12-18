import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		long ans = ((long) (n - 1) * (long) n / 2);

		System.out.println(ans);

		sc.close();
	}
}