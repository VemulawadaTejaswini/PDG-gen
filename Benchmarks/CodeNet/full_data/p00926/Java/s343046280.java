import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Interval[] p = new Interval[m];
		for(int i=0;i<m;i++) {
			p[i] = new Interval(sc.nextInt(),sc.nextInt());
		}
		UnionFind uf = new UnionFind(m);
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
				if (p[i].intersects(p[j])) {
					uf.union(i, j);
				}
			}
		}
		ArrayList<ArrayList<Integer>> groups = uf.groups();
		int length = n + 1;
		for(ArrayList<Integer> l:groups) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int i:l) {
				Interval in = p[i];
				min = Math.min(min, in.a);
				max = Math.max(max, in.b);
			}
			length += (max - min) * 2;
		}
		System.out.println(length);
	}

}
//[a,b]
class Interval {
	int a,b;
	public Interval(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public boolean intersects(Interval i) {
		return intersects(this, i);
	}
	public static boolean intersects(Interval i,Interval j) {
		Interval temp;
		if (i.a > j.a) {
			temp = i;
			i = j;
			j = temp;
		}
		if (i.b < j.a) {
			return false;
		}
		return true;
	}
	public Interval merge(Interval i) {
		return merge(this, i);
	}
	public static Interval merge(Interval i,Interval j) {
		if (!intersects(i, j)) {
			return null;
		}
		return new Interval(Math.min(i.a,j.a), Math.max(i.b,j.b));
	}
	public String toString() {
		return "[" + a + "," + b + "]";
	}
}
class UnionFind {
	int[] root;
	Interval[] data;
	int n;

	public UnionFind(int size) {
		n = size;
		root = new int[size];
		Arrays.fill(root, -1);
	}
	public void union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (root[y] < root[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			root[x] += root[y];
			root[y] = x;
		}
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	private int root(int x) {
		return root[x] < 0 ? x : (root[x] = root(root[x]));
	}
	public int size(int x) {
		return -root[root(x)];
	}
	public ArrayList<ArrayList<Integer>> groups() {
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int r = root(i);
			if (!hm.containsKey(r)) {
				hm.put(r, g.size());
				g.add(new ArrayList<Integer>());

			}
			g.get(hm.get(r)).add(i);
		}
		return g;
	}
	public String toString() {
		return Arrays.toString(root);
	}
}