import java.util.*;

public class Main{
    int N,M,L,K,A,H;
    long[][] d;
    boolean[] cancold;
    int INF = 1000000000;

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
	    cancold = new boolean[N];
	    for(int i=0; i<L; i++){
		cancold[sc.nextInt()] = true;
	    }
	    cancold[A] = true; cancold[H] = true;
	    
	    d = new long[N][N];
	    for(int i=0; i<N; i++){Arrays.fill(d[i],INF);}
	    for(int i=0; i<K; i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();
		d[y][x] = t;
		d[x][y] = t;
	    }

	    for(int i=0; i<N; i++)d[i][i] = 0;

	    warshall_floyd();

	    for(int i=0; i<N; i++){
		for(int j=0; j<N; j++){
		    if(d[i][j]>M || !(cancold[i] && cancold[j])){
			d[i][j] = INF;
		    }
		}
	    }

	    warshall_floyd();

	    if(d[A][H]==INF){
		System.out.println("Help!");
	    }else{
		System.out.println(d[A][H]+Math.max(0,d[A][H]-M));
	    }

	    N = sc.nextInt();
	}
    }

    void warshall_floyd(){
	for(int k=0; k<N; k++)
	    for(int i=0; i<N; i++)
		for(int j=0; j<N; j++)d[i][j] = Math.min(d[i][j],d[i][k]+d[k][j]);
    }
}