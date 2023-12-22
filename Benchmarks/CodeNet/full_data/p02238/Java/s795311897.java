import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
//import java.util.EmptyStackException;

public class Main {
	static int m=0;
	public static void dfs(Node v,int n,Stack<Node> previsit) {
		//System.out.println(previsit);
		//if (v.visit && previsit.empty()) {
		//	v.end = n;
		//	m=n;
			//System.out.println(v);
			//System.out.println("oooooo");
		//	return;
		//}
		//System.out.println(previsit);
		if (v.visit) {
			//System.out.println(previsit);
			for (int i =0;i<v.adjecent.size();i++) {
				if (!v.adjecent.get(i).visit) {
					previsit.push(v);
					dfs(v.adjecent.get(i),n,previsit);
					return;
				}
			}
			v.end = n;
			//System.out.println(v);
			//previsit.pop();
			//if (previsit.size()<=1) {
			//	previsit.peek().end=n+1;
			//}
			//else {
			if (!previsit.empty()) {	
				dfs(previsit.pop(),n+1,previsit);
				return;
			}
			else {
				m=n;
				return;
			}
			//if (previsit.empty()) {
			//	System.out.println("oooooo");
			//	return;
			//}
			
		}
		else {
			previsit.push(v);
			v.start = n;
			v.visit=true;
			//System.out.println(previsit);
			if (v.adjecent.isEmpty()) {
				v.end=n+1;
				//System.out.println(v);
				previsit.pop();
				if (!previsit.empty()) {
				    dfs(previsit.pop(),n+2,previsit);
				    return;
				}
			}
			else {
				for (int i =0;i<v.adjecent.size();i++) {
					if (!(v.adjecent.get(i).visit)) {
						dfs(v.adjecent.get(i),n+1,previsit);
						return;
					}
				}
				v.end=n+1;
				//System.out.println(v);
				previsit.pop();
				if (!previsit.empty()) {
					dfs(previsit.pop(),n+2,previsit);
					return;
				}
			}
		}
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] nod = new Node[n];
		for (int i=0;i<n;i++) {
			nod[i] = new Node(i+1);
		}
		//for (Node node:nod) {
		//	System.out.println(node);
		//}
		//System.out.println(" ");
		for (int i=0;i<n;i++) {
			sc.nextInt();
			//System.out.println(a);
			int m = sc.nextInt();
			//System.out.println(m);
			for (int j=0;j<m;j++) {
				int k = sc.nextInt();
				//System.out.println(k);
				//System.out.println(nod[k-1]);
				nod[i].adjecent.add(nod[k-1]);
			}
			//for (Node node:nod) {
			//	System.out.println(node);
			//}
		}
		sc.close();
		//System.out.println("ok");
		Stack<Node> previs = new Stack<Node>();
		//previs.push(new Node(-1));
		//dfs(nod[0],1,previs);
		for (int i=0;i<nod.length;i++) {
			if (!nod[i].visit) {
				dfs(nod[i],m+1,previs);
			}
		}
		//System.out.println(1);
		for (Node node:nod) {
			//System.out.println(1);
			System.out.println(node.u+" "+node.start+" "+node.end);
		}
	}
	static class Node{
		public int u;
		public int start;
	    public int end;
	    public boolean visit;
	    public ArrayList<Node> adjecent;
	    public String toString() {
	    	return this.u+" "+this.start+" "+this.end+" "+this.visit;//+this.adjecent.toString();
	    }
	    public Node(int u) {
	    	this.u = u;
	        this.visit = false;
	        this.adjecent = new ArrayList<Node>();
	    }
	}
}
