import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();

		long cnt = 0;
		long min = N;

		long x = N;
		long x_tmp = 0;

		/* check */
		long L = Math.abs(N/K);
		x = x - L*K;
		
		/* check2 */
		for (;;) {
			x_tmp =Math.abs(x - K);
			if (x > x_tmp) {
				x =  Math.abs(x - K);
				cnt = 0;
			} else if(x == x_tmp) {
				cnt++;
				if(cnt > 0);
					break;
			}else {
				break;
			}

		}

		System.out.println(x);
		sc.close();

	}
}