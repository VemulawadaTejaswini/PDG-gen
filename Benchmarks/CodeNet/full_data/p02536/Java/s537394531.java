import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		tree = new int [N];
		Arrays.fill(tree, -1);
		for (int i = 0; i < M; i++)union(Integer.parseInt(sc.next()) - 1, Integer.parseInt(sc.next()) - 1);
		int yono = -1;
		for(int i = 0 ; i < N ; i++){
			if(!al.contains(root(i))){
				al.add(root(i));
				yono++;
			}
		}
		ou.println(yono);
		ou.flush();
	}
	
	static int[] tree;
	static void union(int x, int y) {
		x = root(x);
		y = root(y);
		if(x != y) {
			if(tree[x] < tree[y]) {
				x ^= y; y ^= x; x^= y;
			}
			tree[x] += tree[y];
			tree[y] = x;
		}
	}
	static boolean find(int x, int y) {
		return root(x) == root(y);
	}
	static int root(int x) {
		return tree[x] < 0 ? x : (tree[x] = root(tree[x]));
	}
}