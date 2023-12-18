import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] t = sc.nextLine().split(" ");
		long n = Long.parseLong(t[0]);
		long k = Long.parseLong(t[1]);

		if(n == 1 || k == 1) {
			System.out.println(0);
			return;
		}
		long sho = Math.floorDiv(n, k);
		long ans = Math.min(Math.abs(n - k * sho), (Math.abs(n - k * (sho + 1))));

		System.out.println(ans);
	}
}
