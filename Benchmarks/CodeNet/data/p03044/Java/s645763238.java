import java.util.*;
import java.util.Map.*;

class Main{

	static ArrayList<HashMap<Integer,Integer>>g=new ArrayList<>();

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;++i)
			g.add(new HashMap<>(1));

		int[]r=new int[n];
		Arrays.fill(r,-1);
		r[0]=0;

		for(int i=0;i<n-1;++i) {
			int a=s.nextInt()-1,b=s.nextInt()-1,w=s.nextInt()%2;
			g.get(a).put(b,w);
			g.get(b).put(a,w);
		}

		f(0,r);
		Arrays.stream(r).forEach(System.out::println);
	}

	private static void f(int i,int[] r){
		for(Entry<Integer,Integer> o:g.get(i).entrySet()) {
			int t=o.getKey();
			if(r[t]<0) {
				r[t]=(r[i]+o.getValue())%2;
				f(t,r);
			}
		}
	}
}