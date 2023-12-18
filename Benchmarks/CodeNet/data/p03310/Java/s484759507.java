import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int [N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		int B[]=new int [N];
		int C=0;
		for(int i=0;i<N;i++) {
			C=C+A[i];
			B[i]=C;
		}
		int abs;
		long ans=Long.MAX_VALUE;
		for(int i=1;i<N-2;i++) {
			long c=Long.MAX_VALUE;
			int d=0;
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
			int f=0;
			for(int k=i+1;k<N-1;k++) {
				abs=Math.abs((B[k]-B[i])-(B[N-1]-B[k]));
				if(abs<e) {
					e=abs;
					f=k;
				}else {
					break;
				}
			}
			int g=B[d];
			int h=B[i]-B[d];
			int m=B[f]-B[i];
			int j=B[N-1]-B[f];
			int k=Math.max(Math.max(g,h),Math.max(m,j));
			int l=Math.min(Math.min(g, h), Math.min(m,j));
			if(ans>=k-l) {
				ans=k-l;
			}
		}
		System.out.println(ans);
	}
}
