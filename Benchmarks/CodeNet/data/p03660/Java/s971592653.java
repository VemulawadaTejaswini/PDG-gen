import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Main{
	public static void main(String[] args) {
		int INF=1000000007;
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt();
		Vec[] v=new Vec[V+1];
		for(int i=0; i<=V; i++) {
			v[i]=new Vec();
		}
		for(int i=0; i<V-1; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			v[a].add(b);
			v[b].add(a);
		}
		int[] Fe=new int[V+1];
		int[] Su=new int[V+1];
		boolean[] Fe_V=new boolean[V+1];
		boolean[] Su_V=new boolean[V+1];
		Arrays.fill(Fe, INF);
		Arrays.fill(Su, INF);
		Fe[1]=0;
		Su[V]=0;
		Stack<Integer> Q=new Stack<Integer>();
		Q.add(1);
		while(!Q.isEmpty()) {
			int tmp=Q.pop();
			for(int i=0; i<v[tmp].size(); i++) {
				if(!Fe_V[v[tmp].get(i)] && Fe[tmp]+1<Fe[v[tmp].get(i)]) {
					Fe_V[v[tmp].get(i)]=true;
					Fe[v[tmp].get(i)]=Fe[tmp]+1;
					Q.push(v[tmp].get(i));
				}
			}
		}

		Q.add(V);
		while(!Q.isEmpty()) {
			int tmp=Q.pop();
			for(int i=0; i<v[tmp].size(); i++) {
				if(!Su_V[v[tmp].get(i)] && Su[tmp]+1<Su[v[tmp].get(i)]) {
					Su_V[v[tmp].get(i)]=true;
					Su[v[tmp].get(i)]=Su[tmp]+1;
					Q.push(v[tmp].get(i));
				}
			}
		}
		int Su_w=0;
		int Fe_w=0;
		for(int i=1; i<=V; i++) {
			if(Fe[i]<=Su[i]) {
				Fe_w++;
			}
			else {
				Su_w++;
			}
		}
		if(Su_w>=Fe_w) {
			System.out.println("Snuke");
			System.out.flush();
		}
		else {
			System.out.println("Fennec");
			System.out.flush();
		}
	}
	public static class Vec{
		ArrayList <Integer> rinsetu=new ArrayList<Integer>();
		public void add(int V) {
			rinsetu.add(V);
		}
		public void show() {
			for(int i=0; i<rinsetu.size(); i++) {
				System.out.println(rinsetu.get(i));
			}
		}
		public int get(int i) {
			return rinsetu.get(i);
		}
		public int size() {
			return rinsetu.size();
		}
		public int lowerBound(final int value) {
			int low = 0;
			int high = rinsetu.size();
			int mid;
			while (low < high) {
				mid = ((high - low) >>> 1) + low;
				if (rinsetu.get(mid) < value) {
					low = mid + 1;
				} else {
					high = mid;
				}
			}
			if(low<rinsetu.size()) {
				return low;
			}
			else {
				return -1;
			}
		}
	}
}