import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		// 
		long ret = K;
		String bin = Long.toBinaryString(K);
		for(int i=0;i<bin.length();i++) {
			if (check(A,bin.length()-1-i)==1) {
				long temp = ret | (1 << bin.length()-1-i);
				if (temp <= K) {
					ret = temp;
				}
			}
			else ret = ret & ~(1 << bin.length()-1-i);
		}
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum += ret^A[i];
		}
		System.out.println(sum);
	}
	
	public static int check(long[] a, int idx) {
		long c1 = 0;
		long c0 = 0;
		for(int i=0; i<a.length;i++) {
			// idxbitが1
			if(((a[i]&(1<<idx))!=0)) c1++;
			else c0++;
		}
		if (c1 >= c0) return 0;
		else return 1;
	}
}