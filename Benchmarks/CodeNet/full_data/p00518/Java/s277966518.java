import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, ans;
    int mod = 10007;
    String s;
    char[] c;
    int[][] dp;


    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    s = sc.next();
	    dp = new int[n+1][8];
	    for(int i=0; i<=n; i++)
		Arrays.fill(dp[i], -1);
	    c = s.toCharArray();

	    for(int i=0; i<8; i++){
		search(n, i);
		ans += dp[n][i];
		if(ans>=mod) ans-=mod;
	    }

	    //show();
	    System.out.println(ans);
	}
    }

    /*
      1. テ・ツスツ禿ヲツ猟・テ」ツ?ョティツイツャテ、ツサツサティツ??」ツ?古」ツ??」ツつ凝」ツ?禿」ツ?ィ
      2. テ・ツ可催ヲツ猟・テ」ツ?ィテ・ツスツ禿ヲツ猟・テ、ツクツ。テヲツ鳴ケテ」ツ?ォテ・ツ渉づ・ツ環?」ツ?療」ツ?ヲテ」ツ??」ツつ凝、ツコツコテ」ツ?古」ツ??」ツつ凝」ツ?禿」ツ?ィ
     */
    void search(int x, int y){
	if(x==0) {
	    if( y!=1 ){ // *1
		dp[x][y]=0;
		return;
	    }
	    dp[x][y] = 1;
	    return;
	}


	int l = c[x-1]=='J' ? 0 : c[x-1]=='O' ? 1 : 2;
	if( ((y>>l)&1) == 0 ){ // *1
	    if(dp[x][y]==-1) dp[x][y]=0;
	    return;
	}
	
	for(int k=0; k<8; k++){ //テヲツ伉ィテヲツ猟・
	    if(dp[x-1][k]==-1) search(x-1, k);
	    if( (y&k) == 0){ // *2
		if(dp[x][y]==-1) dp[x][y]=0;
		continue;
	    }
	    
	    dp[x][y] += dp[x-1][k];
	    if(dp[x][y]>=mod) dp[x][y]-=mod;
	}
    }

    void show(){
	for(int i=0; i<=n; i++){
	    for(int k=0; k<8; k++)
		System.out.printf("%5d ", dp[i][k]);
	    System.out.println();
	}
	System.out.println("-----------------");
    }
}