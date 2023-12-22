//配列に入れたらTime Limit Exceededでした.
//直しても直してもTime Limit Exceededですよー!

import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args){

	while(true){
	    int n = kbd.nextInt();
	    if(n==0) break;
	    solve(n);
	}
    }

    static void solve(int n){

	while(!(check(n))){
	    n--;
	}
	System.out.println(n);
    }

    
    static boolean check(int m){
	if(!prime(m)) return false;
	if(!prime(m-2)) return false;
	if(!prime(m-6)) return false;
	if(!prime(m-8)) return false;
	return true;
    }
    
    static boolean prime(int a){
	int k = (int)Math.sqrt(a);
	for(int i=2; i<=k; i++){
	    if(a%i == 0) return false;
	}
	return true;
    }
}