import java.util.Scanner;

public class Main165 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long A = scn.nextLong();
			long B = scn.nextLong();
			long N = scn.nextLong();

			long max = 0;
			for(int x = 1; x <= N; x++) {
				long ax = A * x / B;
				long ab = A * (x/B);
				if(ab > 0) break;
				long tmp = ax - ab;

				if(max < tmp) {
					max = tmp;
				}
			}
			System.out.println(max);
		}
	}
}