import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    long m, n;
    long INF = 1000000007;
    long ans;

    void run(){
	while(sc.hasNext()){
	    m = sc.nextLong();
	    n = sc.nextLong();
	    ans = 1;
	    if(m!=0 && n!=0) solve();
	}
    }

    void solve(){
	while(n>0){
	    n--;
	    ans = ans * m;
	    ans = ans % INF;
	}
	System.out.println(ans);
    }
}