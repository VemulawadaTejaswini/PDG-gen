import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long M = scn.nextLong();
		long ans = 0;
		if(2 * N > M) {
			ans = M/2;
		}else {
			ans +=N;
			M-=2*N;
			ans += M/4;
		}
		System.out.println(ans);
	}

}
