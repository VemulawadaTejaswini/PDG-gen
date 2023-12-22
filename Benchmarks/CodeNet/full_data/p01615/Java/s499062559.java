import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		Node[] list = new Node[n];
		for(int i = 0; i < n; i++) {
			list[i] = new Node(n);
		}
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			list[a[i]].to.add(new Edge(list[b[i]],c[i]));
			list[b[i]].ss[a[i]] = true;
			list[b[i]].to.add(new Edge(list[a[i]],c[i]));
		}
		int[] A = new int[n]; //most fast
		while(true) {
			boolean ok = true;
			IN:for(int i = 0; i < n; i++) {
				Node tmp = list[i];
				for(int j = 0; j < n; j++) {
					if(tmp.ss[j] && !tmp.as[j]) {
						ok = false;
						continue IN;
					}
				}
				for(int j = 0; j < tmp.to.size(); j++) {
					if(tmp.to.get(j).to.as[tmp.id]) continue;
					A[tmp.to.get(j).to.id] = Math.max(A[i] + tmp.to.get(j).cost,A[tmp.to.get(j).to.id]);
					tmp.to.get(j).to.as[tmp.id] = true;
				}
			}
			if(ok) break;
		}
		System.out.println(A[n-1]);
		
		
		
		
		
		
	}
	static class Node {
		boolean[] ss;
		boolean[] as;
		static int ID = 0;
		int id = ID++;
		ArrayList<Edge> to = new ArrayList<Edge>();
		ArrayList<Edge> dst = new ArrayList<Edge>();
		Node(int n) {
			ss = new boolean[n];
			as = new boolean[n];
		}
	}
	static class Edge {
		Node to;
		int cost;
		Edge(Node a, int cost) {
			this.to = a;
			this.cost = cost;
		}
	}
}