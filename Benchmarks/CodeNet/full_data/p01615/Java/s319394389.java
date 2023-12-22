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
			list[i] = new Node();
		}
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			list[a[i]].to.add(new Edge(list[b[i]],c[i]));
			list[b[i]].to.add(new Edge(list[a[i]],c[i]));
		}
		int[] A = new int[n]; //most fast
		int[] B = new int[n]; //most late
		for(int i = 0; i < n; i++) {
			Node tmp = list[i];
			for(int j = 0; j < tmp.to.size(); j++) {
				A[tmp.to.get(j).to.id] = Math.max(A[i] + tmp.to.get(j).cost,A[tmp.to.get(j).to.id]);
			}
		}
		B[n-1] = A[n-1];
		for(int i = n-1; i >= 1; i--) {
			Node tmp = list[i];
			for(int j = 0; j < tmp.to.size(); j++) {
				B[tmp.to.get(j).to.id] = Math.min(B[i] - tmp.to.get(j).cost, B[tmp.to.get(j).to.id]);
			}
		}
		System.out.println(A[n-1]);
		
		
		
		
		
		
	}
	static class Node {
		static int ID = 0;
		int id = ID++;
		ArrayList<Edge> to = new ArrayList<Edge>();
		ArrayList<Edge> dst = new ArrayList<Edge>();
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