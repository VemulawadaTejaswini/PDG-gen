import java.util.*;

class Main{
    int n,m,s,g1,g2;
    int[][] d;
    int INF = 700000000;

    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    s = sc.nextInt();
	    g1 = sc.nextInt();
	    g2 = sc.nextInt();
	    if(n==0 && m==0 && s==0 && g1==0 && g2==0)break;

	    d = new int[m+1][m+1];
	    for(int i=0; i<=m; i++) Arrays.fill(d[i],INF);
	    for(int i=0; i<m; i++){
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int c = sc.nextInt();
		d[b1][b2] = c;
	    }
	    for(int i=0; i<=m; i++) d[i][i] = 0;

	    warshall_floyd();

	    int min = INF;
	    for(int i=1; i<=m; i++){
		min = Math.min(min,d[s][i]+d[i][g1]+d[i][g2]);
	    }
	    System.out.println(min);
	}
    }
    
    void warshall_floyd(){
	for(int k=1; k<=m; k++)
	    for(int i=1; i<=m; i++)
		for(int j=1; j<=m; j++)d[i][j] = Math.min(d[i][j],d[i][k]+d[k][j]);
    }

    public static void main(String[] args){
	new Main().solve();
    }
}