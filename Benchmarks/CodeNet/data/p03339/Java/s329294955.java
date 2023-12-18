
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;
	/* static int java.util.Arrays.binarySearch(int[] a, int key); */
import java.math.BigDecimal;
	



public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	String s;
	public void run(){
		n = sc.nextInt();
		s = sc.next();
		solve();
	}
	public void solve(){
		int muki[] = new int[n];
		int ep[] = new int[n]; //e[i]:iがリーダのとき、東を向かなければいけない人の数=リーダより左にいて西を向いている人
		int wp[] = new int[n]; //w[i]:iがリーダのとき、西を向かなければ行けない人の数=リーダより右にいる東を向いている人
		
		for(int i = 0; i < n; i++){
			String now = s.substring(i,  i+1);
			if(now.equals("W")){
				muki[i] = -1;
			}
			else{
				muki[i] = 1;
			}
		}
		
		for(int i = 1; i < n; i++){
			if(muki[i-1] == -1){
				ep[i] = ep[i-1] + 1;
			}
			else{
				ep[i] = ep[i-1];
			}
			
			if(muki[n-i] == 1){
				wp[n-i-1] = wp[n-i] + 1;
			}
			else{
				wp[n-i-1] = wp[n-i];
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			if(ans > ep[i] + wp[i]){
				ans = ep[i] + wp[i];
			}
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }
	static class Edge{
		int to, cost;
		public Edge(int a, int b){
			this.to = a;
			this.cost = b;
		}
	}
	class MyComparator implements Comparator {
		@Override
		public int compare (Object arg0, Object arg1) {
			int x = ((Pair)arg0).first;
			int y = ((Pair)arg1).first;
			
			if (x < y) {
				return 1;
			} else if (x > y) {
				return -1;
			} else{
				return 0;
			}
		}
	}
	static class UnionFind{
		int par[];
		int rank[];
		
		//n要素で初期化
		public UnionFind(int maxn){
			par = new int[maxn];
			rank = new int[maxn];
			
			for(int i = 0; i < maxn; i++){
				par[i] = i;
				rank[i] = 0;
			}
		}
		
		//木の根を求める
		int find(int x){
			if(par[x] == x){
				return x;
			}
			else {
				return par[x] = find(par[x]);
			}
		}
		
		// xとyの属する集合を併合
		void unite (int x, int y){
			x = find(x);
			y = find(y);
			if(x == y){
				return;
			}
			
			if(rank[x] < rank[y]){
				par[x] = y;
			}
			else{
				par[y] = x;
				if(rank[x] == rank[y]) rank[x]++;
			}
		}
		
		// xとyが同じ集合に属するか否か
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	
}
