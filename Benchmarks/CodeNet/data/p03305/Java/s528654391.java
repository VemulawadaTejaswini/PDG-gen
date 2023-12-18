import java.util.*;

public class Main {
	static int n,m,s,t;
	static int u[],v[],a[],b[],first[],next[];
	static boolean vis[];
	static long yen[],snuuk[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		s = in.nextInt();
		t = in.nextInt();
		u = new int[m * 2 + 5];
		v = new int[m * 2 + 5];
		a = new int[m * 2 + 5];
		b = new int[m * 2 + 5];
		first = new int[m * 2 + 5];
	    next = new int[m * 2 + 5];
	    vis = new boolean[n + 1];
	    yen = new long[n + 1];
	    snuuk = new long[n + 1];
	    Arrays.fill(first, -1);
	    Arrays.fill(yen,1000000000000000l);
	    Arrays.fill(snuuk, 1000000000000000l);
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
	    		if(!vis[v[k]] && yen[u[k]] + a[k] < yen[v[k]]) {
	    			yen[v[k]] = yen[u[k]] + a[k];
	    			queue[tail] = v[k];
	    			vis[v[k]] = true;
	    			tail = (tail + 1) % n;
	    		}
	    		k = next[k];
	    	}
	    	vis[queue[head]] = false;
	    	head = (head + 1) % n;
	    }
	    snuuk[t] = 0;
	    head = tail = 0;
	    Arrays.fill(vis, false);
	    queue[tail ++] = t;
	    vis[t] = true;
	    while(head != tail) {
	    	int k = first[queue[head]];
	    	while(k != -1) {
	    		if(!vis[v[k]] && snuuk[u[k]] + b[k] < snuuk[v[k]]) {
	    			snuuk[v[k]] = snuuk[u[k]] + b[k];
	    			queue[tail] = v[k];
	    			vis[v[k]] = true;
	    			tail = (tail + 1) % n;
	    		}
	    		k = next[k];
	    	}
	    	vis[queue[head]] = false;
	    	head = (head + 1) % n;
	    }
	    for(int i = 1;i <= n;i ++) {
	    	System.out.println(1000000000000000l - yen[i] - snuuk[i]);
	    }
	}
}
