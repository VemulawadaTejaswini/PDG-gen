import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
static int n;
static int[] c;
static int[][] a;
static int m;
static int x;
static final int INF = 999999999;
static int ans = INF;	

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		x = Integer.parseInt(sc.next());
		c = new int[n];
		a = new int[n][m];
		
		for(int i = 0; i < n ; i++) {
			c[i] = Integer.parseInt(sc.next());
			for(int j = 0 ; j < m ; j++) {
				a[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		for(int i = 0; i < n ; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(i);
			permutation(list, i);
		}
		if(ans == INF)ans = -1;
		System.out.println(ans);
	 }

	
	public static void permutation(List<Integer> list ,int last) {
		if(list.size()>= n) {
			check(list);
			return;
		}else {
			check(list);
			for(int i = last+1 ; i < n ; i++) {
				List tmp = new ArrayList(list);
				tmp.add(i);
				permutation(tmp,i);
			}
		}
		return;
	}
	
	public static void check(List<Integer> list) {
		try {
		int[] mm = new int[m];
		int cc = 0;
		for(int i : list) {
			
			cc += c[i];
			for(int j = 0 ; j < m ; j++) {
				mm[j] += a[i][j];
			}
		}
		
		for(int i = 0; i < m ; i++) {
			if(mm[i] < x) {
				cc = INF;
			}
		}
		
		ans = Math.min(ans, cc);
		}catch (Exception e) {
			System.out.println();
		}
	}
	
	
}
