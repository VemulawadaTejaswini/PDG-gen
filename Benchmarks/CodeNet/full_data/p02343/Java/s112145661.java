import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		String[] str = line.split(" ");
		int n = Integer.parseInt(str[0]);
		UnionFind uf = new UnionFind(n);
		int q = Integer.parseInt(str[1]);

		for (int query=0; query<q; query++) {
			line = br.readLine();
			str = line.split(" ");
			int x = Integer.parseInt(str[1]);
			int y = Integer.parseInt(str[2]);

			if (line.startsWith("0")) {
				uf.unite(x,y);
			}else {
				System.out.println(uf.same(x,y)?"1":"0");
			}
		}

		br.close();
	}
}

class UnionFind {

	int[] node;

	UnionFind(int n){
		node = new int[n];
		for (int i=0; i<n; i++)
			node[i] = i;
	}

	int find(int x){
		if(node[x] == x)
			return x;
		return node[x] = find(node[x]);
	}

	boolean same(int x,int y){
		return find(x) == find(y);
	}

	void unite(int x,int y){
		if (find(x) == find(y))
			return;
		node[find(x)] = find(y);
	}
}