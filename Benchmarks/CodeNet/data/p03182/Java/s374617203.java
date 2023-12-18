import java.util.*;
import java.io.*;
public class Main {
	static long[] mmax=new long[812345];
	static long[] lazy=new long[812345];
	static void pushup(int x) {
		mmax[x]=Math.max(mmax[x<<1],mmax[x<<1|1]);
	}
	static void pushdown(int x) {
		long lz=lazy[x];
		if (lz!=0) {
			lazy[x]=0;
			mmax[x<<1]+=lz;
			mmax[x<<1|1]+=lz;
			lazy[x<<1]+=lz;
			lazy[x<<1|1]+=lz;
		}
	}
	static long query(int x,int L,int R,int l,int r) {
		if (l<=L&&r>=R) return mmax[x];
		pushdown(x);
		int m=(L+R)>>1;
		long ret=0;
		if (m>=l) ret=Math.max(ret,query(x<<1,L,m,l,r));
		if (m<r) ret=Math.max(ret,query(x<<1|1,m+1,R,l,r));
		pushup(x);
		return ret;
	}
	static void update(int x,int L,int R,int l,int r,long v) {
		if (l<=L&&r>=R) {
			mmax[x]+=v;
			lazy[x]+=v;
			return;
		}
		pushdown(x);
		int m=(L+R)>>1;
		if (m>=l) update(x<<1,L,m,l,r,v);
		if (m<r) update(x<<1|1,m+1,R,l,r,v);
		pushup(x);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		StringTokenizer sa=new StringTokenizer(in.readLine());
		int n=Integer.parseInt(sa.nextToken());
		int m=Integer.parseInt(sa.nextToken());
		ArrayList<Long>[] G=new ArrayList[n+1];
		for (int i=1;i<=n;++i) G[i]=new ArrayList<Long>();
		for (int i=0;i<m;++i) {
			sa=new StringTokenizer(in.readLine());
			int l=Integer.parseInt(sa.nextToken());
			int r=Integer.parseInt(sa.nextToken());
			int a=Integer.parseInt(sa.nextToken());
			if (a>=0) G[r].add(a*300000L+l);
			else G[r].add(a*300000L-l);
		}
		for (int i=1;i<=n;++i) {
			long tmp=query(1,1,n,1,i);
			update(1,1,n,i,i,tmp);
			for (int j=0;j<G[i].size();++j) {
				int l=(int)(G[i].get(j)%300000);
				long v=G[i].get(j)/300000;
				if (l<0) l=-l;
				update(1,1,n,l,i,v);
			}
		}
		out.println(Math.max(0L,mmax[1]));
		out.close();
	}
}