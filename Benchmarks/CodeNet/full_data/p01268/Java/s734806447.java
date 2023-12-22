// 2150、p番目の素数の和

import java.util.*;
public class Main{
    public  static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);
    int n, p;
    int[] pp;

    void run(){
	boolean[] prime = new boolean[1000000];
	setP(prime);

	while(kbd.hasNext()){
	    n = kbd.nextInt();
	    p = kbd.nextInt();
	    if(n!=-1 && p!=-1){
		solve(prime);
	    }
	}
    }

    void solve(boolean[] prime){
	int[] sum = new int[1000000];
	setSum(sum, prime); 
	Arrays.sort(sum);
	int a = 0;
	while(sum[a]<=0) a++;

	int i=0;
	/*
	while(i<(a+p-1)){
	    System.out.println(i+" "+sum[i]);
	    i++;
	}
	*/
	System.out.println(sum[a+p-1]);
    }

    void setP(boolean[] prime){
	int i, j, k=0;
	pp = new int[100000];
	Arrays.fill(pp, -1);
	Arrays.fill(prime, true);
	prime[0] = false;
	prime[1] = false;
	for(i=2; i<prime.length; i++){
	    if(prime[i]) {
		pp[k] = i;
		k++;
	    }
	    for(j=i+i; j<prime.length; j+=i){
		if(prime[i]) prime[j] = false;
	    }
	}
    }

    void setSum(int[]sum, boolean[] prime){
	int i=0, j=0, a=0, b;
	while(pp[a]<=n) a++;
	for(; pp[a]!=-1 && i<sum.length; a++){
	    b = a;
	    for(; pp[b]!=-1 && i<sum.length; b++){
		sum[i] = pp[a]+pp[b];
		//System.out.println("* "+pp[a]+" "+pp[b]+" "+sum[i]);
		i++;
	    }
	}
    }
}