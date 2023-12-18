import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();

//		long ak = (long) ((Math.pow(2, K) + (2 * Math.pow(-1, K)))/3);
//		long bk = (long) ((Math.pow(2, K) - Math.pow(-1, K))/3);
//
//		long a = (ak * A) + bk*(B + C);
//		long b = (ak * B) + bk*(A + C);
//		System.out.println(a+" "+b);

		long ans = (long) (Math.pow(-1, K) * (A-B));
		if(Math.abs(ans) > Math.pow(10, 18)) {
			System.out.println("Unfair");
		}else {
			System.out.println(ans);
		}
	}
}
