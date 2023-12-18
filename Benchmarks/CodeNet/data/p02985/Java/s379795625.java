import java.util.*;

class Main{

	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt(),k=s.nextInt();

		ArrayList<HashSet<Integer>> g=new ArrayList<>();

		for(int i=0;i<n;++i){
			g.add(new HashSet<>(1));
		}
		for(int i=0;i<n-1;++i){
			int a=s.nextInt()-1,b=s.nextInt()-1;
			g.get(a).add(b);
			g.get(b).add(a);
		}

		//System.err.println(g);
		long r=f(0,k,g,0,-1);
		System.out.println(r*k%mod);
		System.err.println(r);
	}

	private static long f(int i,int k,ArrayList<HashSet<Integer>> g,int brother,int parent){
		HashSet<Integer> h=g.get(i);
		long r=1;

		//child pattern
		{
			int c=k-(parent==-1?1:2);
			int child=h.size()-(parent==-1?0:1);
			for(int l=0;l<child;++l){
				r*=c-l;
				r%=mod;
			}
		}

		//reduction
		for(int j:h){
			if(j==parent)
				continue;
			HashSet<Integer> h2=g.get(j);
			r*=f(j,k,g,h.size(),i);
			r%=mod;
		}
		return r;
	}
}
