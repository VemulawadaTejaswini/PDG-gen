
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<int []> dx;
	static List<Integer>t;
	static int n,m,q;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		q = Integer.parseInt(sc.next());
		
		dx = new ArrayList <int []>();
		t = new ArrayList<Integer>();
		dfs(0,1);
		
		int []a = new int [q];
		int []b = new int [q];
		int []c = new int [q];
		int []d = new int [q];
		
		for(int i = 0 ; i < q ;i++) {
			a[i] = Integer.parseInt(sc.next())-1;
			b[i] = Integer.parseInt(sc.next())-1;
			c[i] = Integer.parseInt(sc.next());
			d[i] = Integer.parseInt(sc.next());
		}
		int ans = -1;
		
		for(int []x : dx) {
			int temp = 0;
			for(int i = 0 ; i < q ;i++) {
				if(x[b[i]] - x[a[i]] == c[i]) {
					temp += d[i];
				}
			}
			ans = Math.max(temp, ans);
		}
		
		System.out.println(ans);
		
	}
	
	static void dfs(int id, int now) {
		
		if(id == n) {
			int []px = new int [t.size()];
			for(int i = 0 ; i < t.size() ;i++) {
				px[i] = t.get(i);
			}
			dx.add(px);
			return;
		}
		
		for(int i = now ; i <= m ;i++) {
			t.add(i);
			dfs(id+1,i);
			t.remove(id);
		}
	}
}
