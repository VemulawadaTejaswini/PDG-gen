import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Unionfind uf=new Unionfind(n);
		PriorityQueue<Long> q=new PriorityQueue<>();
		long[] a=new long[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		for(int i=0; i<m; i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			uf.unite(x,y);
		}
		long[] min=new long[n];
		int[] index=new int[n];
		Arrays.fill(min,1000000001);
		for(int i=0; i<n; i++){
			int root=uf.root(i);
			if(min[root]>a[i]){
				min[root]=a[i];
				index[root]=i+1;
			}
		}
		boolean[] o=new boolean[n];
		for(int i=0; i<n; i++){
			if(index[i]!=0){
				o[index[i]-1]=true;
			}
		}
		long ans=0;
		int count=0;
		for(int i=0; i<n; i++){
			if(min[i]!=1000000001){
				count++;
				ans+=min[i];
			}
			if(!o[i]){
				q.add(a[i]);
			}
		}
		if(count==1){
			System.out.println(0);
			return;
		}else if(count+count-2>n){
			System.out.println("Impossible");
			return;
		}
		for(int i=0; i<count-2; i++){
			ans+=q.poll();
		}
		System.out.println(ans);
	}
	static class Unionfind{
		int[] parent;
		public Unionfind(int n){
			this.parent=new int[n];
			for(int i = 0; i<n; i++){
				parent[i]=i;
			}
		}
		public int root(int t){
			if(parent[t]==t){
				return t;
			}else{
				return parent[t]=root(parent[t]);
			}
		}
		public void unite(int x,int y){
			if(same(x,y)){
				return;
			}
			int xroot = root(x);
			int yroot = root(y);
			parent[yroot]=xroot;
		}
		public boolean same(int x,int y){
			return root(x)==root(y);
		}
	}
}
