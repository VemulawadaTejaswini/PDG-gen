import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

class Solve{
	Scanner in = new Scanner(System.in);
	
	int[][] cap;
	int m, n;
	boolean solve(){
		m = in.nextInt();
		n = in.nextInt();
		if(n == 0) return false;
		Node[] b = new Node[m];
		Node[] r = new Node[n];
		cap = new int[m+n+2][m+n+2];
		Node s = new Node(n+m, 0);
		Node t = new Node(n+m+1, 0);
		for(int i=0; i<m; i++){
			b[i] = new Node(i, in.nextInt());
			s.createEdge(b[i]);
			b[i].createEdge(s);
			cap[s.id][b[i].id] = 1;
		}
		for(int i=0; i<n; i++){
			r[i] = new Node(i+m, in.nextInt());
			r[i].createEdge(t);
			t.createEdge(r[i]);
			cap[r[i].id][t.id] = 1;
		}
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(gcd(b[i].val, r[j].val) == 1) continue;
				b[i].createEdge(r[j]);
				r[j].createEdge(b[i]);
				cap[i][r[j].id] = 1;
			}
		}
		int res = 0;
		while(true){
			used.clear();
			int flow = flow(s, 1);
			if(flow == 0) break;
			res += flow;
		}
		System.out.println(res);
		return true;
	}
	
	BitSet used = new BitSet();
	int flow(Node from, int flow){
		if(from.id == m+n+1) return flow;
		if(used.get(from.id)) return 0;
		used.set(from.id);
		for(Node v: from.edge){
			if(cap[from.id][v.id]==0) continue;
			int f = flow(v, Math.min(flow, cap[from.id][v.id]));
			if(f == 0) continue;
			cap[from.id][v.id] -= f;
			cap[v.id][from.id] += f;
			return f;
		}
		return 0;
	}
	
	int gcd(int a, int b){
		return b==0 ? a : gcd(b, a%b);
	}
}

class Node{
	int id;
	int val;
	ArrayList<Node> edge = new ArrayList<Node>();
	Node(int id, int val){
		this.id = id;
		this.val = val;
	}
	
	void createEdge(Node nd){
		edge.add(nd);
	}
}

public class Main{
	public static void main(String[] args){
		Solve slv = new Solve();
		while(slv.solve());
	}
}