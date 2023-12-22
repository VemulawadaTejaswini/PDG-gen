import java.util.*;

class Main{
    int N;
    int[][] map;
    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    N = sc.nextInt();
	    if(N==0) break;
	    int[][] map = new int[N][N];
	    for(int i=0; i<N; i++) Arrays.fill(map[i],-1);
	    for(int i=1; i<N; i++){
		int n = sc.nextInt();
		int d = sc.nextInt();
		map[n][i] = d;
		if(d==0 || d==1) map[i][n] = d+2;
		else map[i][n] = d-2;
	    }

	    int h = 1;
	    for(int i=0; i<N; i++){
		int nowNum = i; 
		int count = 1;
		for(int j=0; j<N; j++){
		    for(int k=0; k<N; k++){
			if(map[nowNum][k]==2){
			    nowNum = k;
			    count++;
			    break;
			}
		    }
		}
		h = Math.max(h,count);
	    }
	    int w = 1;
	    for(int i=0; i<N; i++){
		int nowNum = i; 
		int count = 1;
		for(int j=0; j<N; j++){
		    for(int k=0; k<N; k++){
			if(map[nowNum][k]==1){
			    nowNum = k;
			    count++;
			    break;
			}
		    }
		}
		w = Math.max(w,count);
	    }

	    System.out.println(h+" "+w);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}