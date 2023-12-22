import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws Exception{
		new Main().solve();
	}
	void solve(){
		Scanner sc=new Scanner(System.in);
		while(true){
		int n=sc.nextInt();//the number of nodes
		int q=sc.nextInt();//the number of operations
		if(n==0&&q==0)break;
		int[] d=new int[n];
		int[] marked=new int[n];
		marked[0]++;
		DJSet ds=new DJSet(n);
		for(int i=1;i<n;i++){
			int parent=sc.nextInt()-1;
			d[i]=parent;
		}
		int[] memo=new int[q];
		char[] j=new char[q];
		for(int i=0;i<q;i++){
			String str=sc.next();
			j[i]=str.charAt(0);
			int v=sc.nextInt()-1;
			memo[i]=v;
			if(str.equals("M"))marked[v]++;
		}
		for(int i=1;i<n;i++){
			if(marked[i]>0)continue;
			ds.setUnion(i, d[i]);
		}
		long ans=0;
		for(int i=q-1;i>=0;i--){
			if(j[i]=='Q'){
				ans+=find_ancestor(memo[i],d,marked)+1;
			}else if(j[i]=='M'){
				marked[memo[i]]--;
				if(marked[memo[i]]==0){
					ds.setUnion(memo[i],d[memo[i]]);
				}
			}
		}
		System.out.println(ans);
		}
	}
	int find_ancestor(int x,int[] d,int[] marked){
		while(marked[x]==0){
			x=d[x];
		}
		return x;
	}
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
	class DJSet{
		int n;//the number of vertices
		int[] d;
		DJSet(int n){
			this.n=n;
			d=new int[n];
			Arrays.fill(d, -1);
		}
		int root(int x){
			return d[x]<0?x:root(d[x]);
		}
		boolean setUnion(int x,int y){
			x=root(x);
			y=root(y);
			if(x!=y){
				if(x<y){
					int d=x;
					x=y;
					y=d;
				}
//				x>y
				d[y]+=d[x];
				d[x]=y;
			}
			return x!=y;
		}
		boolean same(int x,int y){
			return root(x)==root(y);
		}
		int size(int x){
			return d[root(x)]*(-1);
		}
	}
}