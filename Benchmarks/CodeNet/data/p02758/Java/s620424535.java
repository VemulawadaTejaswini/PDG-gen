import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static boolean [] visited;
	static ArrayList<Integer>[] adj;
	static int MOD = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Robot[] a = new Robot[n];
		for(int i=0;i<n;i++) {
			a[i] = new Robot(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(a);
		adj = new ArrayList[n];
		for(int i=0;i<n;i++) {
			adj[i]= new ArrayList<>();
		}
		int currIndex =0;
		TreeSet<Integer> active = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if( a[o1].x+a[o1].d-a[o2].x-a[o2].d !=0) {
					return a[o1].x+a[o1].d-a[o2].x-a[o2].d;
				}
				return a[o1].x-a[o2].x;
			}
			
		});
		TreeSet<Integer> order = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return a[o1].x-a[o2].x;
			}
			
		});
		for(int i=0;i<n;i++) {
			int currPos = a[i].x;
			while(!active.isEmpty()) {
				int temp = active.first();
				if((a[temp].x+a[temp].d)<=currPos) {
					active.remove(temp);
					order.remove(temp);
				}
				else {
					break;
				}
			}
			if(order.size()>0) {
				//assign active.last()
				int add = order.last();
				adj[add].add(i);
				adj[i].add(add);
			}
			active.add(i);
			order.add(i);
		}
		visited = new boolean[n];
		long prod = 1;
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				long mult = dfs(i);
				prod*=mult;
				prod%=MOD;
			}
		}
		System.out.println(prod);
		
	}
	private static long dfs(int i) {
		// TODO Auto-generated method stub
		visited[i]= true;
		long prod = 1;
		for(int next : adj[i]) {
			if(!visited[next]) {
				prod*=dfs(next);
				prod%=MOD;
				
			}
		}
		prod++;
		return prod;
		
	}
	static class Robot implements Comparable<Robot>{
		int x;
		int d;
		public Robot(int x,int d) {
			this.x = x;
			this.d = d;
		}
		@Override
		public int compareTo(Robot o) {
			// TODO Auto-generated method stub
			return x-o.x;
		}
	}
}
