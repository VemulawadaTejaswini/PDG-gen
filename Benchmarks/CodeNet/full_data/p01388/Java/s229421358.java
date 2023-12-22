import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    char[] c;
    int[] KUPC;
    int ans;

    void run(){
	while(sc.hasNext()){
	    c = sc.next().toCharArray();
	    KUPC = new int[4];
	    ans = Integer.MAX_VALUE;
	    solve();
	}
    }

    void solve(){
	for(int i=0; i<c.length; i++){
	    if(c[i]=='K') KUPC[0]++;
	    else if(c[i]=='U') KUPC[1]++;  
	    else if(c[i]=='P') KUPC[2]++; 
	    else if(c[i]=='C') KUPC[3]++;
	}
	for(int i=0; i<KUPC.length; i++)
	    if(KUPC[i]<=ans) ans = KUPC[i];

	System.out.println(ans);
    }
}