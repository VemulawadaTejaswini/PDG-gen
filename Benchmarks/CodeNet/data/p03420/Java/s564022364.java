import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,K;
		N = sc.nextInt();
		K = sc.nextInt();
		long count =0;
		if (K==0) {
			System.out.println(N);
		}
		for (int i=K+1;i<=N;i++) {
			count +=((N-K)/i+1)*(i-K);
		}
		System.out.println(count);
	}
}