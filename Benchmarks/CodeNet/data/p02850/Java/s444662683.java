
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		node v[] = new node[N];
		edge e[] = new edge[N-1];
		for(int i=0;i<N;i++){
			v[i] = new node(i);
		}

		for(int i=0;i<N-1;i++){
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			e[i]= new edge(a,b);
			e[i].setNode(v[a-1],v[b-1]);
			v[a-1].connect(e[i]);
			v[b-1].connect(e[i]);
		}

		int K = 0;
		int root = 0;
		for(int i=0;i<N;i++){
			if(K<v[i].edges.size()){
				K = v[i].edges.size();
				root = i;
			}
		}
		v[root].paint();
		out.println(K);
		for(int i=0;i<N-1;i++){
			out.println(e[i].color);
		}
		
		sc.close();
		out.flush();
	}

}
class node{
	int id,dist;
	boolean searched = false;
	ArrayList<edge> edges;
	public node(int id){
		this.id = id;
		this.edges = new ArrayList<edge>();
	}
	public void connect(edge e){
		this.edges.add(e);
	}
	public void paint(){
		int i = 1;
		int used = 0;
		searched = true;
		for(edge e : edges){
			if(e.another(this).searched){
				used = e.color;
			}
		}
		for(edge e : edges){
			if(i != used){
				if(e.color ==0){
					e.setColor(i);
					i ++;
					e.another(this).paint();
				}
			}
			else{
				i ++;
			}
		}
	}
}

class edge{
	int id1,id2,cost;
	node v1,v2;
	int color = 0;
	public edge(int id1, int id2){
		this.id1 = id1;
		this.id2 = id2;
	}
	public void setNode(node v1,node v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	public void setColor(int color){
		this.color = color;
	}
	public void setCost(int cost){
		this.cost = cost;
	}
	public node another(node v){
		if(v == v1){
			return v2;
		}
		else{
			return v1;
		}
	}
}