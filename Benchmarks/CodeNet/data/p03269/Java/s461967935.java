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
		Scanner s=new Scanner(System.in);
		int L=s.nextInt()-1;
		if(L==1){
			System.out.println("2 2\n1 2 0\n1 2 1");
			return;
		}

		boolean f=false;
		StringBuilder sb=new StringBuilder();
		Map<Integer,Integer> m=new HashMap<>();
		
		for(int i=20;i>=0;i--){
			boolean b=(L&(1<<i))==0;
			if(!f&&b)
				continue;
			f=true;
			m.put(sb.length(),1<<i);
			sb.append(b?0:1);
		}

		List<Edge> ret=new ArrayList<>();

		for(int i=1;i<sb.length();++i){
			ret.add(new Edge(i,i+1,0));
			ret.add(new Edge(i,i+1,m.get(i)));
		}

		int num=0;
		for(int i=0;i<sb.length();++i){
			if(sb.charAt(i)=='0')
				continue;
			num+=m.get(i);
			ret.add(new Edge(1,nextBit(sb,i)+1,num));
		}

		System.out.println(sb.length()+" "+ret.size());
		ret.forEach(System.out::println);
	}
}
