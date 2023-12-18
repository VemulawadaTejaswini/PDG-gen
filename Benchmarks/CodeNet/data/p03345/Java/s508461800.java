import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		for (int i = 0; i < K; i++) {
			long tempa = B + C;
			long tempb = A + C;
			long tempc = B + A;
			A = tempa;
			B = tempb;
			C = tempc;
			if (Math.abs(A-B)>1000000000000000000l) {
				System.out.println("Unfair");
				return ;
			}
		}
		System.out.println(A-B);
	}
}