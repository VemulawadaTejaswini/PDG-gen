import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		int Q=sc.nextInt();
		long[] d=new long[K];
		long[] n=new long[Q];
		long[] x=new long[Q];
		long[] m=new long[Q];
		for(int i=0;i<K;++i) {
			d[i]=sc.nextLong();
		}
		for(int i=0;i<Q;++i) {
			n[i]=sc.nextLong();
			x[i]=sc.nextLong();
			m[i]=sc.nextLong();
		}
		
		PrintWriter pw=new PrintWriter(System.out);
		for(int q=0;q<Q;++q) {
			long[] sum=new long[K];
			for(int i=0;i<K;++i) {
				long add=d[i]%m[q];
				if(add==0)add=m[q];
				sum[i]=(i>0?sum[i-1]:0)+add;
			}
			long all=sum[K-1];
			long first=x[q];
			long last=x[q]+sum[(int)((n[q]-2)%K)]+all*((n[q]-2)/K);
			long ans=(last/m[q]*m[q]-first/m[q]*m[q])/m[q];
			pw.println(n[q]-1-ans);
		}
		pw.close();
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
