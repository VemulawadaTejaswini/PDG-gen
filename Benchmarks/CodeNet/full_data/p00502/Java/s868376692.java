import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int[] T = new int[D];
		for (int i = 0; i < D; i++) {
			T[i] = sc.nextInt();
		}
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		int dp[][] = new int[D][2];
		int oldmin=0,oldmax=0;
		for(int i=0;i<D;i++) {
			int min = 101;
			int max = -1;
			for(int j=0;j<N;j++) {
				if(A[j]<=T[i] && T[i]<=B[j]) {
					if (C[j]<min) {
						min=C[j];
					}
					if (C[j]>max) {
						max=C[j];
					}
				}
			}
			if(i!=0) {
				dp[i][0] = dp[i-1][0] + max(diff(min,oldmin),diff(min,oldmax));
				dp[i][1] = dp[i-1][1] + max(diff(max,oldmin),diff(max,oldmax));
			}
			//System.out.println(min+"\t"+max+"\t"+dp[i][0]+"\t"+dp[i][1]);
			oldmin=min;
			oldmax=max;
		}
		System.out.println(max(dp[D-1][0],dp[D-1][1]));
	}
	static private int max(int a, int b) {
		return a > b ? a : b;
	}
	static private int diff(int a,int b) {
		return a>b ? a-b:b-a;
	}
}