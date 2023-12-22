import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();

		long K = scan.nextLong();

		long D = scan.nextLong();

		long S = N - D;
		for(int i = 1; i < K; i++) {
			if(S == N % D)
			{
				S = S - D;
			}else if(N % D < S)
			{
				S = S - D;
			}else {
				S = S + D;
			}
		}

		if(S < 0) {
			S = -1 * S;
		}

		System.out.println(S);


		scan.close();
	}
}
