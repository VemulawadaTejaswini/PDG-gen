import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]c=new int[n];
		int m=0;
		for(int i=0;i<n;++i) {
			int v=s.nextInt();
			if(i==0^v==0) {
				System.out.println(0);
				return;
			}
			m=Math.max(m,v);
			++c[v];
		}

		//System.err.println(Arrays.toString(c));

		long r=1,mod=998244353;
		for(int i=1;i<=m;++i) {
			for(int j=0;j<c[i];++j)
			r*=c[i-1];
			r%=mod;
		}
		System.out.println(r);
	}
}
