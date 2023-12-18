import java.util.Scanner;

class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long r = sc.nextInt();

		if (n >= 10) {
			long ans = r;
			System.out.println(ans);
		} else {
			long ans = r - (100 * (10 - n));
			System.out.println(ans);
		}

		sc.close();
	}

}