import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long[] bottles = new long[4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long Q = Integer.parseInt(sc.next());
		long H = Integer.parseInt(sc.next());
		long S = Integer.parseInt(sc.next());
		long D = Integer.parseInt(sc.next());
		long N = Integer.parseInt(sc.next());

		long[] price = {Q*8, H*4, S*2, D};
		Arrays.sort(price);

		double rest = N;

		for(int i = 0; i < price.length; i++) {
			if(price[i] == Q*8) {
				bottles[0] = (long) (rest / 0.25);
				rest -= 0.25 * bottles[0];
			}else if(price[i] == H*4) {
				bottles[1] = (long) (rest / 0.5);
				rest -= 0.5 * bottles[1];
			}else if(price[i] == S*2) {
				bottles[2] = (long) rest;
				rest -= bottles[2];
			}else {
				bottles[3] = (long) (rest / 2);
				rest -= 2 * bottles[3];
			}
		}

		long total = bottles[0] * Q + bottles[1] * H + bottles[2] * S + bottles[3] * D;

		System.out.println(total);

		sc.close();
	}

}
