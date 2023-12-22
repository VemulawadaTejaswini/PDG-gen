import java.util.*;

class Main{

    int n;
    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    n = sc.nextInt();
	    if(n==0) break;

	    int[][] p = new int[n][n];
	    for(int i=0; i<n ;i++){
		int m = sc.nextInt();
		for(int j=0; j<m; j++){
		    int num = sc.nextInt();
		    p[i][num-1] = 1;
		}
	    }
	    int k = sc.nextInt();
	    int[] klist = new int[k];
	    for(int i=0; i<k; i++){
		klist[i] = sc.nextInt();
	    }

	    int ans = -1; 
	    for(int i=0; i<n; i++){
		boolean boo = true;
		for(int j=0; j<k; j++){
		    if(p[i][klist[j]-1]==0){
			boo = false;
			break;
		    }
		}
		if(boo && ans==-1)ans = i;
		else if(boo && ans!=-1){
		    ans = -1;
		    break;
		}
	    }
	    if(ans+1==0)ans = -2;
	    System.out.println(ans+1);
	}
    }
    public static void main(String[] args){
	new Main().solve();
    }
}