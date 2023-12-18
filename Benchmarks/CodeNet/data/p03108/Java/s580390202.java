import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ", 2);
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int[] arrA = new int[m];
		int[] arrB = new int[m];
		for (int i = 0; i < m; i++) {
			String[] line = br.readLine().split(" ", 2);
			arrA[i] = Integer.parseInt(line[0]) - 1;
			arrB[i] = Integer.parseInt(line[1]) - 1;
		}
		long x = getCount(n);
		StringBuilder sb = new StringBuilder();
		sb.insert(0, "\n").insert(0, x);
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = m - 1; i >= 1; i--) {
			if (x != 0) {
				if (!uft.same(arrA[i], arrB[i])) {
					x += getCount(uft.getCount(arrA[i])) + getCount(uft.getCount(arrB[i]));
					uft.union(arrA[i], arrB[i]);
					x -= getCount(uft.getCount(arrA[i]));
				}
			}
			sb.insert(0, "\n").insert(0, x);
		}
		System.out.print(sb);
	}
	
	static long getCount(long x) {
		return x * (x - 1) / 2L;
	}
	
	static class UnionFindTree {
		int[] parent;
		int[] count;
		
		public UnionFindTree(int size) {
			parent = new int[size];
			count = new int[size];
			for (int i = 0; i < size; i++) {
				parent[i] = i;
				count[i] = 1;
			}
		}
		
		public int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				int v = find(parent[x]);
				parent[x] = v;
				return v;
			}
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public int getCount(int x) {
			return count[find(x)];
		}
		
		public void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			parent[rootX] =  rootY;
			count[rootY] += count[rootX];
		}
	}
}
