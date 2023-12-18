
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n;
	static List<ArrayList<Edge>> g;
	static int[] ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		g = new ArrayList();
		for(int i = 0 ;i < n ;i++) {
			g.add(new ArrayList<Edge>());
		}
		
		for(int i = 0 ;i < n-1 ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			
			g.get(a).add(new Edge(i,b));
			g.get(b).add(new Edge(i,a));
			
		}
		
		ans = new int [n-1];
		
		dfs(0 ,-1 ,-1);
		int max = 0;
		
		for(int temp : ans) {
			max = Math.max(max, temp);
		}
		
		System.out.println(max);
		
		for(int c : ans) {
			System.out.println(c);
		}
		
		
	}
	
	static void dfs(int to , int color , int parents) {
		int k = 1 ; 
		for(Edge e : g.get(to)) {
			if(e.to == parents) continue;   //自身の親へ行こうとするときは考えない
			if(k == color) k++;              //自身の色と塗ろうとしている色が同じなら違う色にする
			ans[e.id] = k;                   //考えている辺の相手側の色を決める
			dfs(e.to , k , to);              //その相手側を自身の立場に置き換えて再度考える
			k++;                             //複数の相手に対して異なる色で塗る
			
		}
	}
	
	}
class Edge{
	
	 Edge(int id, int to){
		 this.id = id;
		 this.to = to;
	 }
	 
	 int id;
	 int to;
}


