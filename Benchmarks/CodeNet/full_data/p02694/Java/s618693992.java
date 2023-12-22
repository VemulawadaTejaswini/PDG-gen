import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long X = scan.nextLong();
		long m = 100;
		int ans = 0;

		while(true) {
			m *= 1.01;
			ans++;
			if(X <= m) {
				break;
			}
		}

		System.out.println(ans);

	}
}