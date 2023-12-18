import java.util.*;
import java.io.*;
public class Main {
	static long[] mmax=new long[812345];
	static long[] lazy=new long[812345];
	static void pushup(int x) {
		mmax[x]=Math.max(mmax[x<<1],mmax[x<<1|1]);
	}
	static void pushdown(int x) {
		mmax[x<<1]+=lazy[x];
		lazy[x<<1]+=lazy[x];
		mmax[x<<1|1]+=lazy[x];
		lazy[x<<1|1]+=lazy[x];
		lazy[x]=0;
	}
	static void update(int x,int L,int R,int l,int r,long v) {
		if (l<=L&&r>=R) {
			mmax[x]+=v;
			lazy[x]+=v;
			return;
		}
		pushdown(x);
		int m=(L+R)>>1;
		if (l<=m) update(x<<1,L,m,l,r,v);
		if (m<r) update(x<<1|1,m+1,R,l,r,v);
		pushup(x);
	}
	static long query(int x,int L,int R,int l,int r) {
		if (l<=L&&r>=R) return mmax[x];
		pushdown(x);
		int m=(L+R)>>1;
		long ret=0;
		if (l<=m) ret=Math.max(ret,query(x<<1,L,m,l,r));
		if (m<r) ret=Math.max(ret,query(x<<1|1,m+1,R,l,r));
		pushup(x);
		return ret;
	}
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		in.nextToken();
		int m=(int)in.nval;
		ArrayList<Long>[] eve=new ArrayList[n+1];
		for (int i=1;i<=n;++i)
			eve[i]=new ArrayList();
		for (int i=0;i<m;++i) {
			in.nextToken();
			int l=(int)in.nval;
			in.nextToken();
			int r=(int)in.nval;
			in.nextToken();
			long a=(long)in.nval;
			if (a>0) eve[r].add(2000000000L*l+a);
			else eve[r].add(-2000000000L*l+a);
		}
		for (int i=1;i<=n;++i) {
			long tmp=Math.max(0L,query(1,0,n,0,i-1));
			update(1,0,n,i,i,tmp);
			for (int j=0;j<eve[i].size();++j) {
				int l=(int)(Math.abs(eve[i].get(j))/2000000000);
				long w=eve[i].get(j)%2000000000;
				if (w>1000000000) w-=2000000000;
				update(1,0,n,l,i,w);
			}
		}
		out.println(Math.max(0L,mmax[1]));
		out.flush();
	}
}