import java.util.Scanner;

public class Main {

	private static final long MOD = (long) Math.pow(10, 9) + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		long cnt1 = 0;
		for(int i = 0;i < N;i++) {
			for(int j = i+1;j < N;j++) {
				if(A[i] > A[j]) {
					cnt1++;
				}
			}
		}
		long cnt2 = 0;
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < N;j++) {
				if(A[i] > A[j]) {
					cnt2++;
				}
			}
		}
		long sum2 = ((cnt2%MOD) * ((((long)K * (long)(K-1))/2)%MOD));
		long sum = ((cnt1*K) %MOD+sum2)%MOD;
		System.out.println(sum);
	}
}