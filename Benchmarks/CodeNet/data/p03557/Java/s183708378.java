import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		int[] A=new int[N];
		int[] B=new int[N];
		int[] C=new int[N];

		for(int i=0; i<N; i++) {
			A[i]=sc.nextInt();
		}

		for(int i=0; i<N; i++) {
			B[i]=sc.nextInt();
		}

		for(int i=0; i<N; i++) {
			C[i]=sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long kotae=0;
		long[] sita=new long[N];

		for(int i=0; i<N; i++) {
			sita[i]=upperBound(C,B[i]);
			if(sita[i]!=-1) {
				sita[i]=N-sita[i];
			}
			else if(sita[i]==-1) {
				sita[i]=0;
			}
		}
		for(int i=N-1; i>0; i--) {
			sita[i-1]=sita[i-1]+sita[i];
			//System.out.println(sita[i-1]);
		}
		for(int i=0; i<N; i++) {
			int ub=upperBound(B,A[i]);
			if(ub!=-1) {
				kotae+=sita[ub];
			}
			else if(ub==-1) {
				//
			}
		}
		System.out.println(kotae);
	}
	public static final int upperBound(final int[] arr, final int value) {
		int low = 0;
		int high = arr.length;
		int mid;
		while (low < high) {
			mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
			if (arr[mid] <= value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<arr.length) {
			return low;
		}
		else {
			return -1;
		}
	}
}