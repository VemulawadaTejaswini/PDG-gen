import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long ans = 0;
		if(a < 0 && b <= 0 && c < 0 && d <= 0) {
			ans = a * c;
			System.out.print(ans);
		}else if(a < 0 && b <= 0) {
			if(c < 0 && d > -1) {
				ans = a * c;
				System.out.print(ans);
			}else {
				ans = b * d;
				System.out.print(ans);
			}
		}else if(c < 0 && d <= 0) {
			if(a < 0 && b > -1) {
				ans = a * c;
				System.out.print(ans);
			}else {
				ans = d * a;
				System.out.print(ans);
			}
		}else {
			ans = b * d;
			System.out.print(ans);
		}

		sc.close();
	}
}