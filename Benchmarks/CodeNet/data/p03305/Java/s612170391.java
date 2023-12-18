import java.util.*;

public class Main {
	static final long all = (long)1e15;
	static int n,m,s,t;
	static int u[],v[],a[],b[],first[],next[];
	static boolean vis[];
	static long yen[],snuuk[],cost[],mincost = all;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		s = in.nextInt();
		t = in.nextInt();
		u = new int[m * 2 + 1];
		v = new int[m * 2 + 1];
		a = new int[m * 2 + 1];
		b = new int[m * 2 + 1];
		first = new int[m * 2 + 1];
	    next = new int[m * 2 + 1];
	    vis = new boolean[n + 1];
	    yen = new long[n + 1];
	    snuuk = new long[n + 1];
	    cost = new long[n + 1];
	    Arrays.fill(first, -1);
	    Arrays.fill(yen,all);
	    Arrays.fill(snuuk, all);
	    for(int i = 0;i < m;i ++) {
	    	u[i] = in.nextInt();
	    	v[i] = in.nextInt();
	    	a[i] = in.nextInt();
	    	b[i] = in.nextInt();
	    	u[i + m] = v[i];
	    	v[i + m] = u[i];
	    	a[i + m] = a[i];
	    	b[i + m] = b[i];
	    	next[i] = first[u[i]];
	    	first[u[i]] = i;
	    	next[i + m] = first[u[i + m]];
	    	first[u[i + m]] = i + m;
	    }
	    yen[s] = 0;
	    int head = 0,tail = 0;
	    int queue[] = new int[n];
	    queue[tail ++] = s;
	    vis[s] = true;
	    while(head != tail) {
	    	int k = first[queue[head]];
	    	while(k != -1) {
	    		if(yen[u[k]] + a[k] < yen[v[k]]) {
	    			yen[v[k]] = yen[u[k]] + a[k];
	    			if(!vis[v[k]]) {
	    				queue[tail] = v[k];
	    			    vis[v[k]] = true;
	    			    tail = (tail + 1) % n;
	    			}
	    		}
	    		k = next[k];
	    	}
	    	vis[queue[head]] = false;
	    	head = (head + 1) % n;
	    }
	    snuuk[t] = 0;
	    head = tail = 0;
	    queue[tail ++] = t;
	    vis[t] = true;
	    while(head != tail) {
	    	int k = first[queue[head]];
	    	while(k != -1) {
	    		if(snuuk[u[k]] + b[k] < snuuk[v[k]]) {
	    			snuuk[v[k]] = snuuk[u[k]] + b[k];
	    			if(!vis[v[k]]) {
	    				queue[tail] = v[k];
	    			    vis[v[k]] = true;
	    			    tail = (tail + 1) % n;
	    			}
	    		}
	    		k = next[k];
	    	}
	    	vis[queue[head]] = false;
	    	head = (head + 1) % n;
	    }
	    for(int i = n;i > 0;i --) {
	    	cost[i - 1] = Math.min(mincost, yen[i] + snuuk[i]);
	    	mincost = Math.min(mincost, cost[i - 1]);
	    	cost[i - 1] = all - cost[i - 1];
	    }
	    for(int i = 0;i < n;i ++) {
	    	System.out.println(cost[i]);
	    }
	}
}
