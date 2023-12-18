
import static java.lang.System.in;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class Main {
	static final double EPS = 1e-10;
	static final double INF = 1L << 31;
	static final double PI = Math.PI;

	public static Scanner sc = new Scanner(in);
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public class UnionFind {

		  private int[] _parent;
		  private int[] _rank;


		  public int find(int i) {

		    int p = _parent[i];
		    if (i == p) {
		      return i;
		    }
		    return _parent[i] = find(p);

		  }


		  public void union(int i, int j) {

		    int root1 = find(i);
		    int root2 = find(j);

		    if (root2 == root1) return;

		    if (_rank[root1] > _rank[root2]) {
		      _parent[root2] = root1;
		    } else if (_rank[root2] > _rank[root1]) {
		      _parent[root1] = root2;
		    } else {
		      _parent[root2] = root1;
		      _rank[root1]++;
		    }
		  }


		  public UnionFind(int max) {

		    _parent = new int[max];
		    _rank = new int[max];

		    for (int i = 0; i < max; i++) {
		      _parent[i] = i;
		    }
		  }
	}

	public void run() throws IOException {
		String input;
		String[] inputArray;
		input = br.readLine();
		inputArray = input.split(" ");

		int n = Integer.valueOf(inputArray[0]);
		int m = Integer.valueOf(inputArray[1]);
		ArrayList<ArrayList<Integer>> langs = new ArrayList<ArrayList<Integer>>();
		for (int i=0; i<m; i++)
			langs.add(new ArrayList<Integer>());
		for (int i=0; i<n; i++){
			input = br.readLine();
			inputArray = input.split(" ");
			int k =  Integer.valueOf(inputArray[0]);
			for (int j=1; j<=k; j++){
				int l = Integer.valueOf(inputArray[j])-1;
				langs.get(l).add(i);
			}	
		}
		UnionFind U = new UnionFind(n);
		for (int i=0; i<m; i++){
			for (int j=1; j<langs.get(i).size(); j++)
				U.union(langs.get(i).get(0), langs.get(i).get(j));
		}
		int group = U.find(0);
		for (int i=1; i<n; i++){
			if (U.find(i)!=group){
				sb.append("NO");
				ln(sb);
				return;
			}
		}
		sb.append("YES");
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
