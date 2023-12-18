import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer(br.readLine());
        int N =Integer.parseInt(in.nextToken());
        int M =Integer.parseInt(in.nextToken());
        in = null;
		int[] arr = new int[N+1];
		HashSet<Integer> rootNodes = new HashSet<Integer>();

		for (int i = 0; i < M; i++) {
			in=new StringTokenizer(br.readLine());
			int x = Integer.parseInt(in.nextToken());
			int y = Integer.parseInt(in.nextToken());
			if (find(arr, x) != find(arr, y)) {
				union(arr, x, y);
			}
		}
		for (int i = 1; i <= N; i++) {
			rootNodes.add(find(arr, i));
		}

		System.out.print(rootNodes.size());


	}

	static int find(int[] parent, int i) {
	    if (parent[i] == 0) {
	        return i;
	    }
	    return find(parent, parent[i]);
	}

	// Naive implementation of union()
	static void union(int[] parent, int x, int y) {
	    int xset = find(parent, x);
	    int yset = find(parent, y);
	    parent[xset] = yset;
	}

}
