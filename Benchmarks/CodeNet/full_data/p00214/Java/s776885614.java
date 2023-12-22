import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		while(true){
			int n = Integer.parseInt(scan.next());
			if(n==0) break;

			for (int i = 0; i < n; i++) {
				int m = Integer.parseInt(scan.next());
				Polygon[] tetragon = new Polygon[m];
				Line2D[][] lines = new Line2D[m][4];
				for (int j = 0; j < m; j++) {
					int[] xs = new int[4];
					int[] ys = new int[4];
					for (int j1 = 0; j1 < 4; j1++) {
						xs[j1] = Integer.parseInt(scan.next());
						ys[j1] = Integer.parseInt(scan.next());
					}
					tetragon[j] = new Polygon(xs,ys,4);
					for (int k = 0; k < 4 ; k++) {
						lines[j][k] = new Line2D.Double(xs[k], ys[k], xs[(k+1)%4], ys[(k+1)%4]);
					}
				}

				UnionFin uni = new UnionFin(m);
				for (int j = 0; j < m; j++) {
					for (int j2 = j+1; j2 < m; j2++) {
						boolean flag= false;
						if(tetragon[j].contains(tetragon[j2].xpoints[0],tetragon[j2].ypoints[0]) || tetragon[j2].contains(tetragon[j].xpoints[0],tetragon[j].ypoints[0]))
							flag=true;
						for (int k = 0; k < 4; k++) {
							for (int k2 = 0; k2 < 4; k2++) {
								if(lines[j][k].intersectsLine(lines[j2][k2])) flag=true;
							}
						}
						if(flag) uni.unite(j, j2);
					}
				}
				out.println(uni.num);
			}
		}
		out.flush();
	}
}

class UnionFin {

	int[] par;
	int[] rank;
	int num;

	UnionFin(int n){
		num=n;
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
		num--;
	}

	boolean isSame(int x,int y){
		return root(x)==root(y);
	}
}