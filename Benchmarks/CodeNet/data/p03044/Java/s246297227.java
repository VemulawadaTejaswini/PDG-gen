
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	static int n ;
	static List<ArrayList<Edge>> Node;
	static int []colar;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		
		Node = new ArrayList<ArrayList<Edge>>();
		colar = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			Node.add(new ArrayList<Edge>());
		}
		
		for(int i = 0 ;i < n-1 ;i++) {
			int v = Integer.parseInt(sc.next());
			int u = Integer.parseInt(sc.next());
			int l = Integer.parseInt(sc.next());
			
			Node.get(v-1).add(new Edge(u-1,l));
			Node.get(u-1).add(new Edge(v-1,l));
		}
		for(int i = 0 ; i < n ;i++) {
			colar[i] = -1;						//まだ色を塗っていないとして初期化
		}
		
		colar[0] = 0;							//原点をまずは色を塗る
		dfs(0);
		
		for(int i = 0 ; i < n ;i++) {
			System.out.println(colar[i]);
		}

	}
	
	static void dfs(int from) {
		
		for(Edge e: Node.get(from)) {
			if(colar[e.getTo()] != -1) {
				continue;
			}
			if(e.getLength() % 2 == 0) {
				colar[e.getTo()] = colar[from];
				dfs(e.getTo());
			}
			else {
				colar[e.getTo()] =(colar[from] + 1)%2;
				dfs(e.getTo());
			}
		}
	}

}



class Edge{
	private int to ;
	private int lenght;
	
	public Edge( int to , int lenght) {
		this.to = to;
		this.lenght = lenght;
	}
	public int getTo() {
		return to;
	}
	public int getLength() {
		return lenght;
	}
	
}
