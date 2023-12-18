import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long A = scn.nextLong();
			long B = scn.nextLong();
			long N = scn.nextLong();

			long max = 0;
			int init = 1;
			if(N >= 10000000) init = 10000000;
			for(int x = init; x <= N; x++) {
				long ax = A * x / B;
				long ab = A * (x/B);
				long tmp = ax - ab;

				if(max < tmp) {
					max = tmp;
				}
			}
			System.out.println(max);
		}
	}
}