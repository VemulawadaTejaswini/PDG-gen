import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		long B = scan.nextLong();
		long K = scan.nextLong();

		for(int i = 0; i < K; i++) {
			if(A >= 1) {
				A--;
			}else if(B >= 1) {
				B--;
			}
		}

		System.out.println(A+ " "+B);

	}
}