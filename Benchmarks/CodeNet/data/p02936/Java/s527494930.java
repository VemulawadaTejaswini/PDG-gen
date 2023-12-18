
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  int n = sc.nextInt();
	  int q = sc.nextInt();
	  int[] val = new int[n+1];
	  
	  HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();
	  // tree.put(1, new ArrayList<Integer>());
	  
	  for (int i = 1; i < n; i++) {
		  int r = sc.nextInt();
		  int c = sc.nextInt();
		  
		  for (int j = 1; j <= n; j++) {
			  if (j == r) {
				  if (!tree.containsKey(j)) {
					  tree.put(j, new ArrayList<Integer>());
				  }
				  tree.get(j).add(c);
				  if (!tree.containsKey(c)) {
					  tree.put(c, new ArrayList<Integer>());
				  }
			  }
		  }
	  }
	  
	  for (int i = 0; i <q; i++) {
		  int node = sc.nextInt();
		  int value = sc.nextInt();
		  
		  for (int j = 1; j <= n; j++) {
			  if (j == node) {
				  val[j] += value;
				  dfs(tree, tree.get(j), val, value);
			  }
		  }
		  
	  }
	  
	  for (int i = 1; i < val.length; i++) {
		  if (i == val.length) {
			  System.out.println(val[i]);
		  } else {
			  System.out.print(val[i] + " ");
		  }
	  }
  }
  
  private static void dfs(
		  HashMap<Integer, ArrayList<Integer>> tree,
		  ArrayList<Integer> nodes,
		  int[] val,
		  int value) {
	  if (nodes.size() != 0) {
		  for (int i = 0; i < nodes.size(); i++) {
			  val[nodes.get(i)] += value;
			  dfs(tree, tree.get(nodes.get(i)), val, value);
		  }
	  }
  }
  
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
  
    String next() { 
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() { 
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
        try{
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}

class TreeNode {
	int no;
	int val;
	public TreeNode(int no, int val) {
		this.no = no;
		this.val = val;
	}
}

