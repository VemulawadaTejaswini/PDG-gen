

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static long x = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int n= sc.nextInt();
//		  cin >> n;
		 
		  ArrayList<node> tree = new ArrayList<>();
		  for (int i = 0; i < n; i++) {
			  tree.add(new node());
		  }
		 
		  for (int i = 0, s, t, w; i < n - 1; i++) {
//		    cin >> s >> t >> w;
		    s = sc.nextInt();
		    t = sc.nextInt();
		    w = sc.nextInt();
		 
		    tree.get(s).next.add(new edge(w, t));
		    tree.get(t).next.add(new edge(w, s));
		  }
		 
		  solve(tree, 0);
//		  cout << tree.get(0).diameter << endl;
		 System.out.println(tree.get(0).diameter);
	}

	
	static class edge {
		  int weight;
		  int nodeIdx;
		  edge(int w, int i) {
		    weight = w;
		    nodeIdx = i;
		  }
		}
		 
	static class node {
		  ArrayList<edge> next = new ArrayList<>();
		  int height;
		  int diameter;
		  boolean visited;
		 
		  node() {
		    height = 0;
		    diameter = 0;
		    visited = false;
		  }
		}
		 
		static void solve(ArrayList<node> tree, int idx) {
		  //cout << "called for node: " << idx << endl;
		  // if (tree.get(idx).visited) return;
		  tree.get(idx).visited = true;
		 
		  int bestHeight  = 0, bestHeight2 = 0, bestDiameter = 0;
		 
		  for (int i = 0; i < tree.get(idx).next.size(); i++) {
		    int nextIdx = tree.get(idx).next.get(i).nodeIdx;
		    if (tree.get(nextIdx).visited) continue;
		 
		    //cout << idx << " next-> " << nextIdx << endl;
		    solve(tree, nextIdx);
		 
		    bestDiameter = Math.max(bestDiameter, tree.get(nextIdx).diameter);
		    int h = tree.get(nextIdx).height + tree.get(idx).next.get(i).weight;
		 
		    if (h > bestHeight) {
		      bestHeight2 = bestHeight;
		      bestHeight = h;
		    } else if (h > bestHeight2) {
		      bestHeight2 = h;
		    }
		  }
		 
		  tree.get(idx).height = bestHeight;
		  tree.get(idx).diameter = Math.max(bestDiameter, bestHeight + bestHeight2);
		  //cout << "Node: " << idx << " H: " << tree.get(idx).height << " D: " << tree.get(idx).diameter << " bestDiameter: " << bestDiameter << endl << endl;
		}
}

