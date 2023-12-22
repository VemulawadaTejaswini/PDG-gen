import java.util.*;

public class Main{
    int N,M,L,K,A,H;
    int[][] d,cost;
    boolean[][] used;
    int INF = 1000000000;
    List<String> f;

    public static void main(String[] args){
	new Main().solve();
    }

    void solve(){
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	while(N!=0){
	    M = sc.nextInt();
	    L = sc.nextInt();
	    K = sc.nextInt();
	    A = sc.nextInt();
	    H = sc.nextInt();
	    f = new ArrayList<String>();
	    for(int i=0; i<L; i++){
		f.add(sc.nextInt()+"");
	    }
	    f.add(A+"");
	    f.add(H+"");
	    
	    cost = new int[N][N];
	    for(int i=0; i<N; i++){Arrays.fill(cost[i],INF);}
	    for(int i=0; i<K; i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();
		cost[y][x] = t;
		cost[x][y] = t;
	    }

	    d = new int[M+1][N];
	    used = new boolean[M+1][N];

	    dijkstra(A);

	    if(d[M][H]==INF){
		System.out.println("Help!");
	    }else{
		System.out.println(d[M][H]+Math.max(0,d[M][H]-M));
	    }

	    N = sc.nextInt();
	}
    }

    void dijkstra(int s){
	for(int i=0; i<=M; i++){
	    Arrays.fill(d[i],INF);
	}
	d[M][s] = 0;
	int left = M;

	while(true){
	    int v = -1;
	    int minV = INF;
	    for(int i=0; i<=M; i++){
		for(int j=0; j<N; j++){
		    if(!used[i][j] && (v==-1 || d[i][j]<minV)){
			minV = d[i][j];
			v = j;
			left = i;
		    }
		}
	    }

	    if(v==-1)break;

	    used[left][v] = true;

	    for(int i=0; i<N; i++){
		if(left-cost[v][i]<0)continue;
		if(f.contains(i+"")){
		    d[M][i] = Math.min(d[M][i],d[left][v]+cost[v][i]);
		}else{
		    d[left-cost[v][i]][i] = Math.min(d[left-cost[v][i]][i],d[left][v]+cost[v][i]);
		}
	    }
	}
    }
}