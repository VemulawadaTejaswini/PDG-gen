
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int []p = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			p[i] = Integer.parseInt(sc.next())-1;
		}
		Unionfind uf = new Unionfind(n);
		
		for(int i = 0 ;i < m ;i++) {
			int x = Integer.parseInt(sc.next())-1;
			int y = Integer.parseInt(sc.next())-1;
			
			uf.union(x, y);
		}
		
		int ans = 0;
		
		for(int i = 0 ;i < n ;i++) {
			if(uf.root(i) == uf.root(p[i])) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
		
	}

}

class Unionfind {

	private int[] data;
	
	public Unionfind(int size) {
		this.data = new int [size];
		clear();
	}
	
	public void clear() {
		Arrays.fill(data, -1);
	}
	
	public void union(int x , int y ) {
		if((x = root(x)) != (y = root(y))) {
			if(data[y] < data[x]) {
				final int t = x;
				x = y;
				y = t;
			}
			data[x] += data[y];
			data[y] = x;
		}
	}
	
	public int root(int x) {
		if(data[x] < 0) {
			return x;
		}
		else {
			return data[x] = root(data[x]);
		}
	}
	
	public boolean same(int x, int y) {
		return root(x) == root(y);
	}
	

}

