import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);


	int[][] h = new int[100][51];
	for(int i=0; i<100; i++) Arrays.fill(h[i], -1);
	int n = 0;
	while(sc.hasNext()){
	    String[] line = sc.next().split(",");
	    for(int i=0; i<line.length; i++){
		h[n][i] = Integer.parseInt(line[i]);
	    }
	    n++;
	}

	for(int i=1; i<n; i++){
	    if(i<=n/2){
		for(int j=0; j<n; j++){
		    if(h[i][j]==-1) break;
		    int num = h[i][j];
		    h[i][j] = Math.max(h[i][j], h[i-1][j]+num);
		    if(j!=0) h[i][j] = Math.max(h[i][j], h[i-1][j-1]+num);
		}
	    }else{
		for(int j=0; j<n; j++){
		    if(h[i][j]==-1) break;
		    int num = h[i][j];
		    h[i][j] = Math.max(h[i][j], h[i-1][j]+num);
		    if(h[i-1][j+1]!=-1) h[i][j] = Math.max(h[i][j], h[i-1][j+1]+num);
		}
	    }
	}

	System.out.println(h[n-1][0]);
    }

    public static void main(String[] args){
	new Main().solve();
    }
}