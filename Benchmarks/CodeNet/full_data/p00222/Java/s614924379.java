//配列に入れたらTime Limit Exceededでした.
//直しても直してもTime Limit Exceededですよー!

import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);

    static boolean[] prime = new boolean[10000001];

    public static void main(String[] args){

	prepare();

	while(true){
	    int n = kbd.nextInt();
	    if(n==0) break;
	    solve(n);
	}
    }

    static void prepare(){
	prime[0] = prime[1] = false;
	int i=2;
	for(; i<prime.length; i++){
	    prime[i] = prime(i);   
	}
    }

    static void solve(int n){

	while(!(prime[n] && prime[n-2] && prime[n-6] && prime[n-8])){
	    n--;
	}
	System.out.println(n);
    }

    static boolean prime(int a){
	int k = (int)Math.sqrt(a);
	for(int l=2; l<=k; l++){
	    if(a%l == 0) return false;
	}
	return true;
    }
}