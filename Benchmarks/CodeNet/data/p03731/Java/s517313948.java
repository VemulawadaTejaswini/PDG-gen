import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int N = scn.nextInt();
		int T = scn.nextInt();
		int ans = T;
		int b_t = 0;
		for(int i = 0;i < N;i++) {
			int t = scn.nextInt();
			ans -= Math.max(0, T+b_t - t);
			ans +=T;
			b_t = t;
		}
		System.out.println(ans);
	}

}
