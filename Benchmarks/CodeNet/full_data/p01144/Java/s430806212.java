import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int m = kbd.nextInt();
	    if(!(n==0 && m==0)){
		solve(n, m);
	    }
	}
    }

    static void solve(int n, int m){
	int[][] dis = new int[n][2];   // 距離/期待値
	int i, j;
	int ans = 0;
	for(i=0; i<n; i++){
	    dis[i][0] = kbd.nextInt();
	    dis[i][1] = kbd.nextInt();
	    ans += dis[i][0]*dis[i][1];
	}
	//System.out.println("*"+ans);
	sort(dis, n);
	i=0;
	while(i<n && m>0){
	    if(m >= dis[i][0]){
		ans -= dis[i][0]*dis[i][1];
		m -= dis[i][0];
	    }
	    else{
		ans -= m*dis[i][1];
		m = 0;
	    }
	    i++;
	}
	System.out.println(ans);
    }

    static void sort(int[][] d, int n){
	int i, j;
	for(i=0; i<n; i++){
	    for(j=i+1; j<n; j++){
		if(d[i][1]<d[j][1]){
		    int[] w = d[i];
		    d[i] = d[j];
		    d[j] = w;
		}
	    }
	    //System.out.println(d[i][0]+" "+d[i][1]);
	}
    }
}