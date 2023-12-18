import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		{
			int n=getInt();
			dist=new long[n];
			for(int i=0;i<n;++i)edges.add(new TreeMap<>());
			for(int i=0;i<n-1;++i){
				int a=getInt()-1,b=getInt()-1;
				long c=getInt();
				edges.get(a).put(b,c);
				edges.get(b).put(a,c);
			}
		}
		{
			int q=getInt();
			dfs(-1,getInt()-1,0);
			for(int i=0;i<q;++i)
				System.out.println(dist[getInt()-1]+dist[getInt()-1]);
		}
	}

	static ArrayList<TreeMap<Integer,Long>>edges=new ArrayList<>();
	static long[]dist;
	private static void dfs(int from,int to,long l){
		dist[to]=l;
		TreeMap<Integer,Long> m=edges.get(to);
		m.remove(from);
		m.forEach((k,v)->dfs(to,k,l+v));
	}
}