import java.util.Scanner;
//import java.util.Random;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n=stdIn.nextInt();
		int m=stdIn.nextInt();
		
		int[] a=new int[m];
		int[] b=new int[m];
		for(int i=0;i<m;++i){
			a[i]=stdIn.nextInt();
			b[i]=stdIn.nextInt();
			a[i]--;
			b[i]--;
		}
		
		int ans=0;
		for(int i=0;i<m;++i){
			UnionFind uf=new UnionFind(n);
			for(int j=0;j<m;++j){
				if(i==j){}
				else uf.unite(a[j],b[j]);
			}
			if(uf.num>1) ans++;
		}
		
		System.out.println(ans);
	}
}

class UnionFind{
	int[] par;
	int num;
	
	UnionFind(int n){//constructor.
		par=new int[n];
		for(int i=0;i<n;++i) par[i]=-1;
		num=n;
	}
	
	void init(int n){
		par=new int[n];
		for(int i=0;i<n;++i) par[i]=-1;
		num=n;
	}
	
	int root(int x){
		if(par[x]<0) return x;
		par[x]=root(par[x]);
		return par[x];
	}
	
	int size(int x){
		return -par[root(x)];
	}
	
	boolean same(int x,int y){
		return root(x)==root(y);
	}
	
	boolean unite(int x,int y){
		x=root(x);
		y=root(y);
		if(x==y) return false;
		par[x]+=par[y];
		par[y]=x;
		num--;
		return true;
	}
}