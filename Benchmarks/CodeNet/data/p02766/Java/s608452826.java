import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long p = 1;
		int r = 0;
		while (p <= n) {
			p *= k;
			r++;
		}

		System.out.println(r);

	}

}
