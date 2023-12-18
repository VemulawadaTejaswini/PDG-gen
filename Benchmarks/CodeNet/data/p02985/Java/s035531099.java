
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List <Integer>[]L;
	static int []p;
	static int mod = 1000000007;
	static Deque <Integer> que;
	static boolean []visit;
	static long ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		L = new ArrayList [n];
		
		for(int i = 0 ; i < n ;i++) {
			L[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < n-1 ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			L[a].add(b);
			L[b].add(a);
		}
		
		p = new int [k+1];
		p[0] = k;
		
		for(int i = 0 ;i < k; i++) {
			p[i+1] =(p[i] * (k-i))%mod;
		}
		
		que = new ArrayDeque<Integer>();
		visit = new boolean [n];
		visit[0] = true;
		ans = k;
		
		bfs(n,k,0);
		System.out.println(ans);
		

	}
	
	static void bfs(int n ,int k ,int st) {
		if(L[st].size() == 0) {
			return;
		}
		int x = 1;
		for(int num : L[st]) {
			if(!visit[num] ) {
			que.addLast(num);
			visit[num] = true;
			
			if(st == 0) {
				ans = (ans * (k - x))%mod;
			}
			else {
				ans = (ans * (k - x - 1))%mod;
			}
			x++;
			
		}
	}
		
		if(que.isEmpty()) {
			return;
		}
		
		bfs(n,k,que.poll());
	}

}
