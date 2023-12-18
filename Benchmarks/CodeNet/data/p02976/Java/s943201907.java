import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph1 g = new graph1(n);
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			d.add(i);
		}
		for(int i=0;i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			g.addEdge(x, y);
		}
		if(m%2==1) {
			System.out.println("-1");
		}
		else {
			g.edges(d);
		}
	}
}
class graph1 {
	int V;
	static LinkedList<Integer> adjList[];
	graph1(int V){
		this.V = V;
		adjList = new LinkedList[V];
		for(int i=0;i<V;i++) {
			adjList[i]= new LinkedList<Integer>();
		}
		
	}
	public  void addEdge(int a, int b) {
		adjList[a-1].add(b-1);
		adjList[b-1].add(a-1);
	}
	public void edges(ArrayList<Integer> d) {
		for(int i=0;i<d.size();i++) {
			if(d.get(i)!=-1) {
			if(adjList[d.get(i)].size()%2==1) {
			for(int j=0;j<adjList[d.get(i)].size()-1;j++) {
				System.out.println((d.get(i)+1)+" "+(adjList[d.get(i)].get(j)+1));
				//int k = d.indexOf(adjList[d.get(i)].get(j));
				//d.set(k, -1);
				if(d.indexOf(adjList[d.get(i)].get(j))!=-1) {
					d.set(d.indexOf(adjList[d.get(i)].get(j)), -1);
				}
			}
			
			}
			else {
				for(int j=0;j<adjList[d.get(i)].size();j++) {
					System.out.println((d.get(i)+1)+" "+(adjList[d.get(i)].get(j)+1));
					if(d.indexOf(adjList[d.get(i)].get(j))!=-1) {
						d.set(d.indexOf(adjList[d.get(i)].get(j)), -1);
					}
					
				}
			}
	}
		}
}
}