import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		long buf,sum = 0;
		A[0] = scn.nextLong();
		for(int i = 1;i < N;i++) {
			A[i] = A[i-1] + scn.nextLong();
		}
		sum = A[N-1];

		long P,Q = 0,R = 0,S = 0,ans = 1000000000000l,max,min;

		for(int i = 0;i < N-3;i++) {
			P = A[i];
			for(int j = i +1;j < N-2;j++) {
				Q = A[j] - P;
				for(int k = j + 1;k < N-1;k++) {
					R = A[k] - Q-P;
					S = sum-R - P - Q;
					max = Math.max(Math.max(P, Q),Math.max(R,S));
					min = Math.min(Math.min(P, Q),Math.min(R,S));
					ans = Math.min(max-min, ans);
					if(R > S)break;
					}
				if(Q > R)break;
			}
			if(P > Q)break;
		}


		System.out.println(ans);
		scn.close();
	}
}
