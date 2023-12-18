import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int total = 0;
		for(int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			total += W[i];
		}
		int ans = Integer.MAX_VALUE;
		int ruiseki = 0;
		for(int i = 0; i < N; i++) {
			total -= W[i];
			ruiseki += W[i];
			ans = Math.min(ans, Math.abs(total-ruiseki));
		}
		System.out.println(ans);

	}

}