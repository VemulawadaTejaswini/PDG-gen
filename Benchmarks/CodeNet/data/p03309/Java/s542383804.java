import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long Asum = 0;
		long[] A = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong();
			Asum += A[i];
		}
		long bans = (long) Math.round((Asum - N * (N+1) / 2.0)/N);
		Asum = 0;
		for(int i=0;i<N;i++) {
			Asum += Math.abs(A[i]-bans-((long)i+1));
		}
		System.out.println(Asum);
	}
}
