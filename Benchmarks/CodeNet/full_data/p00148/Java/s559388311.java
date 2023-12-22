import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    String ans;
    int n;

    void run(){
	while(sc.hasNext()){
	    ans = "3C";
	    n = sc.nextInt();
	    if(n!=0) solve();
	}
    }

    void solve(){
	while(n>=39) n = n-39;
	if(n==0) ans += "39";
	else if(n<10) ans += "0"+Integer.toString(n);
	else ans += Integer.toString(n);
	System.out.println(ans);
    }
}