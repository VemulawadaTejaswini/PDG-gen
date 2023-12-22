import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int ans = 0;
			
			int V = sc.nextInt();
			int d = sc.nextInt();
			int[] F = new int[V+1];
			F[0] = 1;
			F[1] = 2;
			for(int i=2;i<=V;i++) {
				F[i] = (F[i-1] + F[i-2]) % 1001;
			}
			UnionFind u = new UnionFind(V);
			for(int i=1;i<=V-1;i++) {
				for(int j=i+1;j<=V;j++) {
					if (Math.abs(F[i]-F[j])<d) {
						u.union(i-1, j-1);
					}
				}
			}
			System.out.println(u.groupNum());
		}
	}
}
class UnionFind {
	private int[] data;
	public UnionFind(int size) {
		data = new int[size];
		Arrays.fill(data, -1);
	}
	public void union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (data[y] < data[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			data[x] += data[y];
			data[y] = x;
		}
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	private int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}
	public int size(int x) {
		return -data[root(x)];
	}
	public int groupNum() {
		int num = 0;
		for(int x:data) {
			if (x<0) {
				num++;
			}
		}
		return num;
	}
	public String toString() {
		return Arrays.toString(data);
	}
}