import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	final long M=998244353;
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] a=new long[N+1];
		int[] L=new int[K];
		int[] R=new int[K];
		for (int i=0;i<K;++i) {
			L[i]=sc.nextInt();
			R[i]=sc.nextInt();
		}
		a[0]=1;
		for (int i=1;i<=N;++i){
			a[i]=a[i-1];
			for (int j=0;j<K;++j) {
				if (i-L[j]>=0)   a[i]=(a[i]+a[i-L[j]])%M;
				if (i-R[j]-1>=0) a[i]=(a[i]+M-a[i-R[j]-1])%M;
			}
		}
		System.out.println((a[N-1]-a[N-2]+M)%M);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
