import java.util.*;
import java.lang.*;
import java.io.*;

public class E {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	public Solution() {
		scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			// int T = Integer.parseInt(scanner.nextLine());

			// for (int i=0; i<T; i++) {
				run_case();
			// }
		}
	}

    // int[] colors;
    // Map<Integer, Set<Integer>> adj;
	private void run_case() {
		String line = scanner.nextLine();
		int n = Integer.parseInt(line.split("\\s+")[0]);

        char[] s = scanner.nextLine().toCharArray();

        Bipartite bipart = new Bipartite(n);

        // build adj
        for (int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                if (s[j] < s[i]){
                    bipart.addEdge(i, j);
                    bipart.addEdge(j, i);
                }
            }
        }

        if (bipart.isBipartite()) {
            System.out.println("YES");
            for (int i=0; i<n; i++) {
                if (bipart.colors[i] < 0) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        } else {
            System.out.println("No");
        }
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}

class Bipartite {
    Map<Integer, Set<Integer>> adj;
    public int[] colors;
    int n;

    public Bipartite(int n) {
        this.n = n;
        adj = new HashMap<>();
        for (int i=0; i<n; i++) {
            adj.put(i, new HashSet<>());
        }
        colors = new int[n];
    }

    public void addEdge(int u, int v) {
        if (u < 0 || u >= n || v < 0 || v >= n) {
            System.out.println("Error on addEdge!");
        }
        adj.get(u).add(v);
    }

    public boolean isBipartite() {
        for (int i = 0; i < n; i++) {
            if (colors[i] == 0 && !dfs(i, 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int node, int color) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int next : adj.get(node)) {
            if (!dfs(next, -color)) {
                return false;
            }
        }
        return true;
    }
}
