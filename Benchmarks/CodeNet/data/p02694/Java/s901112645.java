import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long now = 100;
		long ans = 0;

		while (now < x) {
			now +=  now / 100;
			ans++;
		}

		System.out.println(ans);

		sc.close();
	}

}
