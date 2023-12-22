import java.util.*;

class Main{

    int[][] dist;

    void solve(){
	Scanner sc = new Scanner(System.in);
	
	while(true){
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    if(n==0 && m==0) break;

	    dist = new int[n][n];
	    for(int i=0; i<n; i++) Arrays.fill(dist[i], -1);

	    for(int i=0; i<m; i++){
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		int c = sc.nextInt();
		dist[a][b] = c;
		dist[b][a] = c;
	    }

	    System.out.println(dijstra(0, n-1));
	}
    }

    int dijstra(int s, int t){
	//pos, cost, ticket
	PriorityQueue<int[]> 
	    q = new PriorityQueue<int[]>(t, new Comparator<int[]>(){
		    public int compare(int[] a, int[] b){
			return a[1] - b[1];
		    }
		});
	q.add(new int[]{0,0,2});

	boolean[][] v = new boolean[t+1][3];

	while(q.size()>0){
	    int[] qq = q.poll();
	    int pos = qq[0], cost = qq[1], ticket = qq[2];

	    if(pos==t && ticket!=1) return cost;

	    if(v[pos][ticket]) continue;
	    v[pos][ticket] = true;

	    for(int i=0; i<=t; i++){
		if(dist[pos][i]==-1) continue;
		if(ticket==1){
		    q.add(new int[]{i, cost, 0});
		    continue;
		}
		if(ticket==2) q.add(new int[]{i, cost, 1});
		q.add(new int[]{i,cost+dist[pos][i], ticket});
	    }
	}

	return -1;
    }

    public static void main(String[] args){
	new Main().solve();
    }
}