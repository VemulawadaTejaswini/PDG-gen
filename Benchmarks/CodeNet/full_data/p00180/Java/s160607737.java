import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		while(true){
			short n=scan.nextShort(),m=scan.nextShort();
			if(n==0) break;
			UnionFind uni = new UnionFind(n);
			List<edge> list = new ArrayList<edge>();
			for (int i = 0; i < m; i++)
				list.add(new edge(scan.nextShort(),scan.nextShort(),scan.nextShort()));
			Collections.sort(list);

			int res=0;
			for (int i = 0; i < m; i++) {
				edge e = list.get(i);
				if(!uni.isSame(e.from,e.to)){
					uni.unite(e.from, e.to);
					res+=e.cost;
				}
			}
			out.println(res);
		}
		out.flush();
	}
}

class edge implements Comparable {
	short from,to,cost;
	edge(short f,short t,short c){
		from=f;
		to=t;
		cost=c;
	}
	@Override
	public int compareTo(Object o) {
		return this.cost-((edge)o).cost;
	}
}

class UnionFind {

	int[] par,rank;

	UnionFind(int n){
		par = new int[n];
		rank = new int[n];
		for(int i=0;i<n;i++){
			par[i]=i;
			rank[i]=0;
		}
	}

	int root(int x){
		if(par[x]==x)
			return x;
		else
			return par[x] = root(par[x]);
	}

	void unite(int x,int y){
		x=root(x);
		y=root(y);
		if(x==y) return;

		if(rank[x]<rank[y])
			par[x]=y;
		else{
			par[y]=x;
			if(rank[x]==rank[y])
				rank[x]++;
		}
	}

	boolean isSame(int x,int y){
		return root(x)==root(y);
	}
}