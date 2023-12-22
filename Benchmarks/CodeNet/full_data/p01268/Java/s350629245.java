// 2150、p番目の素数の和

import java.util.*;
public class Main{
    public  static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);
    int n, p;
    boolean[] prime;
    int[] sum;

    void run(){
        prime = new boolean[1000000];
	setP();
	sum = new int[100000];
	Arrays.fill(sum, Integer.MAX_VALUE);
	while(kbd.hasNext()){
	    n = kbd.nextInt();
	    p = kbd.nextInt();
	    if(n!=-1 && p!=-1){
		solve();
	    }
	}
    }

    void solve(){
	setSum(); 
	Arrays.sort(sum);
	System.out.println(sum[p-1]);
    }

    void setP(){
	int i, j;
	Arrays.fill(prime, true);
	prime[0] = false;
	prime[1] = false;
	for(i=2; i<prime.length; i++){
	    if(prime[i])
		for(j=i+i; j<prime.length; j+=i)
		    prime[j] = false;
	}
    }

    void setSum(){
	int i=0, j=0, a, b;
	for(a=n+1; a<n+300 && i<sum.length; a++){
	    b = a;
	    for(; b<n+300 && i<sum.length; b++){
		if(prime[a] && prime[b]){
		    sum[i] = a+b;
		    //System.out.println("* "+pp[a]+" "+pp[b]+" "+sum[i]);
		    i++;
		}
	    }
	}
    }
}