import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextInt();
		long K = scn.nextInt();
		long num_k = N/K;
		long num_k_2 = (K%2 == 0)?(N + K/2)/K:0;
		long ans = num_k * num_k * num_k;
		ans += num_k_2* num_k_2 * num_k_2;
		System.out.println(ans);
	}

}
