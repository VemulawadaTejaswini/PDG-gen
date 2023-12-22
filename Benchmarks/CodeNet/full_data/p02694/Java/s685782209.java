import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		float now = 100;
		long ans = 0;

		while (now < x) {
			now +=  0.01 * now;
			ans++;
		}

		System.out.println(ans);

		sc.close();
	}

}
