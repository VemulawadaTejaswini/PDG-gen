
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] W = new int[N+1];
		for(int i = 0;i < N;i++) {
			W[i+1]  = W[i] + scn.nextInt();
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1;i < N;i++) {
			int S1 = W[i];
			int S2 = W[N]-W[i];
			ans = Math.min(Math.abs(S1-S2), ans);
		}
		System.out.println(ans);
	}

}
