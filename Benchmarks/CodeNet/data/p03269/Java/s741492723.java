import java.util.*;

//https://beta.atcoder.jp/contests/arc102/submissions/3118322

class Edge{
	int a,b,c;
	public Edge(int a,int b,int c){
		super();
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public String toString(){
		return a+" "+b+" "+c;
	}
}

class Main{
	static int nextBit(StringBuilder str,int idx){
		int v=str.indexOf("1",idx+1);
		return v==-1?str.length()-1:v;
	}

	public static void main(String[] $){
		int L=new Scanner(System.in).nextInt()-1;
		if(L==1){
			System.out.println("2 2\n1 2 0\n1 2 1");
			return;
		}

		int n=Integer.numberOfTrailingZeros(Integer.highestOneBit(L));
		
		StringBuilder sb=new StringBuilder();
		int[]m=new int[n+1];
		
		for(int i=n;i>=0;i--){
			m[n-i]=1<<i;
			sb.append((L&(1<<i))==0?0:1);
		}

		List<Edge> ret=new ArrayList<>();

		for(int i=1;i<=n;++i){
			ret.add(new Edge(i,i+1,0));
			ret.add(new Edge(i,i+1,m[i]));
		}

		int num=0;
		for(int i=0;i<=n;++i){
			if(sb.charAt(i)=='0')
				continue;
			num+=m[i];
			ret.add(new Edge(1,nextBit(sb,i)+1,num));
		}

		System.out.println(n+1+" "+ret.size());
		ret.forEach(System.out::println);
	}
}
