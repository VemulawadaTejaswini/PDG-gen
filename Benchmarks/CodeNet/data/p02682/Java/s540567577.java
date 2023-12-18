import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int S = 0;

		if(A >= K) {
			S = K;
		} else {
			S = A;
			K -= A;
			K -= B;
			if(K > 0) {
				S -= K;
			}
		}
		System.out.println(S);
	}
}