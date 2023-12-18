import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long re = 0;
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i]= sc.nextInt();
		}
		long k = ((K+1)*K/2)%1000000007;
		long kminus1 = ((K-1)*K/2)%1000000007;
		for (int i=0;i<N;i++) {
			long aftcount =0;
			long befcount=0;
			for (int j=i+1;j<N;j++) {
				if (A[i]>A[j]) {
					aftcount++;
				}
			}
			for (int j=0;j<i;j++) {
				if (A[i]>A[j]) {
					befcount++;
				}
			}
			re = (re+(k*aftcount))%1000000007;
			re = (re+((kminus1)*befcount))%1000000007;
		}
		System.out.println(re);
	}
}