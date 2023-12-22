import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    solve();
	}
    }
    
    static void solve(){
	long n = kbd.nextInt();
	long ans = fact(n);
	System.out.println(ans);
    }

    static long fact(long n){
	if(n==1) return 1;
	return n*fact(n-1);
    }
}