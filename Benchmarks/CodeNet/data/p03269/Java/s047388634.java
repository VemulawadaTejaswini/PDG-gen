import java.util.*;

//https://beta.atcoder.jp/contests/arc102/submissions/3118322

class Main{
	static class Edge{
		int a,b,c;

		public Edge(int a,int b,int c){
			super();
			this.a=a;
			this.b=b;
			this.c=c;
		}
	};

	static int nextBit(StringBuilder str,int idx){
		for(int i=idx+1;i<str.length();++i){
			if(str.charAt(i)=='1')
				return i;
		}
		return str.length()-1;
	}

	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		int L=s.nextInt()-1;

		if(L==1){
			System.out.println("2 2");
			System.out.println("1 2 0");
			System.out.println("1 2 1");
			return;
		}

		boolean flag=false;
		StringBuilder str=new StringBuilder();
		HashMap<Integer,Integer> m=new HashMap<>();
		for(int i=20;i>=0;i--){
			if(!flag&&(L&(1L<<i))==0) continue;
			flag=true;
			m.put(str.length(),(1<<i));
			str.append((L&(1L<<i))==0?'0':'1');
		}

		ArrayList<Edge> ret=new ArrayList<>();

		for(int i=1;i<str.length();++i){
			ret.add(new Edge(i,i+1,0));
			ret.add(new Edge(i,i+1,m.get(i)));
		}

		int num=0;
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)=='0') continue;
			num+=m.get(i);
			ret.add(new Edge(1,nextBit(str,i)+1,num));
		}

		System.out.println(str.length()+" "+ret.size());
		ret.forEach(o->System.out.println(o.a+" "+o.b+" "+o.c));
	}
}
