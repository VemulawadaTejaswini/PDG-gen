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
	m = m % INF;
	while(n>0){
	    if(n>=5){
		n -= 5;
		ans = ans*m*m*m*m*m;
		ans = ans % INF;
	    }
	    else{
		n--;
		ans = ans * m;
		ans = ans % INF;
	    }
	}
	System.out.println(ans);
    }
}