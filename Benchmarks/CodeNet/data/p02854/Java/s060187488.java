import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		long[] sum = new long[N+1];
		for(int i = 0;i < N;i++) {
			long k = scn.nextLong();
			A[i] = k;
			sum[i+1] = sum[i]+k;
		}
		long L = sum[N];
		long b = L/2;
		long ans = Long.MAX_VALUE;
		int p = 0;
		for(int i=0;i<N+1;i++) {
			if(sum[i] > b) {
				p=i;
				break;
			}
		}
		ans = Math.min((L-2*sum[p-1]), 2*sum[p]-L);
		System.out.println(ans);
	}

}
