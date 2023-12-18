import java.util.*;
public class Main {
	static int[] f=new int[112345];
	static long[] sz=new long[112345];
	static int[] can=new int[112345];
	static int[] tot=new int[112345];
	public static class edge implements Comparable<edge> {
		int u,v,w;
		@Override
		public int compareTo(edge o) {
			return w-o.w;
		}
	}
	public static int F(int x) {
		return x==f[x]?x:(f[x]=F(f[x]));
	}
	public static void U(int x,int y,int w) {
		int fx=F(x),fy=F(y);
		if (fx==fy) {
			++tot[fx];
			if (w<=sz[fx]) can[fx]=tot[fx];
			return;
		}
		sz[fx]+=sz[fy];
		f[fy]=fx;
		tot[fx]+=tot[fy]+1;
		if (w<=sz[fx]) can[fx]=tot[fx]+tot[fy];
		else can[fx]+=can[fy];
		return;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		edge[] e=new edge[m];
		for (int i=1;i<=n;++i) {
			sz[i]=in.nextLong();
			f[i]=i;
		}
		for (int i=0;i<m;++i) {
			e[i]=new edge();
			e[i].u=in.nextInt();
			e[i].v=in.nextInt();
			e[i].w=in.nextInt();
		}
		Arrays.sort(e,0,m);
		for (int i=0;i<m;++i) U(e[i].u,e[i].v,e[i].w);
		System.out.println(tot[F(1)]-can[F(1)]);
	}
}