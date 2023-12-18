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
		B[0]=A[0];
		for(int i=1;i<N;i++) {
			B[i]=B[i-1]+A[i];
		}
		int o=1;
		long p=Long.MAX_VALUE;
		while(o<N-2) {
			long c=Long.MAX_VALUE;
			int d=0;
			for(int i=0;i<o;i++) {
				if(Math.abs(B[i]-(B[o]-B[i]))<c) {
					c=Math.abs(B[i]-(B[o]-B[i]));
					d=i;
				}
			}
			long e=Long.MAX_VALUE;
			int f=0;
			for(int i=o+1;i<N-1;i++) {
				if(Math.abs((B[i]-B[o])-(B[N-1]-B[i]))<e) {
					e=Math.abs((B[i]-B[o])-(B[N-1]-B[i]));
					f=i;
				}
			}
			int g=B[d];
			int h=B[o]-B[d];
			int i=B[f]-B[o];
			int j=B[N-1]-B[f];
			int k=Math.max(Math.max(g,h),Math.max(i,j));
			int l=Math.min(Math.min(g, h), Math.min(i,j));
			if(p>=k-l) {
				p=k-l;
			}
			o=o+1;
		}
		System.out.println(p);
	}
}