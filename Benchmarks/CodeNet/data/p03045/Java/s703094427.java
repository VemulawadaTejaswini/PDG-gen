
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		Unionfind un = new Unionfind(n+1);
		
		
		for(int i = 0 ;i < m ;i++) {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			int z = Integer.parseInt(sc.next());
			un.union(x, y);
		}
		
		for(int i = 1  ;i <= n ;i++) {
			if(!hs.contains(un.root(i))) {
				hs.add(un.root(i));
			}
		}
		
		int ans = hs.size();
		
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

