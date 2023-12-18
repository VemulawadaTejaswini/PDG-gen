import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int sum = 0;

		for(int i = 0; i < n; i++) {
			sum += a(scan.nextInt());
		}

		System.out.println(sum);
	}

	static int a(int n) {
		int re = 0;
		while(n % 2 == 0) {
			n /= 2;
			re++;
		}
		return re;
	}

}
