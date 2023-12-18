import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt()%mod;

		int[]a=new int[n],b=new int[n];
		for(int i=0;i<n;++i)
			a[i]=b[i]=b[i]=s.nextInt();

		Arrays.sort(b);
		for(int i=0;i<n-i-1;++i) {
			int t=b[i];
			b[i]=b[n-i-1];
			b[n-i-1]=t;
		}

		long r=f(n,a);
		long q=f(n,b);


		long d=q-r;

		/*
		System.err.println(r);
		System.err.println(q);
		System.err.println();
		System.err.println(r+q*2);
		System.err.println(r+q*2+q*3);
		System.err.println(r+r*2+d);
		System.err.println(r+r*2+d+r*3+d*2);
		*/

		long res=k*(k+1L)/2%mod*q%mod+mod-d*k%mod;
		System.out.println(res%mod);
	}

	private static long f(int n,int[] a){
		int r=0;
		for(int i=0;i<n;++i)
			for(int j=i+1;j<n;++j)
				if(a[i]>a[j])
					++r;
		return r;
	}
}
