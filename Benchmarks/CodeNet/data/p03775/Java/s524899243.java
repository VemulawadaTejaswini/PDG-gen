import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		long sq = (long) Math.sqrt(N);
		if (N % sq == 0) {
			System.out.println(String.valueOf(sq).length());
		} else {
			long a = N;
			long b = 1;
			while (b < sq) {
				b++;
				if (N % b == 0) {
					a = N / b;
				}
			}
			b = N / a;
			long aLength = String.valueOf(a).length();
			long bLength = String.valueOf(b).length();
			System.out.println(Math.max(aLength, bLength));
		}

	}

}