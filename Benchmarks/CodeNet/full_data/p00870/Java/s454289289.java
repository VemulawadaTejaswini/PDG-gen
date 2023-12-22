import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Search of Concatenated Strings
public class Main{
	
	long modpow(long x, long n, long M){
		long res = 1;
		while(n>0){
			if((n&1)>0)res = res*x%M;
			x = x*x%M;
			n>>=1;
		}
		return res;
	}
	
//	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		long P = 107, MOD = 1000000000;
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m)==0)break;
			String[] e = new String[n];
			for(int i=0;i<n;i++)e[i]=sc.next();
			long[] h = new long[n];
			for(int j=0;j<n;j++){
				long H = 0, L = e[j].length();
				for(int i=0;i<L;i++)H=(H*P+e[j].charAt(i))%MOD;
				h[j] = H;
			}
//			debug(h);
			StringBuilder sb = new StringBuilder();
			while(m--!=0)sb.append(sc.next());
			String s = sb.toString();
			int N = s.length();
			boolean[][] t = new boolean[N][n];
			for(int j=0;j<n;j++){
				int L = e[j].length();
				if(N<L)continue;
				long H = 0;
				for(int i=0;i<L;i++)H=(H*P+s.charAt(i))%MOD;
//				System.out.println(H+" "+h[j]);
				if(h[j]==H&&s.startsWith(e[j]))t[L-1][j] = true;
				for(int i=L;i<N;i++){
					H = (H-(s.charAt(i-L)*modpow(P, L-1, MOD))%MOD+MOD)%MOD;
					H = (H*P+s.charAt(i))%MOD;
					if(h[j]==H&&s.startsWith(e[j], i-L+1))t[i][j]=true;
				}
			}
//			for(int j=0;j<n;j++)for(int i=0;i<N;i++)if(t[i][j])System.out.println(e[j]+" at "+(i-e[j].length()+1));
//			for(int i=0;i<N;i++)for(int j=0;j<n;j++){
//				if(s.startsWith(e[j], i))t[i+e[j].length()-1][j] = true;
//			}
			List<boolean[]> l = new LinkedList<boolean[]>();
			boolean[] H = new boolean[1<<n];
			H[0] = true;
			l.add(H);
			int res = 0;
			for(int i=0;i<N;i++){
				boolean[] f = new boolean[1<<n];
				f[0] = true;
				for(int S=1;S<1<<n;S++){
					for(int j=0;j<n;j++){
						if(t[i][j]&&((S>>j)&1)>0){
							boolean[] p = l.get(l.size()-e[j].length());
							if(p[S-(1<<j)]){
								f[S] = true; break;
							}
						}
					}
				}
				if(f[(1<<n)-1])res++;
				l.add(f);
				if(20<l.size())l.remove(0);
			}
			System.out.println(res);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}