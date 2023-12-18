//C
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		long[] P = new long[5];

		long ans = 0;

		P[0] = sc.nextLong();

		long min = P[0];

		for(int i=1;i<5;i++) {

			P[i] = sc.nextLong();

			min = Math.min(min, P[i]);

		}

		if(N%min==0) ans = N/min + 4;

		else ans = N/min + 5;

		System.out.println(ans);
	}

}
