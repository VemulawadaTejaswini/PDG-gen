import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long WK = 0;

		for (long i = 0; i < K; i++){
			WK = A;
			A = B + C;
			B = WK + C;
		}

		long ans = A - B;

		if (Math.abs(ans) <= Math.pow(10, 18)){
			System.out.println(ans);
		} else {
			System.out.println("Unfair");
		}

	}
}