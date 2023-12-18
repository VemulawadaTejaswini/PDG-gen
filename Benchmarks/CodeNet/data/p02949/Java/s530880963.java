import java.util.*;
import java.util.stream.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),p=s.nextInt();

		ArrayList<ArrayList<Pair<Integer,Integer>>> g=new ArrayList<>(n);
		for(int i=0;i<n;++i)
			g.add(new ArrayList<>(1));
		for(int i=0;i<m;++i)
			g.get(s.nextInt()-1).add(new Pair<>(s.nextInt()-1,s.nextInt()));

		byte[]dfs=new byte[n];
		dfs[n-1]=1;
		dfs(0,n,dfs,g);

		long[]score=new long[n];
		ArrayDeque<Integer>q=new ArrayDeque<>();
		q.add(0);
		BitSet visited=new BitSet(n);
		for(int t=1;t<=m*2+1;++t) {
			visited.clear();
			for(int Q=q.size();Q>0;--Q) {
				int poll=q.poll();
				for(Pair<Integer,Integer> e:g.get(poll)) {
					if(score[e.a]<score[poll]+e.b-p) {
						if(t==m*2+1&&dfs[e.a]==1) {
							System.out.println(-1);
							return;
						}
						score[e.a]=score[poll]+e.b-p;
						visited.set(e.a);
					}
				}
				for(int i=visited.nextSetBit(0);i!=-1;i=visited.nextSetBit(i+1))
					q.add(i);
			}
		}
		System.out.println(IntStream.range(0,n).filter(i->dfs[i]==1).mapToLong(i->score[i]).max().getAsLong());
	}

	private static byte dfs(int i,int n,byte[] dfs,ArrayList<ArrayList<Pair<Integer,Integer>>> g){
		if(dfs[i]!=0)
			return dfs[i];
		dfs[i]=-1;
		for(Pair<Integer,Integer> e:g.get(i))
			dfs[i]=(byte)Math.max(dfs[i],dfs(e.a,n,dfs,g));
		return dfs[i];
	}
}

class Pair<A extends Comparable<A>,B extends Comparable<B>> implements Comparable<Pair<A,B>>{
	A	a;
	B	b;

	public Pair(A A,B B){
		a=A;
		b=B;
	}
	public Pair(Pair<A,B> p){
		this(p.a,p.b);
	}

	public Pair<B,A> swapped(){
		return new Pair<>(b,a);
	}

	@Override
	public String toString(){
		return "P["+a+", "+b+"]";
	}

	@Override
	public int compareTo(Pair<A,B> o){
		int v=a.compareTo(o.a);
		if(v!=0)
			return v;
		return b.compareTo(o.b);
	}

	@Override
	public int hashCode(){
		return Objects.hashCode(a)*31+Objects.hashCode(b);
	}

	@Override
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(!(obj instanceof Pair))
			return false;
		Pair<?,?> other=(Pair<?,?>)obj;
		return Objects.equals(a,other.a)&&Objects.equals(b,other.b);
	}
}
