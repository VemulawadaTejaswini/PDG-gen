import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

import static java.lang.System.*;

class Main {
	public static Random rand=new Random();

	class UnionFind{
		int[] par;
		private int[] rank;
		int size;
		public UnionFind(int n){
			par=new int[n];
			rank=new int[n];
			size=n;
			for(int i=0;i<n;i++){
				par[i]=i;
			}
		}
		public int find(int x){
			if(par[x]==x)return x;
			return par[x]=find(par[x]);
		}
		public boolean same(int x,int y){
			return find(x)==find(y);
		}
		public void unite(int x,int y){
			x=find(x);
			y=find(y);
			if(x==y)return;
			if(rank[x]<rank[y]){
				par[x]=y;
			}else{
				par[y]=x;
				if(rank[x]==rank[y])rank[x]++;
			}
			size--;
		}
	}

	public void run() {
		boolean f=true;
		Case:while(true){
			int n=sc.nextInt();
			if(n==0)return;

			UnionFind uf=new UnionFind(n);
			HashSet<?>[] days=new HashSet<?>[n];
			for(int i=0;i<n;i++){
				int k=sc.nextInt();
				HashSet<Integer> hash=new HashSet<Integer>();
				for(int j=0;j<k;j++)
					hash.add(sc.nextInt());
				days[i]=hash;
			}
			for(int d=1;d<=30;d++){
				int i=0;
				while(!days[i].contains(d) && i<n)i++;
				if(i==n)continue;
				for(int j=i+1;j<n;j++)if(days[j].contains(d))
					uf.unite(i,j);

				if(uf.size==1){
					ln(d);continue Case;
				}
			}
			ln(-1);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	// from this
//		static BufferedReader in;
//		static PrintWriter out;
//		static {
//	    	try {
//				in =new BufferedReader(new FileReader("file.in")); Project/file.in
//				out=new PrintWriter(new BufferedWriter(new FileWriter("file.out")));
//	    	} catch (IOException e) {
//				e.printStackTrace();
//			}
	//  }
	// end

	static Scanner sc=new Scanner(in);


	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(boolean o){
		return o?"YES":"NO";
	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}
	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	//depth ex A[10]…1 A[10][10]…2 exception A[0]…0 A[10][0]…1 A[0][0]…0
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
		}
		return sb.toString();
	}
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}