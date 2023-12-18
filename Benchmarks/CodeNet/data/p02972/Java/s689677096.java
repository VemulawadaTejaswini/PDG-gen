import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		BitSet q=new BitSet(n+1),a=new BitSet(n+1);
		for(int i=1;i<=n;++i)
			q.set(i,s.nextInt()==1);

		for(int i=n;i>0;--i){
			boolean t=q.get(i);
			for(int j=i*2;j<=n;j+=i)
				t^=a.get(j);
			a.set(i,t);
		}
		System.out.println(a.cardinality());
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=n;++i)
			if(a.get(i))
				sb.append(i).append("\n");
		System.out.println(sb);
	}
}
