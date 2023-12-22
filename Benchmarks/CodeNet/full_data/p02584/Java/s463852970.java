import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		if (Math.abs(X) / D >= K) {
			System.out.println(Math.abs(X) - K * D);
		}else {
			K -= Math.abs(X) / D ;
			if (K % 2 == 0) {
				System.out.println(Math.abs(X) % D);
			}else {
				System.out.println(Math.abs(Math.abs(X) % D - D));
			}

		}
	}
}