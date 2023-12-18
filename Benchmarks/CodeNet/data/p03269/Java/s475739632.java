import java.util.*;

// https://beta.atcoder.jp/contests/arc102/submissions/3118322

class Edge{
	int a,b,c;
	public Edge(int A,int B,int C){
		a=A;
		b=B;
		c=C;
	}
	@Override
	public String toString(){
		return a+" "+b+" "+c;
	}
}

class Main{
	static int nextBit(BitSet sb,int idx,int n){
		int v=sb.nextSetBit(idx);
		return v==-1?n:v;
	}

	public static void main(String[] $){
		int L=new Scanner(System.in).nextInt()-1;
		if(L==1){
			System.out.println("2 2\n1 2 0\n1 2 1");
			return;
		}

		int n=Integer.numberOfTrailingZeros(Integer.highestOneBit(L));

		BitSet sb=new BitSet();

		for(int i=n;i>=0;i--){
			sb.set(n-i,(L&(1<<i))>0);
		}

		List<Edge> ret=new ArrayList<>();

		for(int i=1;i<=n;++i){
			ret.add(new Edge(i,i+1,0));
			ret.add(new Edge(i,i+1,1<<(n-i)));
		}

		int num=0;
		for(int i=0;i<=n;++i){
			if(!sb.get(i))
				continue;
			num+=1<<(n-i);
			ret.add(new Edge(1,nextBit(sb,i+1,n)+1,num));
		}

		System.out.println(n+1+" "+ret.size());
		ret.forEach(System.out::println);
	}
}
