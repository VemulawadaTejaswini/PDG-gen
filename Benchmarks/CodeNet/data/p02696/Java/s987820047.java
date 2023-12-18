import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long max = 0;

		for (long x = 0; x <= N; x ++){

			long tmp = (A * x / B) - (A * (x / B));

			if ( tmp > max)
				max = tmp;

		}

		System.out.println(max);



	}

}
