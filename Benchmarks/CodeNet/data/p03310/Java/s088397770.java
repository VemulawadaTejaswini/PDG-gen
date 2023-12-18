import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		long B[]=new long [N];
		long C=0;
		for(int i=0;i<N;i++) {
			C=C+(long)A[i];
			B[i]=C;
		}
		long abs;
		long ans=Long.MAX_VALUE;
		int d=0;
		int f=0;
		int i=0;
		for(i=1;i<N-2;i++) {
			long c=Long.MAX_VALUE;
			for(int k=0;k<i;k++) {
				abs=Math.abs(B[k]-(B[i]-B[k]));
				if(abs<c) {
					c=abs;
					d=k;
				}else {
					break;
				}
			}
			long e=Long.MAX_VALUE;
			for(int k=i+1;k<N-1;k++) {
				abs=Math.abs((B[k]-B[i])-(B[N-1]-B[k]));
				if(abs<e) {
					e=abs;
					f=k;
				}else {
					break;
				}
			}
			long g=B[d];
			long h=B[i]-B[d];
			long m=B[f]-B[i];
			long j=B[N-1]-B[f];
			long k=Math.max(Math.max(g,h),Math.max(m,j));
			long l=Math.min(Math.min(g, h), Math.min(m,j));
			if(ans>=k-l) {
				ans=k-l;
			}else {
				break;
			}
		}
	System.out.println(ans);
	}
}
